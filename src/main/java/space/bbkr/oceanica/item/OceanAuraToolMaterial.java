package space.bbkr.oceanica.item;

import space.bbkr.oceanica.Oceanica;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public class OceanAuraToolMaterial implements ToolMaterial {
	private static final Lazy<Ingredient> REPAIR = new Lazy<>(() -> Ingredient.ofItems(Oceanica.OCEANIC_QUARTZ));

	@Override
	public int getDurability() {
		return 250;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 6F;
	}

	@Override
	public float getAttackDamage() {
		return 2F;
	}

	@Override
	public int getMiningLevel() {
		return 20;
	}

	@Override
	public int getEnchantability() {
		return 14;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return REPAIR.get();
	}
}
