package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Test2 {
    @Test
     void getName() {
        Buket buket = new Buket("Mondey", 34, 456);
        assertEquals("Mondey",buket.getName());
    }

    @Test
    void setName() {
        Buket buket = new Buket("Mondey", 34, 456);
        buket.setName("May");
        assertEquals("Mondey",buket.getName());

    }

    @Test
    void setName2() {
        Buket buket = new Buket("", 34, 456);
        buket.setName("May");
        assertEquals("May",buket.getName());

    }

}
