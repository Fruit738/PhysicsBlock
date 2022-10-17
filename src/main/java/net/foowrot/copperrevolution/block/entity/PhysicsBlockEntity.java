package net.foowrot.copperrevolution.block.entity;

import dev.lazurite.rayon.api.EntityPhysicsElement;
import dev.lazurite.rayon.impl.bullet.collision.body.EntityRigidBody;
import dev.lazurite.rayon.impl.bullet.collision.space.block.BlockProperty;
import net.foowrot.copperrevolution.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class PhysicsBlockEntity extends BlockEntity implements EntityPhysicsElement {

    private final EntityRigidBody rigidBody = new EntityRigidBody(this);

    public PhysicsBlockEntity(BlockPos pos, BlockState state) {
         super(ModBlockEnitites.PHYSICS_BLOCK, pos, state);
            this.rigidBody.setMass(10);
            BlockProperty.addBlockProperty(ModBlocks.PHYSICS_BLOCK, 0.75f, 0.25f, true, true);
     }

    @Override
    public EntityRigidBody getRigidBody() {
        return this.rigidBody;
    }

}
