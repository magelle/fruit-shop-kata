fun parse(entry: String): List<String> {
    return entry.split(",")
        .map { it.trim() }
}