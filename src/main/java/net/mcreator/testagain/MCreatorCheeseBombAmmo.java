
package net.mcreator.testagain;

@Elementstestagain.ModElement.Tag
public class MCreatorCheeseBombAmmo extends Elementstestagain.ModElement {

	@ObjectHolder("testagain:cheesebombammo")
	public static final Item block = null;

	public MCreatorCheeseBombAmmo(Elementstestagain instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MCreatorF.tab).maxStackSize(64));
			setRegistryName("cheesebombammo");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Ammo for the cheese bomb."));
		}

	}

}
