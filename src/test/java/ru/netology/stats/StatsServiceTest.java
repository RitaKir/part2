package ru.netology.stats;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sholdSum() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.sum(monthlySales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sholdAvg() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.avg(monthlySales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sholdMax() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.max(monthlySales);
        int expected = 8;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sholdMin() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.min(monthlySales);
        int expected = 9;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sholdBelowAvg() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.belowAvg(monthlySales);
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sholdAboveAvg() {
        StatsService manager = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.belowAvg(monthlySales);
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }
}
