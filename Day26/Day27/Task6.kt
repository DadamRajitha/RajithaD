import java.time.LocalDate

// Define a data class for the Event
data class Event(val name: String, val date: LocalDate)

// Display interface with a method to show event details
interface Display {
    fun showDetails()
}

// EventManager class implements Display interface to manage events
class EventManager : Display {

    // Mutable list to store events
    private val events = mutableListOf<Event>()

    // Method to add an event
    fun addEvent(event: Event) {
        events.add(event)
        println("Event '${event.name}' added on ${event.date}")
    }

    // Method to remove an event
    fun removeEvent(eventName: String): Boolean {
        val iterator = events.iterator()
        while (iterator.hasNext()) {
            val event = iterator.next()
            if (event.name == eventName) {
                iterator.remove()
                println("Event '$eventName' removed")
                return true
            }
        }
        println("Event '$eventName' not found")
        return false
    }

    // Method to print all events
    fun printEvents() {
        if (events.isEmpty()) {
            println("No events registered")
        } else {
            println("Events:")
            events.forEach { println("${it.name} - ${it.date}") }
        }
    }

    // Implementing the showDetails method from the Display interface
    override fun showDetails() {
        if (events.isEmpty()) {
            println("No events to display")
        } else {
            println("Event Details:")
            events.forEach { println("${it.name} on ${it.date}") }
        }
    }
}

fun main() {
    // Example usage of EventManager
    val eventManager = EventManager()

    // Adding events
    eventManager.addEvent(Event("Birthday Party", LocalDate.of(2024, 8, 10)))
    eventManager.addEvent(Event("Meeting", LocalDate.of(2024, 7, 20)))
    eventManager.addEvent(Event("Conference", LocalDate.of(2024, 9, 5)))

    // Using Display interface to show event details
    eventManager.showDetails()

    // Removing an event
    eventManager.removeEvent("Meeting")

    // Using Display interface to show event details after removal
    eventManager.showDetails()

    // Removing a non-existent event
    eventManager.removeEvent("Wedding")

    // Using Display interface to show event details after another removal attempt
    eventManager.showDetails()
}
