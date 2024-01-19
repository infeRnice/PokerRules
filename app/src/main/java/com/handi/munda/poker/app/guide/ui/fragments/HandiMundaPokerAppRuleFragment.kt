package com.handi.munda.poker.app.guide.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.handi.munda.poker.app.guide.R
import com.handi.munda.poker.app.guide.app.HandiMundaPokerApp
import com.handi.munda.poker.app.guide.ui.adapters.HandiMundaPokerAppRuleItemAdapter
import com.handi.munda.poker.app.guide.ui.viewmodels.HandiMundaPokerAppRulesViewModel
import com.handi.munda.poker.app.guide.ui.viewmodels.HandiMundaPokerAppRulesViewModel.Companion.TOTAL_RULES
import javax.inject.Inject

class HandiMundaPokerAppRuleFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var handiMundaViewModel: HandiMundaPokerAppRulesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity?.application as HandiMundaPokerApp).handiMundaPokerAppComponent.injectToHandiMundaPokerAppRuleFragment(this)
        return inflater.inflate(R.layout.handimundapokerapp_firstrule_fragment, container, false)
    }

    private lateinit var rulesRecyclerView: RecyclerView
    private lateinit var adapter: HandiMundaPokerAppRuleItemAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity?.application as HandiMundaPokerApp).handiMundaPokerAppComponent.injectToHandiMundaPokerAppRuleFragment(this)
        handiMundaViewModel =
            ViewModelProvider(this, viewModelFactory).get(HandiMundaPokerAppRulesViewModel::class.java)
        Log.d("RuleFragment", "ViewModel: $handiMundaViewModel")

        handiMundaViewModel.rules.observe(viewLifecycleOwner) { rules ->
            adapter.updateData(listOf(rules))
        }
        val ruleId = arguments?.getInt("ruleId") ?: 1
        handiMundaViewModel.loadRule(ruleId)

        val nextButton = view.findViewById<Button>(R.id.handimundapokerapp_next_button)
        nextButton.apply {
            text = if (ruleId < TOTAL_RULES) "Next" else "ToMenu"
            setOnClickListener {
                if (ruleId < TOTAL_RULES) {
                    val bundle = bundleOf("ruleId" to ruleId + 1)
                    findNavController().navigate(R.id.handimundapokerapp_firstrule_fragment, bundle)
                } else {
                    //переход обратно в меню
                    findNavController().navigate(R.id.action_to_main_menu_fragment)
                }
            }

        }
        view.findViewById<ImageButton>(R.id.handimundapokerapp_back_button).setOnClickListener {
            if (ruleId > 1) {
                val bundle = bundleOf("ruleId" to ruleId - 1)
                findNavController().navigate(R.id.handimundapokerapp_firstrule_fragment, bundle)
            } else {
                //menu
                findNavController().navigate(R.id.action_to_main_menu_fragment)
            }
        }

        rulesRecyclerView = view.findViewById(R.id.handi_munda_rule_content)
        adapter = HandiMundaPokerAppRuleItemAdapter(emptyList()) { resourceName ->
            requireContext().resources.getIdentifier(resourceName, "drawable", requireContext().packageName)
        }
        rulesRecyclerView.adapter = adapter
        rulesRecyclerView.layoutManager = LinearLayoutManager(requireContext())


    }
}