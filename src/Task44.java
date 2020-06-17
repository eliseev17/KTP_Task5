public class Task44 {
    public static void main(String[] args) {
        System.out.println(sumDigProd(new int[]{0}));
    }

    public static int sumDigProd(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        result = multiplyDigits(result);
        while (Integer.toString(result).length() != 1)
            result = multiplyDigits(result);
        return result;
    }

    public static int multiplyDigits(int num) {
        if (num == 0)
            return 0;
        int result = 1;
        while (num > 0) {
            result *= num % 10;
            num /= 10;
        }
        return result;
    }
}
