package com.train

import java.lang.reflect.Field
import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter =
        LocalDateTime.of(2022, 2, 23, 17, 0, 0)
    val leave =
        LocalDateTime.of(2022, 2, 23, 19, 0, 0)
    var car = Car("ATG-0075",enter)
    car.leave = leave
    println(car.duration())

}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
    set(value){
           if(enter.isBefore(value))
               field = value
    }
   fun duration() = Duration.between(enter,leave).toMinutes()
}