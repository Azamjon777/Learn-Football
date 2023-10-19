package ganraack.errrw.learnfootball.viewmodel

import androidx.lifecycle.ViewModel
import ganraack.errrw.learnfootball.model.PlayerModel
import ganraack.errrw.learnfootball.model.TeamsModel

class LeagueViewModel : ViewModel() {
    val manchesterUnitedPlayers = listOf(
        PlayerModel(
            "Bruno Fernandes",
            "Midfielder",
            80000,
            "https://example.com/bruno_fernandes.png"
        ),
        PlayerModel(
            "Harry Maguire",
            "Defender",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Harry_Maguire_2021.jpg/640px-Harry_Maguire_2021.jpg"
        ),
        PlayerModel(
            "Marcus Rashford",
            "Forward",
            70000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/bltcdb18a94cf3e9b3e/64b5073aebf1bb4cd8c89250/Marcus_Rashford(1).jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "Bruno Fernandes",
            "Midfielder",
            80000,
            "https://s-cdn.sportbox.ru/images/styles/upload/fp_fotos/b6/0b/f362c79f79d2b8738c441064e5525acf5e35d2de8007a492683992.jpg"
        ),
        PlayerModel(
            "Raphael Varane",
            "Defender",
            85000,
            "https://i2-prod.manchestereveningnews.co.uk/incoming/article27470014.ece/ALTERNATES/s1200c/0_GettyImages-1594153384.jpg"
        )
    )

    val manchesterCityPlayers = listOf(
        PlayerModel(
            "Kevin De Bruyne",
            "Midfielder",
            90000,
            "https://www.mancity.com/meta/media/i0fhd2ed/kevin-de-bruyne.png"
        ),
        PlayerModel(
            "Ruben Dias",
            "Defender",
            75000,
            "https://www.mancity.com/meta/media/vw0b1q45/ruben-dias.png"
        ),
        PlayerModel(
            "Erling haaland",
            "Forward",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/6/6e/Erling_Haaland_2023_%28cropped-v2%29.jpg"
        ),
        PlayerModel(
            "Ederson",
            "Goalkeeper",
            85000,
            "https://i.guim.co.uk/img/media/26531e6242feae55c9a18726bc6b3e19619ba0d3/0_186_3810_2286/master/3810.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=2ee83fd0206376a1a864ece77778f692"
        ),
        PlayerModel(
            "Kyle Walker",
            "Defender",
            70000,
            "https://e0.365dm.com/22/10/2048x1152/skysports-kyle-walker-man-city_5921976.jpg"
        )
    )

    val liverpoolPlayers = listOf(
        PlayerModel("Mohamed Salah", "Forward", 90000, "https://example.com/mohamed_salah.png"),
        PlayerModel(
            "Virgil van Dijk",
            "Defender",
            80000,
            "https://backend.liverpoolfc.com/sites/default/files/styles/xs/public/2023-07/pp-23-24-mens-home-body-virgil.webp?itok=YdyfJeLd"
        ),
        PlayerModel(
            "Mohamed Salah",
            "Forward",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/4/4a/Mohamed_Salah_2018.jpg"
        ),
        PlayerModel(
            "Alisson Becker",
            "Goalkeeper",
            85000,
            "https://www.thisisanfield.com/wp-content/uploads/P2023-08-13-Chelsea_Liverpool-81-600x400.jpg"
        ),
        PlayerModel(
            "Tiago Alkantara",
            "Midfielder",
            75000,
            "https://static.mk.ru/upload/entities/2022/08/09/09/articles/facebookPicture/ba/b8/d4/ee/97953f797616b1c22c0e315aff21fd58.jpg"
        )
    )

    val chelseaPlayers = listOf(
        PlayerModel(
            "Mudrik",
            "Midfielder",
            80000,
            "https://img.championat.com/news/big/i/t/ukrainec-mihail-mudrik-poluchil-10-j-nomer-v-chelsi_16914921301941812293.jpg"
        ),
        PlayerModel(
            "Raheem Sterling",
            "Forward",
            85000,
            "https://s.hs-data.com/bilder/spieler/gross/180807.jpg"
        ),
        PlayerModel(
            "Thiago Silva",
            "Defender",
            75000,
            "https://static.standard.co.uk/2023/04/19/08/newFile-4.jpg?width=1200&height=1200&fit=crop"
        ),
        PlayerModel(
            "Kepa Arrizabalaga",
            "Goalkeeper",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Kepa_Arrizabalaga_2021_%28cropped%29.jpg/800px-Kepa_Arrizabalaga_2021_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Enzo Hernandez",
            "Midfielder",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/d/df/Enzo_Fern%C3%A1ndez_WC2022.jpg"
        )
    )

    val arsenalPlayers = listOf(
        PlayerModel(
            "Gabriel Jesus",
            "Forward",
            85000,
            "https://e0.365dm.com/22/07/800x600/skysports-gabriel-jesus-arsenal_5843981.jpg?20220724071052"
        ),
        PlayerModel(
            "Thomas Partey",
            "Midfielder",
            80000,
            "https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/Headshot_Partey_1510x850_0.jpg?auto=webp&itok=l8_scPxh"
        ),
        PlayerModel(
            "Kieran Tierney",
            "Defender",
            75000,
            "https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/MicrosoftTeams-image%20%2830%29_0.png?auto=webp&itok=--9BLn7K"
        ),
        PlayerModel(
            "Bernd Leno",
            "Goalkeeper",
            75000,
            "https://i.guim.co.uk/img/media/d7ec69b99b9798ddb8e7e74b0016b205f6508af8/804_117_2076_1245/master/2076.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=60161d24d8a89ab769b2f5a79a9eb8db"
        ),
        PlayerModel(
            "Bukayo Saka",
            "Midfielder",
            70000,
            "https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/Headshot_Saka_1510x850_0.jpg?auto=webp&itok=yZpptHcr"
        )
    )

    val tottenhamPlayers = listOf(
        PlayerModel(
            "Kulusevski",
            "Forward",
            90000,
            "https://i2-prod.football.london/incoming/article25503562.ece/ALTERNATES/s615/0_GettyImages-1244716470.jpg"
        ),
        PlayerModel(
            "Heung-min Son",
            "Forward",
            85000,
            "https://i2-prod.dailystar.co.uk/incoming/article30352691.ece/ALTERNATES/s1200c/0_Tottenham-Hotspur-v-Brighton-Hove-Albion-Premier-League.jpg"
        ),
        PlayerModel(
            "Eric Dier",
            "Defender",
            70000,
            "https://cdn.vox-cdn.com/thumbor/5SSYrR2F7TvUcuzmVHUkOhJ6g-8=/0x0:4000x2667/1200x800/filters:focal(1869x585:2509x1225)/cdn.vox-cdn.com/uploads/chorus_image/image/72563254/1601993102.0.jpg"
        ),
        PlayerModel(
            "Hugo Lloris",
            "Goalkeeper",
            80000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/bltd41566b0f77bd6bd/64a867f2311a5a121a6f2b73/GOAL_-_Blank_WEB_-_Facebook(320).jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "Sarr",
            "Midfielder",
            75000,
            "https://ichef.bbci.co.uk/news/1024/cpsprodpb/5d79/live/ed73dd10-8dd4-11ed-b1b1-1b97c4c1f092.jpg"
        )
    )

