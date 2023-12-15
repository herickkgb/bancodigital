package com.herick.bancodigital.domain.auth

import com.herick.bancodigital.data.repository.auth.AuthFirebaseDataSourceImpl

class RecoverUsercase(
    private val authFirebaseDataSourceImpl: AuthFirebaseDataSourceImpl
) {
    suspend operator fun invoke(email: String) {
        return authFirebaseDataSourceImpl.recover(email)
    }
}