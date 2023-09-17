package me.captainflamey.ultimatedirt.listeners

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPlaceEvent

class ExplosiveDirt : Listener {

    @EventHandler
    fun onBlockPlace(event: BlockPlaceEvent) {


        if(event.player.inventory.itemInMainHand.type == Material.DIRT) {
            val player = event.player
            val w = player.world
            w.createExplosion(event.blockPlaced.location, 3.0f, false)

        }
    }
}