package ganraack.errrw.learnfootball.presentation.fragments

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ganraack.errrw.learnfootball.R
import ganraack.errrw.learnfootball.databinding.FragmentSelectLanguageBinding
import java.util.Locale

class SelectLanguageFragment : Fragment() {
    private var _binding: FragmentSelectLanguageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectLanguageBinding.inflate(inflater, container, false)

        binding.continueButton.setOnClickListener {
            val selectedLanguage = when (binding.leaguesRadioGroup.checkedRadioButtonId) {
                R.id.radioEnglish -> "en"
                R.id.radioItalian -> "it"
                R.id.radioSpanish -> "es"
                R.id.radioIndonesian -> "in"
                else -> "en"
            }

            updateLanguage(selectedLanguage)

            findNavController().navigate(R.id.action_selectLanguageFragment_to_leaguesFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun updateLanguage(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val configuration = Configuration(resources.configuration)
        configuration.setLocale(locale)

        resources.updateConfiguration(configuration, resources.displayMetrics)
    }
}