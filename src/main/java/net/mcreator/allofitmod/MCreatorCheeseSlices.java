
package net.mcreator.allofitmod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

@Elementsallofitmod.ModElement.Tag
public class MCreatorCheeseSlices extends Elementsallofitmod.ModElement {
	@ObjectHolder("allofitmod:cheeseslices")
	public static final Item block = null;
	public MCreatorCheeseSlices(Elementsallofitmod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorAllofItTab.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(1).saturation(0.4f).setAlwaysEdible().build()));
			setRegistryName("cheeseslices");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 2;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				MCreatorCheeseSliceremovepotioneffect.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
