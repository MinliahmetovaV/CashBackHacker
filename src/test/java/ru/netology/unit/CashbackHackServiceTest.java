package ru.netology.unit;

import org.junit.Assert;
import org.junit.Test;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void  shouldRemain() {
        int actual = service.remain(100);
        int expected = 900;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void  shouldNotRemain() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }

}

