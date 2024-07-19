fun categorizeTransaction(transactionType: String){
    when (transactionType) {
        "food" ->{
            println("Transaction is categorized under food.")
        }
        "utilities" ->{
            println("Transaction is categorized under utilities.")
        }
        "entertainment" -> {
            println("Transaction is categorized under entertainment.")
        }
        else -> {
            println("Transaction category not recognized.")
        }
        
    }
} 

fun main(){
    categorizeTransaction("food")
    categorizeTransaction("utilities")
    categorizeTransaction("entertainment")
    categorizeTransaction("travel")
    
}