/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {
    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )
    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle["maxSpeed"]
    val maxTank = vehicle["maxTank"]
    // TODO 3
    println("""
        Vehicle
        Type: $type
        Maximal Speed: $maxSpeed
        Maximal Tank: $maxTank
    """.trimIndent())

}