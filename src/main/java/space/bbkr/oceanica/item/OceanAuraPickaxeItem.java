package space.bbkr.oceanica.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import net.fabricmc.fabric.api.tool.attribute.v1.DynamicAttributeTool;

public class OceanAuraPickaxeItem extends PickaxeItem implements DynamicAttributeTool {
	public OceanAuraPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
		super(material, attackDamage, attackSpeed, settings);
	}
}
