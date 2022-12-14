package com.gapigo.businesscard

import android.app.Application
import com.gapigo.businesscard.data.AppDatabase
import com.gapigo.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao())}
}