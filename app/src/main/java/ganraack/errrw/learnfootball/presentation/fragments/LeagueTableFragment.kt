package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import ganraack.errrw.learnfootball.adapter.OnTeamClickListener
import ganraack.errrw.learnfootball.adapter.TeamsAdapter
import ganraack.errrw.learnfootball.databinding.FragmentLeagueTableBinding
import ganraack.errrw.learnfootball.model.TeamsModel

class LeagueTableFragment : Fragment(), OnTeamClickListener {

    private var _binding: FragmentLeagueTableBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeagueTableBinding.inflate(inflater, container, false)

        val args: LeagueTableFragmentArgs by navArgs()
        val teams = args.LeagueTeams.listOfTeams

        val adapter = TeamsAdapter(teams, this)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext())

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onTeamClick(team: TeamsModel) {
        val action = LeagueTableFragmentDirections.actionLeagueTableFragmentToOneTeamFragment(team)
        findNavController().navigate(action)
    }
}
