/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.tiles.complication

import android.content.Context
import androidx.wear.watchface.complications.data.ComplicationData
import androidx.wear.watchface.complications.data.ComplicationType
import com.google.android.horologist.tiles.ExperimentalHorologistTilesApi

/**
 * A complication renderer from Data to any of the supported types.
 */
@ExperimentalHorologistTilesApi
public interface ComplicationTemplate<D> {
    public val context: Context

    public fun render(type: ComplicationType, data: D): ComplicationData

    public fun supportedTypes(): List<ComplicationType>

    public fun previewData(): D
}
