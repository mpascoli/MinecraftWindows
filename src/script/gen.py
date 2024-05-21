#!/usr/bin/env python3

###############################################################################
import	os
import	sys
###############################################################################
kWoods  	= ['acacia','bamboo','birch','cherry','crimson','dark_oak','jungle','mangrove','oak','spruce','warped']
kResources	= '../main/resources'
kAssets		= f'{kResources}/assets/windowsmod'
kData		= f'{kResources}/data/windowsmod'
###############################################################################
def makeDirForFile(f:str) -> None:
	dirName = os.path.dirname(f)
	os.makedirs(dirName,exist_ok=True)
def transfile(src:str, dst:str, w:str) -> None:
	makeDirForFile(dst)
	with open(src,'r') as fin:
		with open(dst,'w') as fout:
			for line in fin:
				line = line.replace('WOOD',w)
				fout.write(line)
def main():
	root = os.path.dirname(sys.argv[0])
	for w in kWoods:
		transfile(f'{root}/blockstate',f'{root}/{kAssets}/blockstates/{w}_window_block.json',w)
		transfile(f'{root}/block_model',f'{root}/{kAssets}/models/block/{w}_window_block.json',w)
		transfile(f'{root}/block_open_model',f'{root}/{kAssets}/models/block/{w}_window_block_open.json',w)
		transfile(f'{root}/item_model',f'{root}/{kAssets}/models/item/{w}_window_block.json',w)
		transfile(f'{root}/recipe',f'{root}/{kData}/recipes/{w}_window_item.json',w)
		transfile(f'{root}/loot_table',f'{root}/{kData}/loot_tables/blocks/{w}_window_block.json',w)
###############################################################################
if __name__ == '__main__':
	main()
###############################################################################
# vim: ts=4 sw=0 noet: #
