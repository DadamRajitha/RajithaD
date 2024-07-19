import java.time.LocalDate

// Define a data class for the Event
data class Event(val name: String, val date: LocalDate)

// EventManager class to manage events
class EventManager {

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
}

fun main() {
    // Example usage of EventManager
    val eventManager = EventManager()

    // Adding events
    eventManager.addEvent(Event("Birthday Party", LocalDate.of(2024, 8, 10)))
    eventManager.addEvent(Event("Meeting", LocalDate.of(2024, 7, 20)))
    eventManager.addEvent(Event("Conference", LocalDate.of(2024, 9, 5)))

    // Printing all events
    eventManager.printEvents()

    // Removing an event
    eventManager.removeEvent("Meeting")

    // Printing events after removal
    eventManager.printEvents()

    // Removing a non-existent event
    eventManager.removeEvent("Wedding")

    // Printing events after another removal attempt
    eventManager.printEvents()
}
