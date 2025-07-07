package eu.mklsmp.mod.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Constant;

@Mixin(MinecraftServer.class)
public abstract class ServerNameMixin {
    @ModifyConstant(
        method = "createCommandSourceStack",
        constant = @Constant(stringValue = "Server")
    )
    private String replaceServerString(String original) {
        return "Allah";
    }
}
