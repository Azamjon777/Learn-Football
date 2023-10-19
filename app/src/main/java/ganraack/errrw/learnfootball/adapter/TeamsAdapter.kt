package ganraack.errrw.learnfootball.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ganraack.errrw.learnfootball.R
import ganraack.errrw.learnfootball.databinding.ItemTeamBinding
import ganraack.errrw.learnfootball.model.TeamsModel

class TeamsAdapter(private val teams: List<TeamsModel>, private val clickListener: OnTeamClickListener) :
    RecyclerView.Adapter<TeamsAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemTeamBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(team: TeamsModel) {
            binding.teamName.text = team.teamName
            Glide.with(binding.root)
                .load(team.teamImg)
                .placeholder(R.drawable.ic_img)
                .into(binding.teamImg)

            binding.root.setOnClickListener {
                clickListener.onTeamClick(team)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTeamBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val team = teams[position]
        holder.bind(team)
    }

    override fun getItemCount(): Int {
        return teams.size
    }
}

interface OnTeamClickListener {
    fun onTeamClick(team: TeamsModel)
}

