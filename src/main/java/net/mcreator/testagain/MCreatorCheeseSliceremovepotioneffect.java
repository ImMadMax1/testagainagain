package net.mcreator.testagain;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementstestagain.ModElement.Tag
public class MCreatorCheeseSliceremovepotioneffect extends Elementstestagain.ModElement {
	public MCreatorCheeseSliceremovepotioneffect(Elementstestagain instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCheeseSliceremovepotioneffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
