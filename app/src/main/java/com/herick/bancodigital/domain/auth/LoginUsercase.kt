package com.herick.bancodigital.domain.auth

import com.herick.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl

class LoginUsercase(
    private val authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
) {
    suspend operator fun invoke(email: String, password: String) {
        return authFirebaseDataSourceImpl.login(email, password)
    }
}