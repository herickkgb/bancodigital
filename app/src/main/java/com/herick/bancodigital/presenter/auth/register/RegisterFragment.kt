package com.herick.bancodigital.presenter.auth.register

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.herick.bancodigital.MainActivity
import com.herick.bancodigital.R
import com.herick.bancodigital.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {
    private lateinit var auth: FirebaseAuth

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

        auth = Firebase.auth

        initListener()

    }

    private fun initListener() {
        binding.btnLogin.setOnClickListener {
            validadeData()
        }
    }

    override fun onStart() {
        super.onStart()

        val currentUser = auth.currentUser
        if (currentUser != null) {

        }
    }

    private fun validadeData() {
        val email = binding.editEmail.text.toString().trim()
        val senha = binding.editSenha.text.toString().trim()
        val telefone = binding.editTelefone.text.toString().trim()
        val nome = binding.editNome.text.toString().trim()

        if (email.isEmpty() || senha.isEmpty() || telefone.isEmpty() || nome.isEmpty()) {
            val snk = Snackbar.make(binding.root, "Preencha todos os campos...", Snackbar.LENGTH_SHORT)
                    .apply {
                        setBackgroundTint(Color.RED)
                        setTextColor(Color.WHITE)
                        show()
                    }
        } else {

        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}