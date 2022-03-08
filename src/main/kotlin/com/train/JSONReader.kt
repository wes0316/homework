package com.train

import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {

    val url = URL(/* spec = */ "http://myjson.dit.upm.es/api/bins/iul7");
    with(url.openConnection() as HttpURLConnection)
    {

         val br = inputStream.bufferedReader()
        var line = br.readLine();
        val json = StringBuffer();

        while (line!= null){

            json.append(line);
            line = br.readLine();
        }
        println(json.toString());
    }
    val connection = url.openConnection() as HttpURLConnection;

}