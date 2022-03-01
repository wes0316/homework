package com.train

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val parkinglot = HashMap<String,Car>();
    var enter = LocalDateTime.of(2018,12,25,8,0,0)
    var  car:Car? =Car("AAA-001",enter);
    parkinglot.put(car!!.id,car);
    car = Car("BBB-002",enter.plusMinutes(15));
    parkinglot.put(car!!.id,car);
    var leave = LocalDateTime.of(2018,12,25,9,0,0)

    //car1 leaving
    car = parkinglot.get("AAA-001");
    car?.leave=leave;
    println("${car?.id} duration: ${car?.duration()}")
    parkinglot.remove("AAA-001");
    println(parkinglot.size);

    //car2 leaving
    car =  parkinglot.get("BBB-002");
    car?.leave = leave.plusHours(3);
    println("${car?.id} duration is ${car?.duration()}")
    parkinglot.remove("BBB-002");
    println(parkinglot.size);





    //list()


}

private fun list() {
    var list = listOf(8, 12, 9, 6);
    println(list);
    var scores = listOf(88, 66, 78, 54, 62);
    for (score in scores) {
        println(score);
    }
    println(scores.get(3));
    var mutableList = mutableListOf(8, 6, 98, 12);
    mutableList.add(5);
    println(mutableList);
}