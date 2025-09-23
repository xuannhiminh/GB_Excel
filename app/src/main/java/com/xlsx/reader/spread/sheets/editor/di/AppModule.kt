package com.xlsx.reader.spread.sheets.viewer.editor.di

import com.xlsx.reader.spread.sheets.viewer.editor.database.AppDatabase
import com.xlsx.reader.spread.sheets.viewer.editor.database.repository.FileModelRepository
import com.xlsx.reader.spread.sheets.viewer.editor.database.repository.FileModelRepositoryImpl
import com.xlsx.reader.spread.sheets.viewer.editor.screen.main.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single { AppDatabase.getInstance(androidApplication()) }
    single { FileModelRepositoryImpl(get()) as FileModelRepository}
    single { MainViewModel(androidApplication(), get()) }
}