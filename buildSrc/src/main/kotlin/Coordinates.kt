object Coordinates {
    const val NAME = "RuneBox"
    const val DESC = "An Open-Source Third-Party Client and Framework for Old School RuneScape."
    const val VENDOR = "RuneBox"

    const val GIT_HOST = "github.com"
    const val REPO_ID = "runebox/runebox"

    const val GROUP = "io.runebox"
    const val VERSION = "0.0.1"
}

object Pom {
    val licenses = arrayOf(
        License("GPL-3.0", "https://www.gnu.org/licenses/gpl-3.0.txt")
    )
    val developers = arrayOf(
        Developer("laytodev", "Layto"),
        Developer("kyleescobar", "Kyle Escobar"),
    )
}

data class License(val name: String, val url: String, val distribution: String = "repo")
data class Developer(val id: String, val name: String = id)