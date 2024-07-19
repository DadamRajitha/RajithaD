data class Transaction(
    var id: Int,
    var date: String,
    var description: String,
    var amount: Double
)

class TransactionList {
    private val transactions = mutableListOf<Transaction>()
    private var nextId = 1

    fun addTransaction(date: String, description: String, amount: Double): Int {
        val transaction = Transaction(nextId, date, description, amount)
        transactions.add(transaction)
        return nextId++
    }

    fun deleteTransaction(transactionId: Int): Boolean {
        val iterator = transactions.iterator()
        while (iterator.hasNext()) {
            val transaction = iterator.next()
            if (transaction.id == transactionId) {
                iterator.remove()
                return true
            }
        }
        return false // Transaction with given id not found
    }

    fun editTransaction(transactionId: Int, date: String? = null, description: String? = null, amount: Double? = null): Boolean {
        for (transaction in transactions) {
            if (transaction.id == transactionId) {
                date?.let { transaction.date = it }
                description?.let { transaction.description = it }
                amount?.let { transaction.amount = it }
                return true
            }
        }
        return false // Transaction with given id not found
    }

    fun printTransactions() {
        for (transaction in transactions) {
            println(transaction)
        }
    }
}

// Example usage:
fun main() {
    val tl = TransactionList()

    // Adding transactions
    val id1 = tl.addTransaction("2024-07-17", "Groceries", 50.0)
    val id2 = tl.addTransaction("2024-07-18", "Gas", 30.0)

    println("Initial transactions:")
    tl.printTransactions()
    println()

    // Editing a transaction
    tl.editTransaction(id2, description = "Fuel")

    println("Transactions after editing:")
    tl.printTransactions()
    println()

    // Deleting a transaction
    tl.deleteTransaction(id1)

    println("Transactions after deleting:")
    tl.printTransactions()
}
