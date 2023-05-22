package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentThree.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentThree)
        }


        binding.buttonToFragmentFour.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentFour)
        }

    }
}