    val leicesterPlayers = listOf(
        PlayerModel(
            "Jamie Vardy",
            "Forward",
            80000,
            "https://i.guim.co.uk/img/media/96a8f10bff9a3d3f96967bdf998de10489857fd2/0_223_6000_3600/master/6000.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=c1952e5c6a6a1af2bd87bbc573a6138c"
        ),
        PlayerModel(
            "James Maddison",
            "Midfielder",
            75000,
            "https://i2-prod.football.london/incoming/article27561982.ece/ALTERNATES/s615/0_James-Maddison.jpg"
        ),
        PlayerModel(
            "Wesley Fofana",
            "Defender",
            70000,
            "https://img.chelseafc.com/image/upload/f_auto,w_1440,c_fill,g_faces,q_90/editorial/news/2023/07/18/fofana-stock-training-2324.jpg"
        ),
        PlayerModel(
            "Kasper Schmeichel",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/5/51/Kasper_Schmeichel_2021_vs_Spartak_Moscow.jpg"
        ),
        PlayerModel(
            "Youri Tielemans",
            "Midfielder",
            80000,
            "https://e0.365dm.com/22/06/1600x900/skysports-youri-tielemans-leicester_5802401.jpg?20220612130817"
        )
    )

    val evertonPlayers = listOf(
        PlayerModel(
            "Dominic Calvert-Lewin",
            "Forward",
            80000,
            "https://i2-prod.mirror.co.uk/incoming/article30777287.ece/ALTERNATES/n615/0_Dominic-Calvert-Lewin-2.jpg"
        ),
        PlayerModel(
            "Richarlison",
            "Forward",
            75000,
            "https://static.standard.co.uk/2022/05/01/20/newFile.jpg?width=1200&height=1200&fit=crop"
        ),
        PlayerModel(
            "Lucas Digne",
            "Defender",
            70000,
            "https://resources.evertonfc.com/players/side/480x540/p101188.png"
        ),
        PlayerModel(
            "Jordan Pickford",
            "Goalkeeper",
            75000,
            "https://i.eurosport.com/2023/05/20/3708813-75466188-2560-1440.jpg"
        ),
        PlayerModel(
            "Abdoulaye Doucoure",
            "Midfielder",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/7/73/Stade_rennais_-_Le_Havre_AC_20150708_40.JPG"
        )
    )

    val westHamPlayers = listOf(
        PlayerModel(
            "Michail Antonio",
            "Forward",
            70000,
            "https://static.standard.co.uk/2023/01/26/15/newFile-8.jpg?width=968&auto=webp&quality=50&crop=968%3A645%2Csmart"
        ),
        PlayerModel(
            "Declan Rice",
            "Midfielder",
            80000,
            "https://static.independent.co.uk/2023/07/15/13/SEI161124073.jpg"
        ),
        PlayerModel(
            "Aaron Cresswell",
            "Defender",
            75000,
            "https://e0.365dm.com/21/04/2048x1152/skysports-aaron-cresswell-west-ham_5328424.jpg"
        ),
        PlayerModel(
            "Lukasz Fabianski",
            "Goalkeeper",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/JAP-POL_%289%29_%28cropped%29.jpg/220px-JAP-POL_%289%29_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Jarrod Bowen",
            "Forward",
            70000,
            "https://www.planetsport.com/image-library/square/1200/w/west-ham-jarrod-bowen-jan23.jpg"
        )
    )

    val astonVillaPlayers = listOf(
        PlayerModel(
            "Jack Grealish",
            "Midfielder",
            90000,
            "https://e0.365dm.com/21/05/1600x900/skysports-jack-grealish-aston-villa_5391170.jpg?20210522183704"
        ),
        PlayerModel(
            "Ollie Watkins",
            "Forward",
            75000,
            "https://static.independent.co.uk/2023/03/03/15/77a14d87a06eff645755f7d7cb54e01eY29udGVudHNlYXJjaGFwaSwxNjc3OTQzMTM5-2.71034678.jpg"
        ),
        PlayerModel(
            "Tyrone Mings",
            "Defender",
            70000,
            "https://i.guim.co.uk/img/media/2ba615c3142913a4bfc22f998f8e02cbdde61c4e/0_54_6000_3600/master/6000.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=9a072ab811ec3f57d034096b3d821241"
        ),
        PlayerModel(
            "Emiliano Martinez",
            "Goalkeeper",
            80000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt6a6ec5b445d90121/63a5e984900b5b7c08f2d8b3/Martinez_2.jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "John McGinn",
            "Midfielder",
            75000,
            "https://s.hs-data.com/bilder/spieler/gross/224995.jpg"
        )
    )
    val bayernMunichPlayers = listOf(
        PlayerModel(
            "Sane",
            "Forward",
            90000,
            "https://assets.bundesliga.com/tachyon/sites/2/2022/11/bvb_fcb_sane_1920.jpg?crop=0px,0px,1920px,1080px&fit=1140,1140"
        ),
        PlayerModel(
            "Thomas Muller",
            "Midfielder",
            80000,
            "https://s.hs-data.com/bilder/spieler/gross/97332.jpg"
        ),
        PlayerModel(
            "Joshua Kimmich",
            "Midfielder",
            85000,
            "https://img.fcbayern.com/image/upload/t_cms-1x1-seo/v1604107897/cms/public/images/fcbayern-com/homepage/saison-20-21/profis/kimmich/200918_kimmich_get.jpg"
        ),
        PlayerModel(
            "Manuel Neuer",
            "Goalkeeper",
            85000,
            "https://img.fcbayern.com/image/upload/t_cms-6x9-seo/v1687851641/cms/public/images/fcbayern-com/players/spielerportraits/ganzkoerper/manuel_neuer.png"
        ),
        PlayerModel(
            "David Alaba",
            "Defender",
            80000,
            "https://img.fcbayern.com/image/upload/t_cms-1x1-seo/v1604326652/cms/public/images/fcbayern-com/players/spielerportraits/ganzkoerper/david_alaba_.png"
        )
    )

