package com.train

fun main(args: Array<String>) {

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