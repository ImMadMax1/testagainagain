package net.mcreator.testagain;

@Elementstestagain.ModElement.Tag
public class MCreatorKindaQuirkyDoeOnBlockRightClicked extends Elementstestagain.ModElement {

	public MCreatorKindaQuirkyDoeOnBlockRightClicked(Elementstestagain instance) {
		super(instance, 4);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorKindaQuirkyDoeOnBlockRightClicked!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.remove();

	}

}
