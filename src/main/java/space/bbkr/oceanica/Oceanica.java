package space.bbkr.oceanica;

import space.bbkr.oceanica.item.OceanAuraPickaxeItem;
import space.bbkr.oceanica.item.OceanAuraToolMaterial;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class Oceanica implements ModInitializer {

	public static Block OCEANIC_QUARTZ_ORE;
	public static Item OCEANIC_QUARTZ;
	public static Item OCEAN_AURA_PICKAXE;

	@Override
	public void onInitialize() {
		System.out.println("Oceanica is initializing!");
		OCEANIC_QUARTZ_ORE = register("oceanic_quartz_ore", new Block(FabricBlockSettings.copyOf(Blocks.SAND).breakByTool(FabricToolTags.SHOVELS)), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
		OCEANIC_QUARTZ = register("oceanic_quartz", new Item(new Item.Settings().group(ItemGroup.MISC)));
		OCEAN_AURA_PICKAXE = register("ocean_aura_pickaxe", new OceanAuraPickaxeItem(new OceanAuraToolMaterial(), 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS)));
	}

	private static Block register(String name, Block block) {
		return Registry.register(Registry.BLOCK, new Identifier("oceanica", name), block);
	}

	private static Block register(String name, Block block, Item.Settings settings) {
		Registry.register(Registry.ITEM, new Identifier("oceanica", name), new BlockItem(block, settings));
		return Registry.register(Registry.BLOCK, new Identifier("oceanica", name), block);
	}

	private static Item register(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier("oceanica", name), item);
	}
}
