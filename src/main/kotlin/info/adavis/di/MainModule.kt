package info.adavis.di

import com.google.gson.Gson
import info.adavis.dao.UFOSightingDatabase
import info.adavis.dao.UFOSightingStorage
import info.adavis.graphql.AppSchema
import org.koin.dsl.module.applicationContext

val mainModule = applicationContext {
    bean { Gson() }
    bean { AppSchema(get()) }
    bean { UFOSightingDatabase() as UFOSightingStorage }
}