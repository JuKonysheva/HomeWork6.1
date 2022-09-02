public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avg(long[] sales) {
        return sum(sales) / 12;
    }

    public int countAboveAvg(long[] sales) {
        int count = 0;
        long avg = avg(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;


    }





}
