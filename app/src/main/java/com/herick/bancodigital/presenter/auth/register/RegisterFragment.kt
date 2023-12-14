package com.herick.bancodigital.presenter.auth.register

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.herick.bancodigital.R
import com.herick.bancodigital.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
        initListener()
    }

    private fun initListener() {
        binding.btnLogin.setOnClickListener {
            validadeData()
        }
    }

    private fun validadeData() {
        val email = binding.editEmail.text.toString().trim()
        val senha = binding.editSenha.text.toString().trim()
        val telefone = binding.editTelefone.text.toString().trim()
        val nome = binding.editNome.text.toString().trim()

        if (email.isEmpty() || senha.isEmpty() || telefone.isEmpty() || nome.isEmpty()) {
            val snk =
                Snackbar.make(binding.root, "Preencha todos os campos...", Snackbar.LENGTH_SHORT)
                    .apply {
                        setBackgroundTint(Color.RED)
                        setTextColor(Color.WHITE)
                        show()
                    }
        } else {
            val snk = Snackbar.make(binding.root, "Login...", Snackbar.LENGTH_SHORT).apply {
                setBackgroundTint(Color.RED)
                setTextColor(Color.WHITE)
                show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}