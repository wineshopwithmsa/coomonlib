class CustomException(message: String) : RuntimeException(message)

object ExceptionHandler {
    fun handleException(e: Exception): String {
        return when (e) {
            is CustomException -> "Custom Exception: ${e.message}"
            else -> "General Exception: ${e.message}"
        }
    }
}