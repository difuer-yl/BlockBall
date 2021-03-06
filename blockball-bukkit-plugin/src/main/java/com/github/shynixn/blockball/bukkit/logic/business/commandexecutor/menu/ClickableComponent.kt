package com.github.shynixn.blockball.bukkit.logic.business.commandexecutor.menu

import org.bukkit.ChatColor

/**
 * Enum for different clickable components in the chat ui.
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
enum class ClickableComponent(
        /*** Returns the displayed text of the component.*/
        val text: String,
        /*** Returns the displayed color of the component.*/
        val color: ChatColor) {

    WORLDEDIT(" [worldedit..]", ChatColor.GOLD),
    EDIT(" [edit..]", ChatColor.GREEN),
    COPY_ARMOR(" [copy armor..]", ChatColor.GOLD),
    COPY_INVENTORY(" [copy inventory..]", ChatColor.GOLD),
    PAGE(" [page..]", ChatColor.YELLOW),
    PREVIEW(" [preview..]", ChatColor.GRAY),
    ADD(" [add..]", ChatColor.BLUE),
    DELETE(" [delete..]", ChatColor.DARK_RED),
    SELECT(" [select..]", ChatColor.AQUA),
    LOCATION(" [location..]", ChatColor.BLUE),

    INVALID(" [page..]", ChatColor.BLACK),
    TOGGLE(" [toggle..]", ChatColor.LIGHT_PURPLE);
}