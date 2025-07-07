package eu.mklsmp.mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public abstract class ServerNameMixin {
    @ModifyConstant(
        method = "getCommandSource",
        constant = @Constant(stringValue = "Server")
    )
    private String replaceServerString(String original) {
        return "Allah";
    }
}
