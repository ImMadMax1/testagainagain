
package net.mcreator.testagain;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.allofitmod.MCreatorCheeseBomb;

@Elementstestagain.ModElement.Tag
public class MCreatorAllofItTab extends Elementstestagain.ModElement {
	public MCreatorAllofItTab(Elementstestagain instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taballofittab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MCreatorCheeseBomb.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
