package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public int amountSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public int averageSales(int[] sales) {
        int average = 0;
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        average = sum / sales.length;

        return average;
    }

    // Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0; //

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int lessAverageSale(int[] sales) {
        int lessAverage = 0;

        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                lessAverage += 1;
            }
        }
        return lessAverage;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int moreAverageSale(int[] sales) {
        int moreAverage = 0;

        for (int sale : sales) {
            if (sale > averageSales(sales)) {
                moreAverage += 1;
            }
        }
        return moreAverage;
    }
}
