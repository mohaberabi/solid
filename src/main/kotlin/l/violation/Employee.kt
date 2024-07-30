package org.example.l.violation


open class Employee(
    open val name: String,
    open val hoursWorked: Double,
) {
    open fun getSallary(): Double = hoursWorked * 10
}


class FullTimeEmployee(
    override val name: String,
    override val hoursWorked: Double,
) : Employee(name, hoursWorked) {
    override fun getSallary(): Double = hoursWorked * 200
}

class PartTimeEmployee(
    override val name: String,
    override val hoursWorked: Double,
) : Employee(name, hoursWorked) {
    override fun getSallary(): Double = hoursWorked * 8
}



