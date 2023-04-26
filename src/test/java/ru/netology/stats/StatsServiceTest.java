package ru.netology.stats;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.amountSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesPerYear() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxAmountOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMouth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMouth);
    }

    @Test
    public void minAmountOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMouth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMouth);
    }

    @Test
    public void lessSaleAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLessAverage = 5;
        int actualLessAverage = service.lessAverageSale(sales);
        Assertions.assertEquals(expectedLessAverage, actualLessAverage);
    }

    @Test
    public void moreSaleAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMoreAverage = 5;
        int actualMoreAverage = service.moreAverageSale(sales);
        Assertions.assertEquals(expectedMoreAverage, actualMoreAverage);
    }
}

