companion object {
        // Verified API endpoints - confirmed working via curl test
        // Endpoint discovered from https://allmanga.to JavaScript bundles (cdn.allanime.day)
        // Tested with: GET https://api.allanime.day/api?variables=... → HTTP 200, valid JSON response
        const val apiUrl = "https://api.allanime.day/api"
        const val apiEndPoint = "https://api.allanime.day"
        const val anilistApi = "https://graphql.anilist.co"
        const val jikanApi = "https://api.jikan.moe/v4"

        private const val mainHash = "e42a4466d984b2c0a2cecae5dd13aa68867f634b16ee0f17b380047d14482406"
        private const val popularHash = "60f50b84bb545fa25ee7f7c8c0adbf8f5cea40f7b1ef8501cbbff70e38589489"
        private const val detailHash = "bb263f91e5bdd048c1c978f324613aeccdfe2cbc694a419466a31edb58c0cc0b"
        const val serverHash = "d405d0edd690624b66baba3068e0edc3ac90f1597d898a1ec8db4e5c43c00fec"
        const val maipageshaHash="a24c500a1b765c68ae1d8dd85174931f661c71369c89b92b88b75a725afc471c"
        val headers =
                mapOf(
                        "app-version" to "android_c-247",
                        "from-app" to "allanime",
                        "platformstr" to "android_c",
                        "Referer" to "https://allmanga.to"
                )
    }