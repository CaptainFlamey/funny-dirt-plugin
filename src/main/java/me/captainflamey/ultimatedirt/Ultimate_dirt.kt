package me.captainflamey.ultimatedirt

import me.captainflamey.ultimatedirt.listeners.madeyoulook
import org.bukkit.plugin.java.JavaPlugin

class Ultimate_dirt : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("The plugin has loaded")


        registerListeners()
    }


    private fun registerListeners() {
        server.pluginManager.registerEvents(madeyoulook(), this)
        logger.info("Registered Listeners")
    }


    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("The plugin has unloaded")
    }
}
