package com.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tic_test {
    @Test
    public  void  ticFunTest()
    {
        Ticket ticket = new Ticket(22,3);
        Assertions.assertEquals(65,ticket.getValue(65));
    }
}
