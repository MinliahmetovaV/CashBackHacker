package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void  shouldRemain(){
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(expected,actual);
    }

    @Test
    public void  shouldDropRemain(){
        int expected = 100;
        int actual = service.remain(500);
        assertEquals(expected,actual);
    }


}