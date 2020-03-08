package net.mcreator.testagain;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;

@Elementstestagain.ModElement.Tag
public class MCreatorCheeseBombBulletHitsBlock extends Elementstestagain.ModElement {
	public MCreatorCheeseBombBulletHitsBlock(Elementstestagain instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCheeseBombBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCheeseBombBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCheeseBombBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCheeseBombBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorBlockOcheese.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), MCreatorBlockOcheese.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 2), (int) (z + 2)), MCreatorBlockOcheese.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 3), (int) (z + 3)), MCreatorBlockOcheese.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 4), (int) (y + 4), (int) (z + 4)), MCreatorBlockOcheese.block.getDefaultState(), 3);
	}
}
