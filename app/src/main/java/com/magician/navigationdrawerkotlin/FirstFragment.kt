package com.magician.navigationdrawerkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.magician.navigationdrawerkotlin.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_first, container, false
        )

        binding.textView.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(22)
            Navigation.findNavController(it).navigate(
                action
            )
        }

        return binding.root
    }


}