package com.pascoli.windowsmod.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

public class WindowBlock extends HorizontalDirectionalBlock {
	public static final BooleanProperty	OPEN	= BlockStateProperties.OPEN;
	public static final BooleanProperty	POWERED	= BlockStateProperties.POWERED;
	private final SoundEvent openSound;
	private final SoundEvent closeSound;

	public WindowBlock(BlockBehaviour.Properties pProperties, WoodType pType) {
		this(pProperties.sound(pType.soundType()), pType.fenceGateOpen(), pType.fenceGateClose());
	}

	public WindowBlock(BlockBehaviour.Properties props, SoundEvent openSound, SoundEvent closeSound) {
		super(props);
		this.openSound = openSound;
		this.closeSound = closeSound;
		this.registerDefaultState(this.stateDefinition.any().setValue(OPEN, Boolean.valueOf(false)));
	}

	public static final VoxelShape SHAPE = Block.box(1, 1, 1, 15, 15, 15);
	@Override public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) { return SHAPE; }
	@Override public RenderShape getRenderShape(BlockState pState) { return RenderShape.MODEL; }


	/* DOES NOT WORK
	public static final VoxelShape	FRAME_SHAPE			= Block.box(0,0,7,15,15,8);
	public static final VoxelShape	LEFT_SHUTTER_SHAPE	= Block.box(-8,0,-1,0,16,0);
	public static final VoxelShape	RIGH_SHUTTER_SHAPE	= Block.box(8,0,-1,15,15,0);
	public static final VoxelShape	INTERACT_SHAPE_OPEN	= Shapes.or(FRAME_SHAPE,LEFT_SHUTTER_SHAPE,RIGH_SHUTTER_SHAPE);
	@Override
	public VoxelShape getInteractionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos)
	{
		return INTERACT_SHAPE_OPEN;
	}
	 */

	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
	}

	@Override
	public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType)
	{
		return false;
	}

	@Override
	public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
		pState = pState.setValue(OPEN, Boolean.valueOf(!pState.getValue(OPEN)));
		pLevel.setBlock(pPos, pState, 10);
		boolean flag = pState.getValue(OPEN);
		pLevel.playSound(pPlayer, pPos, flag ? this.openSound : this.closeSound, SoundSource.BLOCKS, 0.5F, pLevel.getRandom().nextFloat() * 0.1F + 0.9F);
		pLevel.gameEvent(pPlayer, flag ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
		return InteractionResult.sidedSuccess(pLevel.isClientSide);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder)
	{
		pBuilder.add(FACING,OPEN,POWERED);
	}

	public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos, Block pBlock, BlockPos pFromPos, boolean pIsMoving) {
		if (!pLevel.isClientSide) {
			boolean flag = pLevel.hasNeighborSignal(pPos);
			if (pState.getValue(POWERED) != flag) {
				pLevel.setBlock(pPos, pState.setValue(POWERED, Boolean.valueOf(flag)).setValue(OPEN, Boolean.valueOf(flag)), 2);
				if (pState.getValue(OPEN) != flag) {
					pLevel.playSound((Player)null, pPos, flag ? this.openSound : this.closeSound, SoundSource.BLOCKS, 1.0F, pLevel.getRandom().nextFloat() * 0.1F + 0.9F);
					pLevel.gameEvent((Entity)null, flag ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pPos);
				}
			}

		}
	}
}
