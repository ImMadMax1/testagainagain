package net.mcreator.testagain;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.IProperty;
import net.minecraft.block.BlockState;

import java.util.Map;

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
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.BREAK);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
		{
			BlockPos _bp = new BlockPos((int) (x + (Math.random() * 3)), (int) (y - (Math.random() * 3)), (int) (z + (Math.random() * 3)));
			BlockState _bs = MCreatorBlockOcheese.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_bs.has(_property))
					_bs = _bs.with(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
