package com.github.shynixn.blockball.bukkit.logic.persistence.entity.meta.display

import com.github.shynixn.blockball.api.business.enumeration.PlaceHolder
import com.github.shynixn.blockball.api.persistence.entity.meta.display.ScoreboardMeta
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
class ScoreboardBuilder : PersistenceObject(), ScoreboardMeta {
    /** Title of the scoreboard. */
    @YamlSerializer.YamlSerialize(orderNumber = 1, value = "title")
    override var title: String = "&aBlockBall"
    /** Is the scoreboard visible. */
    @YamlSerializer.YamlSerialize(orderNumber = 2, value = "enabled")
    override var enabled: Boolean = false
    /** Lines of the scoreboard being rendered. */
    @YamlSerializer.YamlSerialize(orderNumber = 3, value = "lines")
    override val lines: ArrayList<String> = arrayListOf(
            ""
            , "&6Time: "
            , PlaceHolder.TIME.placeHolder
            , ""
            , "&m           &r"
            , PlaceHolder.RED_COLOR.concat(PlaceHolder.TEAM_RED) + ":"
            , "&l" + PlaceHolder.RED_GOALS.placeHolder
            , ""
            , PlaceHolder.BLUE_COLOR.concat(PlaceHolder.TEAM_BLUE) + ":"
            , "&l" + PlaceHolder.BLUE_GOALS.placeHolder
            , "&m           &r"
    )
}