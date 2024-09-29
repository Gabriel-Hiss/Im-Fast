package com.biel.mod.mixin;

import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerGamePacketListenerImpl.class)
public class VelocityMixin {
    @ModifyConstant(method = "handleMovePlayer", constant = @Constant(floatValue = 100.0F))
    private float imfast_PlayerMaxSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    @ModifyConstant(method = "handleMovePlayer", constant = @Constant(floatValue = 300.0F))
    private float imfast_ElytraMaxSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    @ModifyConstant(method = "handleMoveVehicle", constant = @Constant(doubleValue = 100.0))
    private double imfast_VehicleMaxSpeed(double speed) {
        return Double.MAX_VALUE;
    }
}