    val dortmundPlayers = listOf(
        PlayerModel(
            "Emre Can",
            "Midfielder",
            85000,
            "https://pbs.twimg.com/profile_images/1223318186369650688/y3RgCmic_400x400.jpg"
        ),
        PlayerModel(
            "Marco Reus",
            "Forward",
            80000,
            "https://b.fssta.com/uploads/application/soccer/headshots/2104.png"
        ),
        PlayerModel(
            "Thorgan Hazard",
            "Midfielder",
            70000,
            "https://assets-es.imgfoot.com/media/cache/1200x1200/thorgan-hazard-2223-3.jpg"
        ),
        PlayerModel(
            "Roman Burki",
            "Goalkeeper",
            75000,
            "https://www.fussballeuropa.com/images/xtra/roman-burki-2018.jpg"
        ),
        PlayerModel(
            "Mats Hummels",
            "Defender",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/1/1d/Mats_Hummels_Champions_for_Charity_2022_%28cropped%29.jpg"
        )
    )

    val rbLeipzigPlayers = listOf(
        PlayerModel(
            "Timo Werner",
            "Forward",
            85000,
            "https://img.a.transfermarkt.technology/portrait/big/170527-1663686137.jpg?lm=1"
        ),
        PlayerModel(
            "Emil Forsberg",
            "Midfielder",
            75000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blte0b7378342ff91b4/60da72d8993b0438463ed5d4/e12becb3e86ce0fa25caaf75216d177338f020c5.jpg"
        ),
        PlayerModel(
            "Dayot Upamecano",
            "Defender",
            80000,
            "https://cdn.vox-cdn.com/thumbor/jOAXj4CWJCJRoVUcafpEV8dnB6o=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/24787688/1500257845.jpg"
        ),
        PlayerModel(
            "Peter Gulacsi",
            "Goalkeeper",
            75000,
            "https://tmssl.akamaized.net/images/foto/galerie/peter-gulacsi-1432899182-4699.jpg?lm=1483605985"
        ),
        PlayerModel(
            "Marcel Sabitzer",
            "Midfielder",
            75000,
            "https://cdn.vox-cdn.com/thumbor/A3KZpjuww6Vt2JoXZvA6v27xJD4=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/24801292/1546420494.jpg"
        )
    )

    val gladbachPlayers = listOf(
        PlayerModel(
            "Marcus Thuram",
            "Forward",
            75000,
            "https://tmssl.akamaized.net/images/foto/galerie/marcus-thuram-france-francia-frankreich-2022-1687871884-110137.jpg?lm=1687871901"
        ),
        PlayerModel(
            "Alassane Plea",
            "Forward",
            70000,
            "https://s.bundesliga.com/assets/img/1190000/1183711_imgw968.jpg"
        ),
        PlayerModel(
            "Denis Zakaria",
            "Midfielder",
            75000,
            "https://gianlucadimarzio.com/images/zakaria-image.jpg?p=intextimg&s=627ad3e84745217c1420d9e7602c4e13"
        ),
        PlayerModel(
            "Yann Sommer",
            "Goalkeeper",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/42205-1669897427.jpg?lm=1"
        ),
        PlayerModel(
            "Matthias Ginter",
            "Defender",
            70000,
            "https://img.olympicchannel.com/images/image/private/t_1-1_300/f_auto/primary/xns95cvc9zxvsdupj3zh"
        )
    )

    val leverkusenPlayers = listOf(
        PlayerModel(
            "Kai Havertz",
            "Midfielder",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Kai-Havertz-August-2018.jpg/800px-Kai-Havertz-August-2018.jpg"
        ),
        PlayerModel(
            "Moussa Diaby",
            "Forward",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/d/d5/Moussa_Diaby%2C_2022-07-31%2C_Saisoner%C3%B6ffnung_Bayer_04%2C_Leverkusen_%281%29.jpg"
        ),
        PlayerModel(
            "Jonathan Tah",
            "Defender",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/0/0f/Jonathan_Tah_2019.jpg"
        ),
        PlayerModel(
            "Lukas Hradecky",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Luk%C3%A1%C5%A1_Hr%C3%A1deck%C3%BD%2C_2022-07-31%2C_Saisoner%C3%B6ffnung_Bayer_04%2C_Leverkusen_%281%29.jpg/1200px-Luk%C3%A1%C5%A1_Hr%C3%A1deck%C3%BD%2C_2022-07-31%2C_Saisoner%C3%B6ffnung_Bayer_04%2C_Leverkusen_%281%29.jpg"
        ),
        PlayerModel(
            "Nadiem Amiri",
            "Midfielder",
            70000,
            "https://frenchfootballweekly.com/wp-content/uploads/2023/08/Nadiem-Amiri-finally-says-no-to-OM.jpg"
        )
    )
    val wolfsburgPlayers = listOf(
        PlayerModel(
            "Wout Weghorst",
            "Forward",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/0/09/Wout_Weghorst_2019.jpg"
        ),
        PlayerModel(
            "Renato Steffen",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/9/9c/Renato_Steffen_2017.jpg"
        ),
        PlayerModel(
            "Maxence Lacroix",
            "Defender",
            70000,
            "https://i2-prod.hampshirelive.news/incoming/article7534961.ece/ALTERNATES/s1200c/1_Maxence-Lacroix.jpg"
        ),
        PlayerModel(
            "Koen Casteels",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/a/ad/Casteels_Koen.jpg"
        ),
        PlayerModel(
            "Xaver Schlager",
            "Midfielder",
            70000,
            "https://img.a.transfermarkt.technology/portrait/big/223979-1663686398.jpg?lm=1"
        )
    )

    val frankfurtPlayers = listOf(
        PlayerModel(
            "Andre Silva",
            "Forward",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/4/48/Mex-por-16_%281cropped%29.jpg"
        ),
        PlayerModel(
            "Filip Kostic",
            "Midfielder",
            75000,
            "https://cdn.vox-cdn.com/thumbor/uqCkS3hpSgsZekeCjB8_ecEhBB4=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/24538232/1475126785.jpg"
        ),
        PlayerModel(
            "Evan Ndicka",
            "Defender",
            70000,
            "https://img.a.transfermarkt.technology/portrait/big/371149-1663064716.jpg?lm=1"
        ),
        PlayerModel(
            "Kevin Trapp",
            "Goalkeeper",
            75000,
            "https://www.bkeeper-sport.com/wp-content/uploads/2022/01/Gardien-de-foot-Kevin-Trapp-Allemagne-2.jpg"
        ),
        PlayerModel(
            "Djibril Sow",
            "Midfielder",
            70000,
            "https://img.a.transfermarkt.technology/portrait/big/212723-1663065652.jpg?lm=1"
        )
    )

