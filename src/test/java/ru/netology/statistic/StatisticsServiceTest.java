package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax_FirstElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 5, 8};
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_LastElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {3, 5, 20};
        long expected = 20;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_AllElementsEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

}
