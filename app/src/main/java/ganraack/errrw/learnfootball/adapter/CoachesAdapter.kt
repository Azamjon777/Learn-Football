package ganraack.errrw.learnfootball.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ganraack.errrw.learnfootball.databinding.ItemCoachLayoutBinding
import ganraack.errrw.learnfootball.model.CoachModel

class CoachesAdapter(private val coachesList: List<CoachModel>) :
    RecyclerView.Adapter<CoachesAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemCoachLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(coach: CoachModel) {
            binding.coachNameTextView.text = coach.name
            binding.coachCountry.text = coach.country
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCoachLayoutBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val coach = coachesList[position]
        holder.bind(coach)
    }

    override fun getItemCount(): Int {
        return coachesList.size
    }
}

