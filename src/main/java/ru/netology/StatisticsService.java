package ru.netology.stats;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public double calculateAver(long[] purchases) {
        long sum = 0;
        double average = 0;
        long month;
        for (long purchase : purchases) {
            sum += purchase;
        }
        month = purchases.length;
        average = sum / month;

        return average;
    }

    public long findMax(long[] purchases) {
        int indexOfMax = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= purchases[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }


    public long findMin(long[] purchases) {
        int indexOfMin = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= purchases[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public long lowerThanAver(long[] purchases) {
        long sum = 0;
        long average;
        long month;
        int count = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        month = purchases.length;
        average = sum / month;
        for (long purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }

    public long biggerThanAver(long[] purchases) {
        long sum = 0;
        long average;
        long month;
        int count = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        month = purchases.length;
        average = sum / month;
        for (long purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }
}
