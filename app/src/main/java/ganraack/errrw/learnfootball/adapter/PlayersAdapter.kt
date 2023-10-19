package ganraack.errrw.learnfootball.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ganraack.errrw.learnfootball.R
import ganraack.errrw.learnfootball.databinding.ItemPlayerLayoutBinding
import ganraack.errrw.learnfootball.model.PlayerModel

class PlayersAdapter(private val players: List<PlayerModel>) :
    RecyclerView.Adapter<PlayersAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemPlayerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(player: PlayerModel) {
            binding.playerName.text = player.playerName
            binding.playerPosition.text = player.playerPosition
            binding.playerPrice.text = player.playerPrice.toString()
            Glide.with(binding.root)
                .load(player.playerImg)
                .placeholder(R.drawable.ic_img)
                .into(binding.playerImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPlayerLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val player = players[position]
        holder.bind(player)
    }

    override fun getItemCount(): Int {
        return players.size
    }
}
