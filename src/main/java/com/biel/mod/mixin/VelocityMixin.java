package com.biel.mod.mixin;

// Minecraft
import net.minecraft.server.network.ServerGamePacketListenerImpl;
// Mixin
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;


@Mixin(ServerGamePacketListenerImpl.class)
public class VelocityMixin {
    // Moved Quickly
    @ModifyConstant(method = "handleMovePlayer", constant = @Constant(floatValue = 100.0F))
    private float imfast_PlayerMaxSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    // Moved Quickly
    @ModifyConstant(method = "handleMovePlayer", constant = @Constant(floatValue = 300.0F))
    private float imfast_ElytraMaxSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    // Moved Quickly
    @ModifyConstant(method = "handleMoveVehicle", constant = @Constant(doubleValue = 100.0))
    private double imfast_VehicleMaxSpeed(double speed) {
        return Double.MAX_VALUE;
    }

    // Moved Wrongly
    @ModifyConstant(method = "handleMovePlayer", constant = @Constant(doubleValue = 0.0625D))
    private double imfast_MovedWrong(double speed) {
        return Double.MAX_VALUE;
    }
}