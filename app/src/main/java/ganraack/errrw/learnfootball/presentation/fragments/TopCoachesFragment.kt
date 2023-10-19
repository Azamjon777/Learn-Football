package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ganraack.errrw.learnfootball.adapter.CoachesAdapter
import ganraack.errrw.learnfootball.coachesList
import ganraack.errrw.learnfootball.databinding.FragmentTopCoachesBinding
import ganraack.errrw.learnfootball.model.CoachModel

class TopCoachesFragment : Fragment() {

    private var _binding: FragmentTopCoachesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopCoachesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.layoutManager = layoutManager

        val coachesList: List<CoachModel> = coachesList

        val coachesAdapter = CoachesAdapter(coachesList)
        binding.recyclerView.adapter = coachesAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
