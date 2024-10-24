package com.tugasteori.pertemuan7.data

import com.tugasteori.pertemuan7.R
import com.tugasteori.pertemuan7.model.Riyadi

class Datasource {

    fun loadRiyadi(): List<Riyadi> {

        return listOf<Riyadi>(
            Riyadi(R.string.riyadi1, R.string.riyadi2, R.drawable.riyadi1)
        )

    }
}