package org.example.i.violation

interface Worker {


    fun work()
    fun eat()
}


class ProgrammerWorker : Worker {
    override fun work() {
        println("Writing some code")
    }

    override fun eat() {
        println("Eating delicious pizza")
    }
}


class RobotWorker : Worker {
    override fun work() {
        println("You ask me i do whatever you want ")


    }

    override fun eat() {
        TODO("Not yet implemented")
    }
}