package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import ganraack.errrw.learnfootball.R
import ganraack.errrw.learnfootball.adapter.PlayersAdapter
import ganraack.errrw.learnfootball.databinding.FragmentOneTeamBinding

class OneTeamFragment : Fragment() {
    private lateinit var binding: FragmentOneTeamBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneTeamBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: OneTeamFragmentArgs by navArgs()
        val teamImg = args.TeamPlayers.teamImg
        val teamPLayers = args.TeamPlayers.playersList

        args.TeamPlayers.playersList
        val playersAdapter = PlayersAdapter(teamPLayers)
        binding.playersRecyclerView.adapter = playersAdapter
        binding.playersRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        Glide.with(requireContext())
            .load(teamImg)
            .placeholder(R.drawable.ic_img)
            .into(binding.teamImg)
        binding.teamName.text = args.TeamPlayers.teamName
    }
}