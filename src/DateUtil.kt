object StringUtils {
    fun isNullOrEmpty(str: String?): Boolean {
        return str == null || str.isEmpty()
    }
}

object DateUtils {
    fun getCurrentDate(): String {
        return java.time.LocalDate.now().toString()
    }
}