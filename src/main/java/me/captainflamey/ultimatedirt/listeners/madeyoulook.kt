package me.captainflamey.ultimatedirt.listeners

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.Material
import org.bukkit.block.BlockFace
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

var dount = false
class madeyoulook : Listener{

    @EventHandler
    fun playerBlockEvent(event: PlayerMoveEvent) {
        val player = event.player

        val b = player.location.block.getRelative(BlockFace.DOWN)

        if (b.type == Material.DIRT) {
            if (!dount) {
                player.sendMessage(
                    Component.text("Made You Look").color(TextColor.color(0, 255, 255)).decorate(TextDecoration.BOLD)
                        .decorate(TextDecoration.ITALIC)
                )
                dount = true
            }
        }
        else {
            dount = false


        }
    }

}