package com.example.equistria.vue

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.equistria.R
import com.example.equistria.databinding.FragmentListeChevauxBinding
import com.example.equistria.viewmodel.ChevalListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListeChevauxFragment : Fragment() {

    private val chevalListViewModel: ChevalListViewModel by viewModel()

    private lateinit var binding: FragmentListeChevauxBinding

    /*private val autreViewModel: AutreViewModel by viewModel()*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListeChevauxBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO : afficher un loader dans le layout
        chevalListViewModel.getAll().observe(viewLifecycleOwner, { lstChevaux ->
            binding.tv.text = lstChevaux.map { it.nom }.joinToString(", ")
            // TODO : remplir le layout avec les chevaux
            // TODO : masquer le loader
        })
    }
}