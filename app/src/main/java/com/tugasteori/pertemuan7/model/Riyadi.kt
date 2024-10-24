package com.tugasteori.pertemuan7.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Riyadi (
   @StringRes val stringResourceId1: Int,
   @StringRes val stringResourceId2: Int,
   @DrawableRes val imageResourceId: Int,
)
