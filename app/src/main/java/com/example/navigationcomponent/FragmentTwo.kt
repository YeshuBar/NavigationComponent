package com.example.navigationcomponent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentOneBinding
import com.example.navigationcomponent.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentFour.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment_two_to_fragment_four)
        }

        binding.buttonToFragmentOne.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment_two_to_fragment_one)
        }
    }

}
