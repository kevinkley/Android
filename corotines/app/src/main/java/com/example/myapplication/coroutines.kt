package com.example.myapplication
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){ // this: CoroutineScope
    receber()
}

fun receber(){

    val dados = corotinas()
}

val gol = true;

fun corotinas() = runBlocking {
    println("Gol sim ou não")
    if(gol == true){
        launch { // launch a new coroutine and continue
            repeat(3) {
                delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
                println("GoL")
            }

            delay(3000L) // non-blocking delay for 1 second (default time unit is ms)
            println("Goooooooooooooooooooooooooollllllll")
        }
        println("Gol valido") // main coroutine continues while a previous one is del}ayed
    }else{
        println("Não foi gol")
    }
}