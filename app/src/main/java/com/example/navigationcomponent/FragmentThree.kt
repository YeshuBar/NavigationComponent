package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {
    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentOne.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentOne)
        }

        binding.buttonToFragmentTwo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentTwo)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


