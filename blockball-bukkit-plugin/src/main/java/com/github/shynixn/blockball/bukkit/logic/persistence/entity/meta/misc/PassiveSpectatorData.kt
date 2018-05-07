package com.github.shynixn.blockball.bukkit.logic.persistence.entity.meta.misc

import com.github.shynixn.blockball.api.persistence.entity.meta.misc.PassiveSpectatorMeta
import com.github.shynixn.blockball.bukkit.logic.business.helper.YamlSerializer

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
class PassiveSpectatorData : PassiveSpectatorMeta {
    /** Is the spectator mode available to be used. **/
    @YamlSerializer.YamlSerialize(orderNumber = 1, value = "enabled")
    override var enabled: Boolean = false
    /** Radius where nearby players receive ingame messages. */
    @YamlSerializer.YamlSerialize(orderNumber = 2, value = "radius")
    override val radius: Int = 50
}