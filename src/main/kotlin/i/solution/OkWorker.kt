package org.example.i.solution

import org.example.i.violation.Worker


interface OkWorker {
    fun work()
}

interface Eater {
    fun eat()
}


class ProgrammerWorker : OkWorker, Eater {
    override fun work() {
        println("Writing some code")
    }

    override fun eat() {
        println("Eating delicious pizza")
    }
}


class RobotWorker : OkWorker {
    override fun work() {
        println("You ask me i do whatever you want ")
        
    }

}