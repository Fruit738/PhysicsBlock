package net.foowrot.copperrevolution.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.foowrot.copperrevolution.CopperRevolution;
import net.foowrot.copperrevolution.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEnitites
{
    public static BlockEntityType<PhysicsBlockEntity> PHYSICS_BLOCK;

    public static void registerBlockEnities() {
        PHYSICS_BLOCK = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(CopperRevolution.MOD_ID, "physics_mod"),
                FabricBlockEntityTypeBuilder.create(PhysicsBlockEntity::new,
                        ModBlocks.PHYSICS_BLOCK).build(null));
    }
}