    val herthaPlayers = listOf(
        PlayerModel(
            "Matheus Cunha",
            "Forward",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/517894-1599989718.jpg?lm=1"
        ),
        PlayerModel(
            "Vladimir Darida",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/5/52/Vladim%C3%ADr_Darida_20180601_AUSCZE_3910_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Dedryck Boyata",
            "Defender",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/c/ce/Bel-Tun_%2823%29_2_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Alexander Schwolow",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Alexander_Schwolow.jpg/640px-Alexander_Schwolow.jpg"
        ),
        PlayerModel(
            "Nemanja Radonjic",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/4/47/Radonjic_2018.jpg"
        )
    )

    val augsburgPlayers = listOf(
        PlayerModel(
            "Florian Niederlechner",
            "Forward",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/5/58/Florian_Niederlechner_2017.jpg"
        ),
        PlayerModel(
            "Daniel Caligiuri",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/c/c1/Daniel_Caligiuri.jpg"
        ),
        PlayerModel(
            "Felix Uduokhai",
            "Defender",
            70000,
            "https://tmssl.akamaized.net/images/foto/galerie/-felix-uduokhai-fc-augsburg-1572603652-27081.jpg?lm=1572603665"
        ),
        PlayerModel(
            "Rafal Gikiewicz",
            "Goalkeeper",
            70000,
            "https://s.hs-data.com/bilder/spieler/gross/119728.jpg?fallback=png"
        ),
        PlayerModel("Ruben Vargas", "Midfielder", 70000, "https://example.com/ruben_vargas.png")
    )

    val stuttgartPlayers = listOf(
        PlayerModel(
            "Sasa Kalajdzic",
            "Forward",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/8/8c/Sasa_kalajdzic.jpg"
        ),
        PlayerModel(
            "Daniel Didavi",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/6/67/Daniel_didavi1.jpg"
        ),
        PlayerModel(
            "Marc Oliver Kempf",
            "Defender",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/9/91/Marc-Oliver_Kempf.jpg"
        ),
        PlayerModel(
            "Gregor Kobel",
            "Goalkeeper",
            70000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt6dae3c05f4da3c33/646231ca64e87b3460f66afc/GOAL_-_Blank_WEB_-_Facebook_-_2023-05-15T141930.646.png?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "Wataru Endo",
            "Midfielder",
            70000,
            "https://e0.365dm.com/23/08/1600x900/skysports-endo-wataru-stuttgart_6253156.jpg?20230816211931"
        )
    )
    val realMadridPlayers = listOf(
        PlayerModel(
            "Vinicius",
            "Forward",
            90000,
            "https://assets-fr.imgfoot.com/media/cache/1200x900/viniciusjr-646b05af695e9.jpg"
        ),
        PlayerModel(
            "Luka Modric",
            "Midfielder",
            85000,
            "https://www.realmadrid.com/cs/Satellite?blobcol=urldata&blobheader=image%2Fpng&blobkey=id&blobtable=MungoBlobs&blobwhere=1203436407421&ssbinary=true"
        ),
        PlayerModel(
            "Nacho",
            "Defender",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/9/93/Nacho_Fern%C3%A1ndez.jpg"
        ),
        PlayerModel(
            "Thibaut Courtois",
            "Goalkeeper",
            85000,
            "https://image-prod.iol.co.za/16x9/800/Belgian-goalkeeper-Thibaut-Courtois-in-action-for-Real-Madrid?source=https://xlibris.public.prod.oc.inl.infomaker.io:8443/opencontent/objects/bdbb10dc-4a24-534b-a494-920055cbd933&operation=CROP&offset=0x41&resize=3000x1686"
        ),
        PlayerModel(
            "Toni Kroos",
            "Midfielder",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/CSKA-RM18_%287%29_%28cropped%29.jpg/220px-CSKA-RM18_%287%29_%28cropped%29.jpg"
        )
    )

    val barcelonaPlayers = listOf(
        PlayerModel(
            "Lewandowski",
            "Forward",
            95000,
            "https://www.fcbarcelona.com/photo-resources/2022/11/02/85247947-27dc-488c-a6cb-d81c5e391559/09-ROBERT_LEWANDOWSKI.jpg?width=1200&height=750"
        ),
        PlayerModel(
            "Frenkie de Jong",
            "Midfielder",
            85000,
            "https://www.fcbarcelona.com/photo-resources/2022/11/02/87c170bf-189d-448c-87d9-9f6c84838f40/21-FRENKIE_DE_JONG.jpg?width=1200&height=750"
        ),
        PlayerModel(
            "Araújo",
            "Defender",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/FC_Red_Bull_Salzburg_gegen_CF_Barcelona_%28Testspiel_4._August_2021%29_45.jpg/268px-FC_Red_Bull_Salzburg_gegen_CF_Barcelona_%28Testspiel_4._August_2021%29_45.jpg"
        ),
        PlayerModel(
            "Marc-Andre ter Stegen",
            "Goalkeeper",
            85000,
            "https://cdn.vox-cdn.com/thumbor/_KXq7Davho_5t7597HVV7xuVNBg=/0x0:3333x5000/1400x933/filters:focal(1454x740:1986x1272):no_upscale()/cdn.vox-cdn.com/uploads/chorus_image/image/72067128/1473048299.0.jpg"
        ),
        PlayerModel(
            "Ansu Fati",
            "Forward",
            80000,
            "https://www.fcbarcelona.com/photo-resources/2022/11/02/65cc4f69-2c91-4ab9-8576-d5596431eb49/10-ANSU_FATI.jpg?width=1200&height=750"
        )
    )

    val atleticoMadridPlayers = listOf(
        PlayerModel(
            "Griezmann",
            "Forward",
            90000,
            "https://media.gettyimages.com/id/1497344453/photo/villarreal-cf-v-atletico-de-madrid-laliga-santander.jpg?s=2048x2048&w=gi&k=20&c=IW9LGk5LkT2DGwJJAlFKD6oB-r8dOwxTcfwZ3qKmyHA="
        ),
        PlayerModel(
            "Koke",
            "Midfielder",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/1/17/Koke_2019.jpg"
        ),
        PlayerModel(
            "Jose Gimenez",
            "Defender",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/5/5d/Jos%C3%A9_Mar%C3%ADa_Gim%C3%A9nez.jpg"
        ),
        PlayerModel(
            "Jan Oblak",
            "Goalkeeper",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Jan_Oblak_2019.jpg/800px-Jan_Oblak_2019.jpg"
        ),
        PlayerModel(
            "Joao Felix",
            "Forward",
            85000,
            "https://img.a.transfermarkt.technology/portrait/big/462250-1668165358.jpg?lm=1"
        )
    )

