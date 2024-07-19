class User(private val username: String, private val password: String) {
    private var loggedIn: Boolean = false
    private val expenses: MutableList<Pair<Double, String>> = mutableListOf()

    fun login(username: String, password: String) {
        if (username == this.username && password == this.password) {
            loggedIn = true
            println("Welcome, $username! You are now logged in.")
        } else {
            println("Invalid username or password. Please try again.")
        }
    }

    fun addExpense(amount: Double, category: String) {
        if (!loggedIn) {
            println("You must be logged in to add expenses.")
            return
        }
        expenses.add(amount to category)
        println("Added expense: $$amount in category: $category")
    }

    fun displayExpenseSummary() {
        if (!loggedIn) {
            println("You must be logged in to view expenses.")
            return
        }
        var totalExpenses = 0.0
        println("Expense summary for $username:")
        for ((amount, category) in expenses) {
            println("Category: $category, Amount: $$amount")
            totalExpenses += amount
        }
        println("Total expenses: $$totalExpenses")
    }
}

fun main() {
    // Create a user
    val user1 = User("Rajitha", "password123")

    // Login
    user1.login("Rajitha", "password123")

    // Add some expenses
    user1.addExpense(50.0, "Food")
    user1.addExpense(20.0, "Transportation")

    // Display expense summary
    user1.displayExpenseSummary()
}
