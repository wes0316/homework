package com.train

import java.io.File

fun main(args: Array<String>) {
    File("data.txt").bufferedReader().lines().forEach {
          println(it);
    }


   // write()

}

private fun write() {
    //File("output.txt").writeText("abc")
    File("output.txt").printWriter().use {

        it.println("1st line");
        it.println("2st line");
        it.println("3st line");
    }
}