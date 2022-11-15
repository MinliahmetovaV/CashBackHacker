package ru.netology.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldRemain() {
        int actual = service.remain(100);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void  shouldDropRemain() {
        int actual = service.remain(930);
        int expected = 250;
        Assert.assertEquals(actual, expected);
    }


}