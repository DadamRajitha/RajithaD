// Parent class Event
open class Event(val name: String, val date: String, val location: String) {
    open fun displayDetails() {
        println("Event: $name")
        println("Date: $date")
        println("Location: $location")
    }
}

// Subclass SpecialEvent inheriting from Event
class SpecialEvent(name: String, date: String, location: String) : Event(name, date, location) {
    // Additional properties specific to SpecialEvent
    private val vipList = mutableListOf<String>()
    private var premiumServicesEnabled = false

    // Method to add a person to VIP list
    fun addVIP(person: String) {
        vipList.add(person)
    }

    // Method to enable premium services
    fun enablePremiumServices() {
        premiumServicesEnabled = true
    }

    // Overriding displayDetails to include VIP list and premium services
    override fun displayDetails() {
        super.displayDetails()
        println("VIP List: $vipList")
        println("Premium Services Enabled: $premiumServicesEnabled")
    }
}

fun main() {
    // Example usage
    val specialEvent = SpecialEvent("Gala Dinner", "2024-07-18", "Grand Hotel")
    specialEvent.addVIP("Rajitha")
    specialEvent.addVIP("Gopikanth")
    specialEvent.enablePremiumServices()

    specialEvent.displayDetails()
}
