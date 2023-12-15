package com.herick.bancodigital.domain.auth

import com.herick.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl

class RegisterUsercase(
    private val authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
) {
    suspend operator fun invoke(nome: String, email: String, phone: String, password: String) {
        return authFirebaseDataSourceImpl.register(nome, email, phone, password)
    }
}