package com.herick.bancodigital.di

import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import javax.inject.Singleton
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent



@Module
@InstallIn(SingletonComponent::class)
object FirebaseModule {
    @Singleton
    @Provides
    fun providerFirebaseDataBase() : FirebaseDatabase{
        return  FirebaseDatabase.getInstance()
    }
}