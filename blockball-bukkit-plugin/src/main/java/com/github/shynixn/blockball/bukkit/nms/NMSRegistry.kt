package com.github.shynixn.blockball.bukkit.nms

import com.github.shynixn.ball.bukkit.core.nms.VersionSupport
import com.github.shynixn.blockball.api.business.entity.VirtualArmorstand
import org.bukkit.Location
import org.bukkit.entity.Player

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
class NMSRegistry {

    companion object {

        /**
         * Creates a new [VirtualArmorstand] from the given [location] [id] [data] for the viewer [player].
         */
        fun createVirtualArmorstand(player: Player, location: Location, id: Int, data: Int): VirtualArmorstand {
            val clazz = Class.forName("com.github.shynixn.blockball.bukkit.nms.VERSION.DisplayArmorstand".replace("VERSION", VersionSupport.getServerVersion().versionText))
            val constructor = clazz.getDeclaredConstructor(Player::class.java, Location::class.java, Int::class.java, Int::class.java)
            return constructor.newInstance(player, location, id, data) as VirtualArmorstand
        }
    }
}