    val sevillaPlayers = listOf(
        PlayerModel(
            "Youssef En-Nesyri",
            "Forward",
            75000,
            "https://static.standard.co.uk/2023/08/16/20/newFile-2.jpg?width=1200&auto=webp&quality=75"
        ),
        PlayerModel(
            "Ivan Rakitic",
            "Midfielder",
            80000,
            "https://icdn.football-espana.net/wp-content/uploads/2023/04/Ivan-Rakitic.jpg"
        ),
        PlayerModel(
            "Diego Carlos",
            "Defender",
            75000,
            "https://e0.365dm.com/22/01/2048x1152/skysports-deigo-carlos-sevilla_5640607.jpg"
        ),
        PlayerModel(
            "Bono",
            "Goalkeeper",
            75000,
            "https://cdn.vox-cdn.com/thumbor/6-7f2Xn9xaiEICJ-cW_UFD_V__s=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/24784235/1258441844.jpg"
        ),
        PlayerModel(
            "Lucas Ocampos",
            "Forward",
            80000,
            "https://static.onzemondial.com/8/2023/02/photo_article/820823/327572/1200-L-fc-sville-lucas-ocampos-roi-d-andalousie.jpg"
        )
    )

    val valenciaPlayers = listOf(
        PlayerModel(
            "Carlos Soler",
            "Midfielder",
            80000,
            "https://getfootballnewsspain.com/wp-content/uploads/2022/08/spain-v-portugal-uefa-nations-league-league-path-group-2-6.jpg"
        ),
        PlayerModel(
            "Maxi Gomez",
            "Forward",
            75000,
            "https://static.wikia.nocookie.net/fifa/images/7/79/Maxi_G%C3%B3mez.jpg/revision/latest?cb=20230813143535"
        ),
        PlayerModel(
            "Jose Gaya",
            "Defender",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/c/c2/Jose_Gaya_2015_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Jasper Cillessen",
            "Goalkeeper",
            75000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blta72915f83f64e405/60dc419fddcd520eeb8d35f5/4e04c057a3a0c2960259530188159a1f5a0ac9de.jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "Daniel Wass",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/7/79/Daniel_Wass_2019.jpg"
        )
    )

    val realSociedadPlayers = listOf(
        PlayerModel(
            "Mikel Oyarzabal",
            "Forward",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/f/f1/UEFA_EURO_qualifiers_Sweden_vs_Spain_20191015_108_%28cropped%29.jpg"
        ),
        PlayerModel(
            "David Silva",
            "Midfielder",
            85000,
            "https://img.a.transfermarkt.technology/portrait/big/35518-1683269363.jpg?lm=1"
        ),
        PlayerModel(
            "Robin Le Normand",
            "Defender",
            70000,
            "https://www.footballdatabase.eu/images/photos/players/2020-2021/a_218/218256.jpg"
        ),
        PlayerModel(
            "Alex Remiro",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Alex_Remiro.jpg/640px-Alex_Remiro.jpg"
        ),
        PlayerModel(
            "Adnan Januzaj",
            "Midfielder",
            70000,
            "https://upload.wikimedia.org/wikipedia/commons/0/09/Adnan_Januzaj_%28cropped%29.JPG"
        )
    )

    val villarrealPlayers = listOf(
        PlayerModel(
            "Gerard Moreno",
            "Forward",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/9/9c/UEFA_EURO_qualifiers_Sweden_vs_Spain_20191015_138_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Dani Parejo",
            "Midfielder",
            80000,
            "https://s.hs-data.com/bilder/spieler/gross/100906.jpg"
        ),
        PlayerModel(
            "Pau Torres",
            "Defender",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/399776-1691079911.jpg?lm=1"
        ),
        PlayerModel(
            "Sergio Asenjo",
            "Goalkeeper",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/51710-1447254975.jpg?lm=1"
        ),
        PlayerModel(
            "Samuel Chukwueze",
            "Forward",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/b/ba/Samu_Chukwueze.jpg"
        )
    )
    val realBetisPlayers = listOf(
        PlayerModel(
            "Nabil Fekir",
            "Forward",
            80000,
            "https://img.a.transfermarkt.technology/portrait/big/203496-1653041152.jpg?lm=1"
        ),
        PlayerModel(
            "Guido Rodriguez",
            "Midfielder",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/4/4e/Guido_Rodr%C3%ADguez.png"
        ),
        PlayerModel(
            "Aissa Mandi",
            "Defender",
            70000,
            "https://alchetron.com/cdn/assa-mandi-2685203e-80bf-4e0d-9fe1-08732046e8b-resize-750.jpeg"
        ),
        PlayerModel(
            "Claudio Bravo",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/4/44/Chile_VS._Australia_%281cropped%29.jpg"
        ),
        PlayerModel(
            "Cristian Tello",
            "Midfielder",
            70000,
            "https://transfery.info/img/photos/86895/1500xauto/cristian-tello.jpg"
        )
    )
    val athleticBilbaoPlayers = listOf(
        PlayerModel(
            "Inaki Williams",
            "Forward",
            80000,
            "https://cdn.vanguardngr.com/wp-content/uploads/2023/01/Inaki-Williams.jpg"
        ),
        PlayerModel(
            "Unai Lopez",
            "Midfielder",
            75000,
            "https://assets.laliga.com/squad/2023/t184/p183462/2048x2225/p183462_t184_2023_0_001_000.png"
        ),
        PlayerModel(
            "Inigo Martinez",
            "Defender",
            75000,
            "https://www.estadiodeportivo.com/imagenes/3a943bc5-1bfa-4fc1-b368-502af5875525_1200x680.jpeg"
        ),
        PlayerModel(
            "Unai Simon",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/a/a9/Unai_Sim%C3%B3n_Mendibil.jpg"
        ),
        PlayerModel(
            "Dani Garcia",
            "Midfielder",
            70000,
            "https://tmssl.akamaized.net/images/foto/galerie/dani-garcia-athletic-1590746825-39938.jpg?lm=1590746839"
        )
    )
    val celtaVigoPlayers = listOf(
        PlayerModel(
            "Iago Aspas",
            "Forward",
            85000,
            "https://assets.laliga.com/assets/2020/12/22/xlarge/1c7f91274c918e4f04e7ceddd1d65058.jpeg"
        ),
        PlayerModel(
            "Renato Tapia",
            "Midfielder",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/c/cd/Renato_Tapia_ECUADOR_VS_PERU_-_RUSIA_2018_%2837051721495%29_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Joseph Aidoo",
            "Defender",
            70000,
            "https://cms.footballghana.com/wp-content/uploads/2023/04/phpThumb_generated_thumbnail.jpeg"
        ),
        PlayerModel(
            "Ruben Blanco",
            "Goalkeeper",
            75000,
            "https://www.getfootballnewsfrance.com/assets/sl-benfica-v-rc-celta-de-vigo-pre-season-friendly-scaled.webp"
        ),
        PlayerModel(
            "Denis Suarez",
            "Midfielder",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/7/75/Denis_Su%C3%A1rez_%28cropped%29.jpg"
        )
    )
    val juventusPlayers = listOf(
        PlayerModel(
            "Chiesa",
            "Forward",
            95000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt4b4fd9c727526b93/61fd7949bcfd5d01a3dd3063/chiesa_juventus.jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "kostic",
            "Forward",
            85000,
            "https://cdn.tuttosport.com/img/990/495/2023/03/29/152242993-05547a41-b9cf-411b-a4d9-52d24f56fa2f.jpg"
        ),
        PlayerModel(
            "Giorgio Chiellini",
            "Defender",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/3/30/Chiellini_Mancini_Gravina_Mattarella_2021_%28Giorgio_Chiellini%29.jpg"
        ),
        PlayerModel(
            "Wojciech Szczesny",
            "Goalkeeper",
            85000,
            "https://upload.wikimedia.org/wikipedia/commons/0/01/Wojciech_Szcz%C4%99sny_Juventus_%28cropped%29_%28cropped%29.jpg"
        ),
        PlayerModel(
            "Rabiot",
            "Midfielder",
            80000,
            "https://cdn.theathletic.com/cdn-cgi/image/width=1200,height=1200,fit=cover/app/uploads/2022/08/08153306/GettyImages-1396809835-scaled-e1659987216322.jpg"
        )
    )

