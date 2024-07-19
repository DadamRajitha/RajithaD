import java.time.LocalDate

// Define a class to represent event details
data class Event(
    val name: String,
    val date: LocalDate,
    val attendeeCount: Int
)

fun main() {
    // Example usage
    val eventName = "Birthday Party"
    val eventDate = LocalDate.of(2024, 7, 18) // Example date
    val attendees = 20

    // Create an instance of Event
    val event = Event(eventName, eventDate, attendees)

    // Accessing properties of Event instance
    println("Event name: ${event.name}")
    println("Event date: ${event.date}")
    println("Number of attendees: ${event.attendeeCount}")
}
