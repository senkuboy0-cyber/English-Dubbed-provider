@SuppressLint("NewApi")
    override val mainPage = mainPageOf(
        """$apiUrl?variables={"search":{"season":"Spring","year":2026},"limit":26,"page":%d,"translationType":"dub","countryOrigin":"ALL"}&extensions={"persistedQuery":{"version":1,"sha256Hash":"$maipageshaHash"}}""" to "New Series",
        """$apiUrl?variables={"search":{},"limit":26,"page":%d,"translationType":"dub","countryOrigin":"ALL"}&extensions={"persistedQuery":{"version":1,"sha256Hash":"$maipageshaHash"}}""" to "Latest Dub",
        """$apiUrl?variables={"type":"anime","size":30,"dateRange":1,"page":%d,"allowAdult":${settingsForProvider.enableAdult},"allowUnknown":false}&extensions={"persistedQuery":{"version":1,"sha256Hash":"$popularHash"}}""" to popularTitle,
        """$apiUrl?variables={"search":{"types":["Movie"]},"limit":26,"page":%d,"translationType":"dub","countryOrigin":"ALL"}&extensions={"persistedQuery":{"version":1,"sha256Hash":"$maipageshaHash"}}""" to movieTitle,
    )