    val interMilanPlayers = listOf(
        PlayerModel(
            "Romelu Lukaku",
            "Forward",
            90000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blt37461394f314b9c3/64c69023876c1beabbdfa03c/GettyImages-1497868809.jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "Lautaro Martinez",
            "Forward",
            85000,
            "https://s.hs-data.com/bilder/spieler/gross/335049.jpg"
        ),
        PlayerModel("Stefan de Vrij", "Defender", 80000, "https://example.com/stefan_de_vrij.png"),
        PlayerModel(
            "Samir Handanovic",
            "Goalkeeper",
            85000,
            "https://s.hs-data.com/bilder/spieler/gross/158366.jpg"
        ),
        PlayerModel(
            "Nicolò Barella",
            "Midfielder",
            80000,
            "https://tmssl.akamaized.net/images/foto/galerie/nicolo-barella-inter-2022-1660303898-90072.jpg?lm=1660303917"
        )
    )
    val acMilanPlayers = listOf(
        PlayerModel(
            "Zlatan Ibrahimovic",
            "Forward",
            90000,
            "https://tmssl.akamaized.net/images/foto/galerie/zlatan-ibrahimovic-ac-mailand-1603008323-49388.jpg?lm=1603008348"
        ),
        PlayerModel(
            "Mike Maignan",
            "Goalkeeper",
            85000,
            "https://s.hs-data.com/bilder/spieler/gross/210864.jpg"
        ),
        PlayerModel(
            "Theo Hernandez",
            "Defender",
            80000,
            "https://s.hs-data.com/bilder/spieler/gross/284490.jpg"
        ),
        PlayerModel(
            "Franck Kessie",
            "Midfielder",
            80000,
            "https://cdn.vox-cdn.com/thumbor/XTbnaFTAobP1ry4JNv1ATS_x2RE=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/23215212/1368231157.jpg"
        ),
        PlayerModel(
            "Loftus Cheek",
            "Midfielder",
            80000,
            "https://www.thesun.ie/wp-content/uploads/sites/3/2023/08/RAS-OFF-PLATFORM-RUBEN-LOFTUS-CHEEK.jpg?strip=all&quality=100&w=1920&h=1080&crop=1"
        )
    )
    val napoliPlayers = listOf(
        PlayerModel(
            "Lorenzo Insigne",
            "Forward",
            85000,
            "https://img.a.transfermarkt.technology/portrait/big/133964-1678202801.jpg?lm=1"
        ),
        PlayerModel(
            "Dries Mertens",
            "Forward",
            80000,
            "https://i.guim.co.uk/img/media/b3c52fed09e8ebc633eb34ce9759184ba88c7dd7/0_62_4000_2400/master/4000.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=77e5ce84d680615b0ccdbe37854109ad"
        ),
        PlayerModel(
            "Kalidou Koulibaly",
            "Defender",
            80000,
            "https://img.a.transfermarkt.technology/portrait/big/93128-1668757490.jpg?lm=1"
        ),
        PlayerModel(
            "Alex Meret",
            "Goalkeeper",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/240414-1595847422.jpg?lm=1"
        ),
        PlayerModel(
            "Fabian Ruiz",
            "Midfielder",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/UEFA_EURO_qualifiers_Sweden_vs_Spain_20191015_Fabian_Ruiz_6_%28cropped%29.jpg/800px-UEFA_EURO_qualifiers_Sweden_vs_Spain_20191015_Fabian_Ruiz_6_%28cropped%29.jpg"
        )
    )
    val asRomaPlayers = listOf(
        PlayerModel(
            "Edin Dzeko",
            "Forward",
            85000,
            "https://img.a.transfermarkt.technology/portrait/big/28396-1661268909.jpg?lm=1"
        ),
        PlayerModel(
            "Lorenzo Pellegrini",
            "Midfielder",
            80000,
            "https://tmssl.akamaized.net/images/foto/galerie/lorenzo-pellegrini-roma-1632214965-71416.jpg?lm=1632214974"
        ),
        PlayerModel(
            "Chris Smalling",
            "Defender",
            75000,
            "https://assets.goal.com/v3/assets/bltcc7a7ffd2fbf71f5/blte4e614bf533d9f1d/634fe188518a0d1128da9839/Chris_Smalling_Roma_2022-23.jpg?auto=webp&format=pjpg&width=3840&quality=60"
        ),
        PlayerModel(
            "Pau Lopez",
            "Goalkeeper",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/2/2f/Pau_Lopez_2019.jpg"
        ),
        PlayerModel(
            "Jordan Veretout",
            "Midfielder",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/6/66/Jordan_Veretout.jpg"
        )
    )

