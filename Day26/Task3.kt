import java.time.LocalDate

class Transaction(val amount: Double, val date: LocalDate, val category: String){
    override fun  toString(): String{
        return "Transaction of $amount on $date under $category"
    }
}

fun main(){
    val t1 = Transaction(100.0, LocalDate.of(2024,7,18),"Groceries")
    val t2 = Transaction(50.0, LocalDate.of(2024,7,17),"Dining out")

    println(t1)
    println(t2)
    
}