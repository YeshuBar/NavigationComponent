package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentOneBinding
import com.example.navigationcomponent.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {
    private lateinit var binding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentOne.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment_three_to_fragment_one)
        }

        binding.buttonToFragmentTwo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment_three_to_fragment_two)
        }
    }

}


