    android {
        // Set namespace based on module name
        namespace = when (project.name) {
            "AniDb" -> "com.anidb"
            "Anichi" -> "com.Anichi"
            "Anikage" -> "com.anikage"
            "Anineko" -> "com.anineko"
            else -> "com.${project.name.lowercase()}"
        }