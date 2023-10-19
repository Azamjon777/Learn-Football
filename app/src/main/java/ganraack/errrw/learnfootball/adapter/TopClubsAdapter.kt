package ganraack.errrw.learnfootball.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ganraack.errrw.learnfootball.databinding.ItemTopClubBinding
import ganraack.errrw.learnfootball.model.TopClubModel

class TopClubsAdapter(private val clubs: List<TopClubModel>) :
    RecyclerView.Adapter<TopClubsAdapter.ClubViewHolder>() {

    inner class ClubViewHolder(private val binding: ItemTopClubBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(clubName: TopClubModel) {
            binding.clubName.text = clubName.clubName
            binding.clubCountry.text = clubName.clubCountry
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTopClubBinding.inflate(inflater, parent, false)
        return ClubViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        val clubName = clubs[position]
        holder.bind(clubName)
    }

    override fun getItemCount(): Int {
        return clubs.size
    }
}