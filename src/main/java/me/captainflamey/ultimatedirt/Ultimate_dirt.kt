package me.captainflamey.ultimatedirt

import me.captainflamey.ultimatedirt.listeners.DirtDetection
import org.bukkit.plugin.java.JavaPlugin

class ultimateDirt : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("The plugin has loaded")


        registerListeners()
    }

    private fun registerListeners() {
        server.pluginManager.registerEvents(DirtDetection(), this)
        logger.info("Registered Listeners")

    }


    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("The plugin has unloaded")
    }
}
