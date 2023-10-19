package ganraack.errrw.learnfootball.model

import java.io.Serializable

class PlayerModel(
    val playerName: String,
    val playerPosition: String,
    val playerPrice: Int,
    val playerImg: String
) : Serializable