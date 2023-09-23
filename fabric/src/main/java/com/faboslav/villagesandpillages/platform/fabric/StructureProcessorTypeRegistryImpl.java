package com.faboslav.villagesandpillages.platform.fabric;

import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StructureProcessorTypeRegistryImpl
{
	public static void registerStructureProcessorType(
		Identifier identifier,
		StructureProcessorType<? extends StructureProcessor> structureProcessorType
	) {
		Registry.register(Registry.STRUCTURE_PROCESSOR, identifier, structureProcessorType);
	}

	public static void postInit() {

	}
}
