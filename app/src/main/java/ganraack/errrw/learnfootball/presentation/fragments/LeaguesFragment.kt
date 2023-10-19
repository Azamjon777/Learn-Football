package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ganraack.errrw.learnfootball.databinding.FragmentLeaguesBinding
import ganraack.errrw.learnfootball.model.LeagueModel
import ganraack.errrw.learnfootball.viewmodel.LeagueViewModel

class LeaguesFragment : Fragment() {

    private var _binding: FragmentLeaguesBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: LeagueViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeaguesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(LeagueViewModel::class.java)

        val listOfItalia = viewModel.seriaATeams
        val listOfEngland = viewModel.englishPremierTeams
        val listOfSpain = viewModel.laLigaTeams
        val listOfBundesliga = viewModel.bundesligaTeams

        binding.btnEnglandLeagues.setOnClickListener {
            val action = LeaguesFragmentDirections.actionLeaguesFragmentToLeagueTableFragment(
                LeagueModel(listOfEngland)
            )
            findNavController().navigate(action)
        }
        binding.btnBundesligaLeagues.setOnClickListener {
            val action = LeaguesFragmentDirections.actionLeaguesFragmentToLeagueTableFragment(
                LeagueModel(listOfBundesliga)
            )
            findNavController().navigate(action)
        }
        binding.btnSpanishLeagues.setOnClickListener {
            val action = LeaguesFragmentDirections.actionLeaguesFragmentToLeagueTableFragment(
                LeagueModel(listOfSpain)
            )
            findNavController().navigate(action)
        }
        binding.btnSeriaALeagues.setOnClickListener {
            val action = LeaguesFragmentDirections.actionLeaguesFragmentToLeagueTableFragment(
                LeagueModel(listOfItalia)
            )
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
