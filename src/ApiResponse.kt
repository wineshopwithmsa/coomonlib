sealed class ApiResponse<out T> {
    data class Success<out T>(  val status: Int = 200,
                                val message: String = "Success",
                                val data: T? = null) : ApiResponse<T>()
    data class Error(val status: Int, val message: String) : ApiResponse<Nothing>()
    object Loading : ApiResponse<Nothing>()
}
