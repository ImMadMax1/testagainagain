
package net.mcreator.allofitmod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsallofitmod.ModElement.Tag
public class MCreatorKnife extends Elementsallofitmod.ModElement {
	@ObjectHolder("allofitmod:knife")
	public static final Item block = null;
	public MCreatorKnife(Elementsallofitmod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, 0.1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("knife"));
	}
}
