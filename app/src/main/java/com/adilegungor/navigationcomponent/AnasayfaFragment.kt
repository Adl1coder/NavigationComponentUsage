package com.adilegungor.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.adilegungor.navigationcomponent.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonAGit.setOnClickListener {
            Navigation.findNavController(it).navigate(AnasayfaFragmentDirections.sayfaAGit())
        }
        binding.buttonXGit.setOnClickListener {
            Navigation.findNavController(it).navigate(AnasayfaFragmentDirections.sayfaXGit())
        }

        return binding.root
    }
}