    val lazioPlayers = listOf(
        PlayerModel(
            "Ciro Immobile",
            "Forward",
            85000,
            "https://img.a.transfermarkt.technology/portrait/big/105521-1682689697.jpg?lm=1"
        ),
        PlayerModel(
            "Luis Alberto",
            "Midfielder",
            80000,
            "https://tmssl.akamaized.net/images/foto/galerie/luis-alberto-lazio-1583246449-33062.jpg?lm=1583246466"
        ),
        PlayerModel(
            "Francesco Acerbi",
            "Defender",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/7/78/Francesco_Acerbi_2021.jpg"
        ),
        PlayerModel("Pepe Reina", "Goalkeeper", 75000, "https://example.com/pepe_reina.png"),
        PlayerModel(
            "Sergej Milinkovic-Savic",
            "Midfielder",
            80000,
            "https://e2.365dm.com/12/09/800x600/Pepe-Reina-Liverpool-Player-Profile_2835455.jpg?20140724145315"
        )
    )
    val atalantaPlayers = listOf(
        PlayerModel(
            "Duvan Zapata",
            "Forward",
            80000,
            "https://img.a.transfermarkt.technology/portrait/big/73794-1661508410.jpg?lm=1"
        ),
        PlayerModel(
            "Josip Ilicic",
            "Forward",
            80000,
            "https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg)/origin-imgresizer.eurosport.com/2020/03/11/2792729-57638590-2560-1440.jpg"
        ),
        PlayerModel(
            "Cristian Romero",
            "Defender",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/355915-1665609429.jpg?lm=1"
        ),
        PlayerModel(
            "Pierluigi Gollini",
            "Goalkeeper",
            75000,
            "https://d2x51gyc4ptf2q.cloudfront.net/content/uploads/2022/06/02185031/Pierluigi-Gollini-Tottenham-F365.jpg"
        ),
        PlayerModel(
            "Alejandro Gomez",
            "Midfielder",
            80000,
            "https://upload.wikimedia.org/wikipedia/commons/e/eb/Papu_Gomez_02.jpg"
        )
    )
    val fiorentinaPlayers = listOf(
        PlayerModel(
            "Dusan Vlahovic",
            "Forward",
            75000,
            "https://images2.minutemediacdn.com/image/fetch/https%3A%2F%2Ftherealchamps.com%2Fwp-content%2Fuploads%2Fgetty-images%2F2017%2F07%2F1491354248-scaled.jpeg"
        ),
        PlayerModel(
            "Gaetano Castrovilli",
            "Midfielder",
            75000,
            "https://tmssl.akamaized.net/images/foto/galerie/gaetano-castrovilli-acf-fiorentina-1594710981-43436.jpg?lm=1594710959"
        ),
        PlayerModel(
            "Nikola Milenkovic",
            "Defender",
            70000,
            "https://cdn.vox-cdn.com/thumbor/39NV52HYqiG4jS-xHn0bXlHe9UY=/0x0:3000x1998/1200x800/filters:focal(1247x18:1727x498)/cdn.vox-cdn.com/uploads/chorus_image/image/69746983/1234660764.0.jpg"
        ),
        PlayerModel(
            "Bartlomiej Dragowski",
            "Goalkeeper",
            75000,
            "https://tmssl.akamaized.net/images/foto/galerie/bartlomiej-dragowski-spezia-2022-23-1661778740-91279.jpg?lm=1661778763"
        ),
        PlayerModel(
            "Franck Ribery",
            "Midfielder",
            80000,
            "https://img.a.transfermarkt.technology/portrait/big/22068-1663667692.jpg?lm=1"
        )
    )
    val sampdoriaPlayers = listOf(
        PlayerModel(
            "Fabio Quagliarella",
            "Forward",
            75000,
            "https://upload.wikimedia.org/wikipedia/commons/d/db/Zenit-Torino_%287%29.jpg"
        ),
        PlayerModel(
            "Morten Thorsby",
            "Midfielder",
            70000,
            "https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/155A0/production/_126965478_mortenthorsby.jpg"
        ),
        PlayerModel(
            "Maya Yoshida",
            "Defender",
            70000,
            "https://img.a.transfermarkt.technology/portrait/big/81789-1657108603.jpg?lm=1"
        ),
        PlayerModel(
            "Emil Audero",
            "Goalkeeper",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/256339-1663679682.jpg?lm=1"
        ),
        PlayerModel(
            "Albin Ekdal",
            "Midfielder",
            70000,
            "https://elitefootball-assets.s3-eu-west-1.amazonaws.com/players/72ebab9b3e37f4d855edfd328f1f3efa.jpg"
        )
    )

    val udinesePlayers = listOf(
        PlayerModel(
            "Rodrigo De Paul",
            "Midfielder",
            80000,
            "https://getfootballnewsspain.com/wp-content/uploads/2022/12/argentina-v-australia-round-of-16-fifa-world-cup-qatar-2022.jpg"
        ),
        PlayerModel(
            "Kevin Lasagna",
            "Forward",
            75000,
            "https://img.a.transfermarkt.technology/portrait/big/131951-1663671617.jpg?lm=1"
        ),
        PlayerModel(
            "Sebastian De Maio",
            "Defender",
            70000,
            "https://s.hs-data.com/bilder/spieler/gross/59667.jpg"
        ),
        PlayerModel(
            "Juan Musso",
            "Goalkeeper",
            75000,
            "https://cdn.fotospor.com/wp-content/uploads/2023/06/28/28062023115348_8594020_11_53-1.jpg"
        ),
        PlayerModel(
            "Roberto Pereyra",
            "Midfielder",
            80000,
            "https://tmssl.akamaized.net/images/foto/galerie/roberto-pereyra-1401738957-209.jpg?lm=1483605490"
        )
    )

    val englishPremierTeams = listOf(
        TeamsModel(
            "Manchester City",
            "https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/800px-Manchester_City_FC_badge.svg.png",
            manchesterCityPlayers
        ),
        TeamsModel(
            "Liverpool",
            "https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/1200px-Liverpool_FC.svg.png",
            liverpoolPlayers
        ),
        TeamsModel(
            "Chelsea",
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/cc/Chelsea_FC.svg/800px-Chelsea_FC.svg.png",
            chelseaPlayers
        ),
        TeamsModel(
            "Manchester United",
            "https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/1200px-Manchester_United_FC_crest.svg.png",
            manchesterUnitedPlayers
        ),
        TeamsModel(
            "Arsenal",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/5/53/Arsenal_FC.svg/1200px-Arsenal_FC.svg.png",
            arsenalPlayers
        ),
        TeamsModel(
            "Tottenham Hotspur",
            "https://upload.wikimedia.org/wikipedia/en/thumb/b/b4/Tottenham_Hotspur.svg/1200px-Tottenham_Hotspur.svg.png",
            tottenhamPlayers
        ),
        TeamsModel(
            "Leicester City",
            "https://upload.wikimedia.org/wikipedia/en/thumb/2/2d/Leicester_City_crest.svg/1200px-Leicester_City_crest.svg.png",
            leicesterPlayers
        ),
        TeamsModel(
            "Everton",
            "https://upload.wikimedia.org/wikipedia/ru/0/07/Everton_F.C._%282014%E2%80%93%29.png",
            evertonPlayers
        ),
        TeamsModel(
            "West Ham United",
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/c2/West_Ham_United_FC_logo.svg/1200px-West_Ham_United_FC_logo.svg.png",
            westHamPlayers
        ),
        TeamsModel(
            "Aston Villa",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/7/79/FC_Aston_Villa_Logo.svg/1200px-FC_Aston_Villa_Logo.svg.png",
            astonVillaPlayers
        )
    )

