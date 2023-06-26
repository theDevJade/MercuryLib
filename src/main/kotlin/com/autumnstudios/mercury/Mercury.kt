package com.autumnstudios.mercury

import org.bukkit.plugin.java.JavaPlugin

class Mercury : JavaPlugin() {

    companion object{
        lateinit var instance: Mercury
    }

    override fun onEnable() {
        instance = this
    }

    override fun onDisable() {

    }
}