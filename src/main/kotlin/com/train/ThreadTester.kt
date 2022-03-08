package com.train

import kotlin.concurrent.thread

fun main(args: Array<String>) {

    Thread {
        for (i in 1..10) {

            println("Thread:${i}")
            Thread.sleep(50)
        }

    }.start();

    thread {
        for (i in 1..10) {

            println("Thread:${i}")
            Thread.sleep(50)
        }
    }

}