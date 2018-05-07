package com.github.shynixn.blockball.bukkit.logic.persistence.entity.meta.misc

import com.github.shynixn.blockball.api.business.enumeration.PlaceHolder
import com.github.shynixn.blockball.api.persistence.entity.basic.StorageLocation
import com.github.shynixn.blockball.api.persistence.entity.meta.misc.ActiveSpectatorMeta
import org.bukkit.ChatColor
import org.bukkit.GameMode

/**
 * Copyright 2017 Shynixn
 * <p>
 * Do not remove this header!
 * <p>
 * Version 1.0
 * <p>
 * MIT License
 * <p>
 * Copyright (c) 2017
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
class ActiveSpectatorData : ActiveSpectatorMeta {
    /** Is the spectator mode available to be used. **/
    override var enabled: Boolean = true
    /** Joining the spectator mode asking message. */
    override var joinMessage: MutableList<String> = arrayListOf("Do you want to spectate this match?", ChatColor.LIGHT_PURPLE.toString() + "[Spectate]")
    /** Minecraft gamemode (Survival, Adventure, Creative) the players should be. */
    override var gamemode: Enum<*> = GameMode.SPECTATOR
    /** Spawnpoint of the player when joining the spectator mode. */
    override var spawnpoint: StorageLocation? = null
    /** List of signs which can be clicked to join the spectator mode. */
    override val joinSigns: MutableList<StorageLocation> = ArrayList()
    /** Lines displayed on the sign for joining the spectator mode. */
    override var joinSignLines: List<String> = arrayListOf("&lBlockBall", PlaceHolder.ARENA_DISPLAYNAME.placeHolder, ChatColor.LIGHT_PURPLE.toString()+"Spectate", PlaceHolder.ARENA_SUM_CURRENTPLAYERS.placeHolder+'/'+PlaceHolder.ARENA_SUM_MAXPLAYERS.placeHolder)
}