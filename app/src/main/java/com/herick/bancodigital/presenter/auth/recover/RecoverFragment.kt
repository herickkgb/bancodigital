package com.herick.bancodigital.presenter.auth.recover

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.herick.bancodigital.databinding.FragmentRecoverBinding

class RecoverFragment : Fragment() {
    private var _binding: FragmentRecoverBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecoverBinding.inflate(inflater, container, false)
        return binding.root
        initListener()
    }

    private fun initListener() {
        binding.btnLogin.setOnClickListener {
            validadeData()
        }
    }

    private fun validadeData() {
        val email = binding.editEmail.text.toString().trim()

        if (email.isEmpty() ) {
            val snk =
                Snackbar.make(binding.root, "Preencha E-mail", Snackbar.LENGTH_SHORT)
                    .apply {
                        setBackgroundTint(Color.RED)
                        setTextColor(Color.WHITE)
                        show()
                    }
        } else {
            val snk = Snackbar.make(binding.root, "Enviando email...", Snackbar.LENGTH_SHORT).apply {
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