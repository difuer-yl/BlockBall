package com.github.shynixn.blockball.bukkit.logic.business.helper

import com.github.shynixn.ball.bukkit.core.nms.VersionSupport
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import java.lang.StringBuilder
import java.lang.reflect.Method
import java.util.logging.Level

/**
 * Created by Shynixn 2018.
 * <p>
 * Version 1.2
 * <p>
 * MIT License
 * <p>
 * Copyright (c) 2018 by Shynixn
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
object ModtHelper {
    private var setModtMethod: Method? = null
    private var getServerConsoleMethod: Method? = null

    /**
     * Sets the server modt to the given [text].
     */
    fun setModt(text: String) {
        try {
            val builder = StringBuilder("[")
            builder.append((text.replace("[", "").replace("]", "")))
            builder.append(ChatColor.RESET.toString())
            builder.append("]")
            if (setModtMethod == null) {
                val minecraftServerClazz = Class.forName("net.minecraft.server.VERSION.MinecraftServer".replace("VERSION", VersionSupport.getServerVersion().versionText))
                val craftServerClazz = Class.forName("org.bukkit.craftbukkit.VERSION.CraftServer".replace("VERSION", VersionSupport.getServerVersion().versionText))

                setModtMethod = minecraftServerClazz.getDeclaredMethod("setMotd", String::class.java)
                getServerConsoleMethod = craftServerClazz.getDeclaredMethod("getServer")
            }

            val console = getServerConsoleMethod!!.invoke(Bukkit.getServer())
            setModtMethod!!.invoke(console, ChatColor.translateAlternateColorCodes('&',builder.toString()))
        } catch (e: Exception) {
            Bukkit.getLogger().log(Level.WARNING, "Failed to set log.", e)
        }
    }
}
