package eu.mklsmp.mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.server.command.SayCommand;


@Mixin(SayCommand.class)
public class SayCommandMixin {
    @ModifyConstant(
        method = "execute",
        constant = @Constant(stringValue = "[Server]")
    )
    private static String modifyServerPrefix(String original) {
        return "[Allah]";
    }
}
