package com.herick.bancodigital.presenter.auth.login

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.herick.bancodigital.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        if (email.isEmpty() || senha.isEmpty()) {
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