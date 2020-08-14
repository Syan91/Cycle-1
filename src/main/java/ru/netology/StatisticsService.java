package ru.netology.stats;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }
    public long calculateAver(long[] purchases) {
        long sum = 0;
        long average = 0;
        long month;
        for (long purchase : purchases) {
            sum += purchase;
            month = purchases.length ;
            average = sum / month ;
        }
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
        for (int i = 0; i < purchases.length; i++)
        {
             if (purchases[i] < purchases[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
    public long lowerThanAver(long[] purchases) {
        long average = 15;
        int count = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }
    public long biggerThanAver(long[] purchases) {
        long average = 15;
        int count = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }
}
