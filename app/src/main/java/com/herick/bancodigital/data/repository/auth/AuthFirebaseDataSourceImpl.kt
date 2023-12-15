package com.herick.bancodigital.data.repository.auth

import android.content.Intent
import android.graphics.Color
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.FirebaseDatabase
import com.herick.bancodigital.MainActivity

class AuthFirebaseDataSourceImpl(
    firebaseDatabase: FirebaseDatabase
) : AuthFirebaseDataSource{
    override suspend fun login(email: String, password: String) {

    }

    override suspend fun register(nome: String, email: String, phone: String, password: String) {

    }

    override suspend fun recover(email: String) {

    }
}