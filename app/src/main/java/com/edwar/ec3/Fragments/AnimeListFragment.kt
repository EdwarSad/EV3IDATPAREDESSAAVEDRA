package com.edwar.ec3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edwar.ec3.R
import com.edwar.ec3.databinding.FragmentAnimeFavoriteBinding
import com.edwar.ec3.databinding.FragmentAnimeListBinding
import com.edwar.ec3.databinding.FragmentInfoBinding


class AnimeListFragment : Fragment() {
    private lateinit var binding:FragmentAnimeListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnimeListBinding.inflate(inflater,container,false)
        return binding.root
    }

}