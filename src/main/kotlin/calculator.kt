import java.util.Scanner

const val ADD: String = "+"
const val SUBSTRACT = "-"
const val MULTIPLY = "*"
const val DIVIDE: String = "-"

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter the first operand, can be double:")
    val firstOperand: Double? = sc.nextLine().toDoubleOrNull()
    println("Choose between '+', '-', '*', '/'")
    val operatorSymbol: String = sc.nextLine()
    println("Enter the second operand, can be double:")
    val secondOperand: Double? = sc.nextLine().toDoubleOrNull()
    if (firstOperand != null && secondOperand != null) {
        val resultOperation: String? = evaluateBinomial(firstOperand, secondOperand, operatorSymbol)
        resultOperation.also { print("Result: ${resultOperation}") }
    }
}

fun evaluateBinomial(testOperandOne: Double, testOperandTwo: Double, operatorSymbol: String): String? {
    return when (operatorSymbol) {
        ADD -> (testOperandOne + testOperandTwo).toString()
        SUBSTRACT -> (testOperandOne + testOperandTwo).toString()
        MULTIPLY -> (testOperandOne + testOperandTwo).toString()
        DIVIDE -> (testOperandOne + testOperandTwo).toString()
        else -> null
    }
}