package com.example.navigationcomponent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentFour.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTwo_to_fragmentFour)
        }

        binding.buttonToFragmentOne.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}