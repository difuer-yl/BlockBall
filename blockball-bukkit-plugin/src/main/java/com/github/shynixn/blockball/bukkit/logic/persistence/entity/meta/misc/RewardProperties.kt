package com.github.shynixn.blockball.bukkit.logic.persistence.entity.meta.misc

import com.github.shynixn.blockball.api.persistence.entity.meta.misc.CommandMeta
import com.github.shynixn.blockball.api.persistence.entity.meta.misc.RewardMeta
import com.github.shynixn.blockball.bukkit.logic.business.helper.YamlSerializer
import com.github.shynixn.blockball.bukkit.logic.persistence.entity.PersistenceObject

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
class RewardProperties : PersistenceObject(), RewardMeta {
    /** Money which gets added via Vault when a player does a rewarded action. */
    @YamlSerializer.YamlSerialize(orderNumber = 1, value = "money-reward")
    override var moneyReward: MutableMap<RewardMeta.RewardedAction, Int> = HashMap()
    /** Commands which get executed when a player does a rewarded action. */
    override var commandReward: MutableMap<RewardMeta.RewardedAction, CommandMeta>
        get() = internalCommandReward as MutableMap<RewardMeta.RewardedAction, CommandMeta>
        set(value) {
            internalCommandReward = value as (MutableMap<RewardMeta.RewardedAction, CommandProperties>)
        }

    @YamlSerializer.YamlSerialize(orderNumber = 2, value = "command-reward")
    private var internalCommandReward: MutableMap<RewardMeta.RewardedAction, CommandProperties> = HashMap()
}