
package net.mcreator.testagain;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@Elementstestagain.ModElement.Tag
public class MCreatorAllofittab extends Elementstestagain.ModElement {
	public MCreatorAllofittab(Elementstestagain instance) {
		super(instance, 9);
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
