import java.time.LocalDate

data class Transaction(val date: LocalDate, val amount: Double)

fun main() {
    // Sample list of transactions
    val transactions = listOf(
        Transaction(LocalDate.of(2024, 7, 15), 130.0),
        Transaction(LocalDate.of(2024, 7, 16), 270.0),
        Transaction(LocalDate.of(2024, 7, 14), 45.0),
        Transaction(LocalDate.of(2024, 7, 17), 185.0)
    )

    // Function to filter transactions by date range
    fun filterTransactionsByDate(transactions: List<Transaction>, startDate: LocalDate, endDate: LocalDate): List<Transaction> {
        return transactions.filter { transaction ->
            transaction.date >= startDate && transaction.date <= endDate
        }
    }

    // Function to sort transactions by amount
    fun sortTransactionsByAmount(transactions: List<Transaction>, descending: Boolean): List<Transaction> {
        return if (descending) {
            transactions.sortedByDescending { it.amount }
        } else {
            transactions.sortedBy { it.amount }
        }
    }

    // Example usage:
    
    // Filter transactions between two dates (e.g., July 15, 2024 to July 17, 2024)
    val filteredTransactionsByDate = filterTransactionsByDate(transactions, LocalDate.of(2024, 7, 15), LocalDate.of(2024, 7, 17))
    println("Transactions filtered by date:")
    filteredTransactionsByDate.forEach { println("${it.date} - ${it.amount}") }

    // Sort transactions by amount in descending order
    val sortedTransactionsByAmount = sortTransactionsByAmount(transactions, descending = true)
    println("\nTransactions sorted by amount (descending):")
    sortedTransactionsByAmount.forEach { println("${it.date} - ${it.amount}") }
}
