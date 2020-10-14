package com.magician.navigationdrawerkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.magician.navigationdrawerkotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    val args: SecondFragmentArgs by navArgs()
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_second, container, false
        )
        val myNumber = args.number
        binding.textView.text = myNumber.toString()
        binding.textView.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return binding.root
    }


}