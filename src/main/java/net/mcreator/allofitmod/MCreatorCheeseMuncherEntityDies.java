package net.mcreator.allofitmod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

@Elementsallofitmod.ModElement.Tag
public class MCreatorCheeseMuncherEntityDies extends Elementsallofitmod.ModElement {
	public MCreatorCheeseMuncherEntityDies(Elementsallofitmod instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCheeseMuncherEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCheeseMuncherEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCheeseMuncherEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCheeseMuncherEntityDies!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorBlockOcheese.block.getDefaultState(), 3);
	}
}
