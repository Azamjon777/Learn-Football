package ganraack.errrw.learnfootball.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import ganraack.errrw.learnfootball.R
import ganraack.errrw.learnfootball.databinding.FragmentStartBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartFragment : Fragment() {
    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        lifecycleScope.launch {
            delay(1000)
            findNavController().navigate(R.id.action_startFragment_to_onBoard1Fragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
