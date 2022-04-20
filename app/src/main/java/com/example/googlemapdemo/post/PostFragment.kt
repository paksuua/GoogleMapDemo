package com.example.googlemapdemo.post
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googlemapdemo.databinding.FragmentPostBinding


class PostFragment : Fragment() {
    lateinit var binding: FragmentPostBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostBinding.inflate(inflater, container,false)
        initUI()
        return binding.root
    }

    private fun initUI() {
    }
}
