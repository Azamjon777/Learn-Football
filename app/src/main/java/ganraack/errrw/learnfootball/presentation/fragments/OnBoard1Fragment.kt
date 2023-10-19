package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import ganraack.errrw.learnfootball.R
import ganraack.errrw.learnfootball.databinding.FragmentOnBoard1Binding


class OnBoard1Fragment : Fragment() {

    private var _binding: FragmentOnBoard1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnBoard1Binding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.back.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }

        binding.next.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_onBoard1Fragment_to_onBoard2Fragment)
        }

        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}