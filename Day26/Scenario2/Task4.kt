import java.time.LocalDate
import java.util.Scanner

// Define a data class to represent event details
data class Event(
    val name: String,
    val date: LocalDate,
    val attendeeCount: Int
)

fun main() {
    val scanner = Scanner(System.`in`)

    // Initialize variables to store event details
    var eventName: String
    var eventDate: LocalDate
    var attendeeCount: Int

    // Context menu for user interaction
    while (true) {
        println("1. Create a new event")
        println("2. Exit")
        print("Select an option: ")

        // Read user input
        val option = scanner.nextInt()

        when (option) {
            1 -> {
                println("Enter event name:")
                scanner.nextLine() // Consume newline character left by nextInt()

                eventName = scanner.nextLine()

                println("Enter event date (YYYY-MM-DD):")
                val dateString = scanner.nextLine()
                eventDate = LocalDate.parse(dateString)

                println("Enter number of attendees:")
                attendeeCount = scanner.nextInt()

                // Create an instance of Event
                val event = Event(eventName, eventDate, attendeeCount)

                // Display event details
                println("\nNew Event Created:")
                println("Event name: ${event.name}")
                println("Event date: ${event.date}")
                println("Number of attendees: ${event.attendeeCount}\n")
            }
            2 -> {
                println("Exiting program...")
                return
            }
            else -> {
                println("Invalid option. Please select again.\n")
            }
        }
    }
}
