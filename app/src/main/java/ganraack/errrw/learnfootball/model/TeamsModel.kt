package ganraack.errrw.learnfootball.model

import java.io.Serializable

data class TeamsModel(
    val teamName: String,
    val teamImg: String,
    val playersList: List<PlayerModel>
) : Serializable
