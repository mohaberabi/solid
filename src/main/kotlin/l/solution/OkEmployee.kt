package org.example.l.solution


open class OkEmployee(
    open val name: String,
    open val hoursWorked: Double
)


interface SallaryCalculator {
    fun getSallary(): Double
}

class OkFullTimeEmployee(
    override val name: String,
    override val hoursWorked: Double,
) : OkEmployee(name, hoursWorked),
    SallaryCalculator {
    override fun getSallary(): Double = hoursWorked * 200

}

class OkPartTimeEmployee(
    override val name: String,
    override val hoursWorked: Double,
) : OkEmployee(name, hoursWorked),
    SallaryCalculator {
    override fun getSallary(): Double = hoursWorked * 200

}