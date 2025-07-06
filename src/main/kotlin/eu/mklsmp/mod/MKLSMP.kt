package eu.mklsmp.mod

import com.mojang.brigadier.CommandDispatcher
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback
import net.minecraft.server.command.CommandManager.literal
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.text.Text
import org.slf4j.LoggerFactory

object MKLSMP : ModInitializer {
    private val logger = LoggerFactory.getLogger("mkl-smp")
    override fun onInitialize() {
        CommandRegistrationCallback.EVENT.register(
                CommandRegistrationCallback {
                        dispatcher: CommandDispatcher<ServerCommandSource>,
                        _,
                        _ ->
                    dispatcher.register(
                            literal("racist").executes { context ->
                                val player = context.source.player
                                if (player != null) {
                                    player.networkHandler.disconnect(
                                            Text.literal("What the fuck is wrong with you?")
                                    )
                                    1
                                } else {
                                    context.source.sendError(
                                            Text.literal(
                                                    "This command can only be used by a player."
                                            )
                                    )
                                    0
                                }
                            }
                    )
                }
        )
        logger.info("MKL-SMP mod loaded")
    }
}
