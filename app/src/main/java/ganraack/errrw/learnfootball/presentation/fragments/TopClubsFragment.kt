package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ganraack.errrw.learnfootball.adapter.TopClubsAdapter
import ganraack.errrw.learnfootball.databinding.FragmentTopClubsBinding
import ganraack.errrw.learnfootball.topClubsList

class TopClubsFragment : Fragment() {

    private lateinit var binding: FragmentTopClubsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTopClubsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = TopClubsAdapter(topClubsList)
        binding.topClubsRecyclerView.adapter = adapter
        binding.topClubsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}
