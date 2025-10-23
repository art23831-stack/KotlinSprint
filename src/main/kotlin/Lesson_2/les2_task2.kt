package Lesson_2

fun main() {

    val workers = 50
    val trainees = 20
    val salaryWorkers = 30000
    val salaryTrainees = 20000

    val paymentsSalaryWorkers = workers * salaryWorkers
    val paymentsSalaryTrainees = trainees * salaryTrainees
    val allPayments = paymentsSalaryTrainees + paymentsSalaryWorkers
    val averageSalary = allPayments / (workers + trainees)

    println(paymentsSalaryWorkers)
    println(paymentsSalaryTrainees)
    println(allPayments)
    println(averageSalary)

}