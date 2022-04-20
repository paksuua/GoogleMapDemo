package com.example.googlemapdemo.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googlemapdemo.databinding.FragmentAuthBinding

class AuthFragment : Fragment() {
    lateinit var binding: FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(inflater, container, false)
        initUI()
        return binding.root
    }

    private fun initUI() {
    }
}
