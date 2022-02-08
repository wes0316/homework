package com.train

import java.util.*


fun main(args: Array<String>) {
 val  scanner = Scanner(System.`in`);
    var tickets =0;
    var end = -1;
    var loop =1;
    while(tickets != end)
    {
        print("Loop $loop Please enter number of tickets, or enter -1 to finish the booking:　")
        tickets =scanner.nextInt();
        if(tickets==end)
        {
            println("Thank you for this booking")
        }else
        {
            print("How many round-trip tickets: ")
            var round = scanner.nextInt()
            var ticket = ticketcount(tickets, round)
            ticket.print()
            loop =loop + 1


        }
    }

}

class ticketcount( var alltickets:Int, var roundtrip:Int)
{
  var oneway =1000;
    var round = 1800;
  var total =(alltickets-roundtrip)*oneway + roundtrip * round;

    fun print(){
        println("Total tickets: $alltickets\nRound-trip: $roundtrip\nTotal: $total")
    }
}
