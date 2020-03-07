
package net.mcreator.testagain;

@Elementstestagain.ModElement.Tag
public class MCreatorBlockOcheese extends Elementstestagain.ModElement {

	@ObjectHolder("testagain:blockocheese")
	public static final Block block = null;

	public MCreatorBlockOcheese(Elementstestagain instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.SNOW).sound(SoundType.SLIME).hardnessAndResistance(1f, 10f).lightValue(0).tickRandomly());

			setRegistryName("blockocheese");
		}

		@Override
		public int tickRate(IWorldReader world) {
			return 1;
		}

		@Override
		public MaterialColor getMaterialColor(BlockState state, IBlockReader blockAccess, BlockPos pos) {
			return MaterialColor.GOLD;
		}

		@Override
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
