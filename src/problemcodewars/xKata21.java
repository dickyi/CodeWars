package problemcodewars;

public class xKata21 {                         //Total amount of points  

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        sum -= max + min;

        return sum;
    }
}
