package net.mcreator.testagain;

import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.Entity;

@Elementstestagain.ModElement.Tag
public class MCreatorCheeseMuncherPlayerCollidesWithThisEntity extends Elementstestagain.ModElement {
	public MCreatorCheeseMuncherPlayerCollidesWithThisEntity(Elementstestagain instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCheeseMuncherPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vec3d(0.25D, (double) 0.05F, 0.25D));
	}
}
