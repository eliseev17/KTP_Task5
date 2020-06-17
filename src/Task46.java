public class Task46 {
    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123452L));
    }

    public static boolean validateCard(long number) {
        String num = Long.toString(number);
        if (num.length() < 14 || num.length() > 19)
            return false;
        int lastDigit = Character.digit(num.charAt(num.length() - 1), 10);
        num = num.substring(0, num.length() - 1);
        StringBuilder input = new StringBuilder();
        input.append(num);
        input = input.reverse();
        char[] digits = input.toString().toCharArray();
        for (int i = 0; i < input.length(); i += 2) {
            digits[i] = doubleDigit(digits[i]);
        }
        int sum = 0;
        for (char digit : digits) {
            sum += Character.digit(digit, 10);
        }
        String Sum = Integer.toString(sum);
        int tenDiff = 10 - Character.digit(Sum.charAt(Sum.length() - 1), 10);
        return tenDiff == lastDigit;
    }

    private static char doubleDigit(char digit) {
        int result = Character.digit(digit, 10);
        result *= 2;
        if (Integer.toString(result).length() != 1) {
            char firstDigit = Integer.toString(result).charAt(0);
            char secondDigit = Integer.toString(result).charAt(1);
            result = Character.digit(firstDigit, 10) + Character.digit(secondDigit, 10);
            return Character.forDigit(result, 10);
        }
        return Character.forDigit(result, 10);
    }
}
