package me.captainflamey.ultimatedirt

import org.bukkit.plugin.java.JavaPlugin

class Ultimate_dirt : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("The plugin has loaded")


        registerListeners()
    }


    private fun registerListeners() {
        server.pluginManager.registerEvents(MadeYouLookDirt(), this)
        logger.info("Registered Listeners")
    }


    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("The plugin has unloaded")
    }
}
