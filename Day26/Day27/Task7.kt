// Define a typealias for the callback function signature
typealias Callback = (String) -> Unit

// NotificationSystem class
class NotificationSystem {
    // List of subscribers (listeners)
    private val subscribers = mutableListOf<Callback>()

    // Function to subscribe to notifications
    fun subscribe(callback: Callback): () -> Unit {
        subscribers.add(callback)
        return { unsubscribe(callback) }
    }

    // Function to unsubscribe from notifications
    private fun unsubscribe(callback: Callback) {
        subscribers.remove(callback)
    }

    // Function to notify all subscribers
    fun notify(event: String) {
        subscribers.forEach { callback ->
            callback(event)
        }
    }
}

// Example usage:
fun main() {
    val notificationSystem = NotificationSystem()

    // Subscribe to notifications
    val unsubscribe1 = notificationSystem.subscribe { event ->
        println("Subscriber 1 received event: $event")
    }

    val unsubscribe2 = notificationSystem.subscribe { event ->
        println("Subscriber 2 received event: $event")
    }

    // Notify subscribers
    notificationSystem.notify("New Event 1")
    notificationSystem.notify("New Event 2")

    // Unsubscribe one of the subscribers
    unsubscribe1()

    // Notify again
    notificationSystem.notify("New Event 3")
}
