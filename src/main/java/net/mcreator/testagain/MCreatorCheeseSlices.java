
package net.mcreator.testagain;

@Elementstestagain.ModElement.Tag
public class MCreatorCheeseSlices extends Elementstestagain.ModElement {

	@ObjectHolder("testagain:cheeseslices")
	public static final Item block = null;

	public MCreatorCheeseSlices(Elementstestagain instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(16).food((new Food.Builder()).hunger(1).saturation(0.4f).setAlwaysEdible()

					.build()));
			setRegistryName("cheeseslices");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 100;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
