import java.time.LocalDate

// Base class representing a generic transaction
open class Transaction(val date: LocalDate, val amount: Double)

// Subclass representing an income transaction
class Income(date: LocalDate, amount: Double, val source: String) : Transaction(date, amount)

// Subclass representing an expense transaction
class Expense(date: LocalDate, amount: Double, val category: String) : Transaction(date, amount)

fun main() {
    // Example usage:
    val incomeTransaction = Income(LocalDate.of(2024, 7, 15), 100.0, "Salary")
    val expenseTransaction = Expense(LocalDate.of(2024, 7, 16), 50.0, "Groceries")

    // Polymorphism example
    val transactions: List<Transaction> = listOf(
        incomeTransaction,
        expenseTransaction,
        Expense(LocalDate.of(2024, 7, 14), 75.0, "Utilities")
    )

    // Print all transactions
    transactions.forEach { transaction ->
        when (transaction) {
            is Income -> println("Income: ${transaction.date} - ${transaction.amount} from ${transaction.source}")
            is Expense -> println("Expense: ${transaction.date} - ${transaction.amount} for ${transaction.category}")
            else -> println("Generic transaction: ${transaction.date} - ${transaction.amount}")
        }
    }
}
