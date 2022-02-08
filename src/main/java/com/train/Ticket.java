package com.train;

public class Ticket {
   int alltickets;
   int roundtrip;
   int oneway = 1000;
   double round = 1000*0.9;



    public Ticket(int alltickets,int roundtrip)
    {
      this.alltickets = alltickets;
      this.roundtrip = roundtrip;

    }

    public int  getValue( int tic){
        return tic;
    }


    public void print(){
     double total = (alltickets - roundtrip)*oneway + roundtrip*round;
     System.out.println("Total Tickets:"+alltickets);
     System.out.println("Round-trip:"+ roundtrip);
     System.out.println("Total:"+total);

    }

}