    val bundesligaTeams = listOf(
        TeamsModel(
            "Bayern Munich",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/800px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png",
            bayernMunichPlayers
        ),
        TeamsModel(
            "Borussia Dortmund",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Borussia_Dortmund_logo.svg/1200px-Borussia_Dortmund_logo.svg.png",
            dortmundPlayers
        ),
        TeamsModel(
            "RB Leipzig",
            "https://upload.wikimedia.org/wikipedia/en/thumb/0/04/RB_Leipzig_2014_logo.svg/800px-RB_Leipzig_2014_logo.svg.png",
            rbLeipzigPlayers
        ),
        TeamsModel(
            "Borussia Monchengladbach",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Borussia_M%C3%B6nchengladbach_logo.svg/1200px-Borussia_M%C3%B6nchengladbach_logo.svg.png",
            gladbachPlayers
        ),
        TeamsModel(
            "Bayer Leverkusen",
            "https://upload.wikimedia.org/wikipedia/en/thumb/5/59/Bayer_04_Leverkusen_logo.svg/1200px-Bayer_04_Leverkusen_logo.svg.png",
            leverkusenPlayers
        ),
        TeamsModel(
            "VfL Wolfsburg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/VfL_Wolfsburg_Logo.svg/1200px-VfL_Wolfsburg_Logo.svg.png",
            wolfsburgPlayers
        ),
        TeamsModel(
            "Eintracht Frankfurt",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Eintracht_Frankfurt_Logo.svg/1200px-Eintracht_Frankfurt_Logo.svg.png",
            frankfurtPlayers
        ),
        TeamsModel(
            "Hertha BSC",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Hertha_BSC_Logo_2012.svg/640px-Hertha_BSC_Logo_2012.svg.png",
            herthaPlayers
        ),
        TeamsModel(
            "FC Augsburg",
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/c5/FC_Augsburg_logo.svg/1200px-FC_Augsburg_logo.svg.png",
            augsburgPlayers
        ),
        TeamsModel(
            "VfB Stuttgart",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/VfB_Stuttgart_1893_Logo.svg/1200px-VfB_Stuttgart_1893_Logo.svg.png",
            stuttgartPlayers
        )
    )

    val laLigaTeams = listOf(
        TeamsModel(
            "Real Madrid",
            "https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/1200px-Real_Madrid_CF.svg.png",
            realMadridPlayers
        ),
        TeamsModel(
            "Barcelona",
            "https://upload.wikimedia.org/wikipedia/en/thumb/4/47/FC_Barcelona_%28crest%29.svg/1200px-FC_Barcelona_%28crest%29.svg.png",
            barcelonaPlayers
        ),
        TeamsModel(
            "Atletico Madrid",
            "https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Atletico_Madrid_2017_logo.svg/1200px-Atletico_Madrid_2017_logo.svg.png",
            atleticoMadridPlayers
        ),
        TeamsModel(
            "Sevilla",
            "https://upload.wikimedia.org/wikipedia/ru/5/51/FC_Sevilla_logo.png",
            sevillaPlayers
        ),
        TeamsModel(
            "Valencia",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/6/66/Valencia_Cf_Logo_original.png/191px-Valencia_Cf_Logo_original.png",
            valenciaPlayers
        ),
        TeamsModel(
            "Real Sociedad",
            "https://upload.wikimedia.org/wikipedia/en/thumb/f/f1/Real_Sociedad_logo.svg/1200px-Real_Sociedad_logo.svg.png",
            realSociedadPlayers
        ),
        TeamsModel(
            "Villarreal",
            "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Villarreal_CF_logo-en.svg/1200px-Villarreal_CF_logo-en.svg.png",
            villarrealPlayers
        ),
        TeamsModel(
            "Real Betis",
            "https://upload.wikimedia.org/wikipedia/en/thumb/1/13/Real_betis_logo.svg/1200px-Real_betis_logo.svg.png",
            realBetisPlayers
        ),
        TeamsModel(
            "Athletic Bilbao",
            "https://upload.wikimedia.org/wikipedia/en/thumb/9/98/Club_Athletic_Bilbao_logo.svg/1200px-Club_Athletic_Bilbao_logo.svg.png",
            athleticBilbaoPlayers
        ),
        TeamsModel(
            "Celta Vigo",
            "https://upload.wikimedia.org/wikipedia/en/thumb/1/12/RC_Celta_de_Vigo_logo.svg/1200px-RC_Celta_de_Vigo_logo.svg.png",
            celtaVigoPlayers
        )
    )

    val seriaATeams = listOf(
        TeamsModel(
            "Juventus",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Juventus_FC_2017_icon_%28black%29.svg/1200px-Juventus_FC_2017_icon_%28black%29.svg.png",
            juventusPlayers
        ),
        TeamsModel(
            "Inter Milan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/FC_Internazionale_Milano_2021.svg/640px-FC_Internazionale_Milano_2021.svg.png",
            interMilanPlayers
        ),
        TeamsModel(
            "AC Milan",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Logo_of_AC_Milan.svg/640px-Logo_of_AC_Milan.svg.png",
            acMilanPlayers
        ),
        TeamsModel(
            "Napoli",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/SSC_Neapel.svg/640px-SSC_Neapel.svg.png",
            napoliPlayers
        ),
        TeamsModel(
            "AS Roma",
            "https://upload.wikimedia.org/wikipedia/en/thumb/f/f7/AS_Roma_logo_%282017%29.svg/800px-AS_Roma_logo_%282017%29.svg.png",
            asRomaPlayers
        ),
        TeamsModel(
            "Lazio",
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/S.S._Lazio_badge.svg/1200px-S.S._Lazio_badge.svg.png",
            lazioPlayers
        ),
        TeamsModel(
            "Atalanta",
            "https://upload.wikimedia.org/wikipedia/en/thumb/6/66/AtalantaBC.svg/1200px-AtalantaBC.svg.png",
            atalantaPlayers
        ),
        TeamsModel(
            "Fiorentina",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/2022_ACF_Fiorentina_logo.svg/1200px-2022_ACF_Fiorentina_logo.svg.png",
            fiorentinaPlayers
        ),
        TeamsModel(
            "Sampdoria",
            "https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/U.C._Sampdoria_logo.svg/1200px-U.C._Sampdoria_logo.svg.png",
            sampdoriaPlayers
        ),
        TeamsModel(
            "Udinese",
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/Udinese_Calcio_logo.svg/1200px-Udinese_Calcio_logo.svg.png",
            udinesePlayers
        )
    )
}
