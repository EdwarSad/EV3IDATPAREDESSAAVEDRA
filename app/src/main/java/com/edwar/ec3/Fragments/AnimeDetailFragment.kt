package com.edwar.ec3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edwar.ec3.databinding.FragmentAnimeDetailBinding


class AnimeDetailFragment : Fragment() {
    private lateinit var binding:FragmentAnimeDetailBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnimeDetailBinding.inflate(inflater,container,false)
        return binding.root
    }
}