package com.handi.munda.poker.app.guide.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.app.guide.app.HandiMundaPokerApp
import com.handi.munda.poker.app.guide.ui.viewmodels.HandiMundaPokerAppMenuViewModel
import javax.inject.Inject

class HandiMundaPokerAppMenuFragment: Fragment() {

    @Inject
    lateinit var handiMundaViewModelFactory: ViewModelProvider.Factory
    private lateinit var handiMundaViewModel: HandiMundaPokerAppMenuViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity?.application as HandiMundaPokerApp).handiMundaPokerAppComponent.injectToHandiMundaPokerAppMenuFragment(this)
        handiMundaViewModel = ViewModelProvider(this, handiMundaViewModelFactory).get(HandiMundaPokerAppMenuViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.handimundapokerapp_main_menu_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.handimundapokerapp_start_button).setOnClickListener {
            findNavController().navigate(R.id.action_handimundapokerapp_main_menu_fragment_to_handimundapokerapp_firstrule_fragment)
        }

        view.findViewById<Button>(R.id.handimundapokerapp_exit_button).setOnClickListener {
            activity?.finish()
        }
    }
}