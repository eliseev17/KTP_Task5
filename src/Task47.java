public class Task47 {
    public static void main(String[] args) {
        System.out.println(toEng(919));
        System.out.println(toRus(919));
    }

    public static String toEng(int num) {
        String result = "";
        if (num / 100 > 0)
            result += digitToEng(num / 100) + " hundred ";
        num = num % 100;
        if (num / 10 > 1) {
            result += tensToEng(num / 10) + " ";
        } else {
            if (num / 10 == 0 && num % 10 != 0)
                result += digitToEng(num % 10);
            else if (num / 10 == 1)
                result += teenToEng(num % 100);

            return result;
        }

        result += digitToEng(num % 10);
        return result;
    }

    private static String digitToEng(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }

        return "Unknown";
    }

    private static String tensToEng(int tens) {
        switch (tens) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "fourty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }

        return "Unknown";
    }

    private static String teenToEng(int teen) {
        switch (teen) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }

        return "Unknown";
    }

    public static String toRus(int num) {
        String result = "";
        if (num / 100 > 0)
            result += hundredsToRus(num / 100);
        num = num % 100;
        if (num / 10 > 1) {
            result += tensToRus(num / 10) + " ";
        } else {
            if (num / 10 == 0 && num % 10 != 0)
                result += digitToRus(num % 10);
            else if (num / 10 == 1)
                result += teenToRus(num % 100);

            return result;
        }

        result += digitToRus(num % 10);
        return result;
    }

    private static String hundredsToRus(int hundreds) {
        switch (hundreds) {
            case 1:
                return "сто ";
            case 2:
                return "двести ";
            case 3:
                return "триста ";
            case 4:
                return "четыреста ";
            case 5:
                return "пятьсот ";
            case 6:
                return "шестьсот ";
            case 7:
                return "семьсот ";
            case 8:
                return "восемьсот ";
            case 9:
                return "девятьсот ";
        }

        return "Unknown";
    }

    private static String digitToRus(int digit) {
        switch (digit) {
            case 0:
                return "ноль ";
            case 1:
                return "один ";
            case 2:
                return "два ";
            case 3:
                return "три ";
            case 4:
                return "четыре ";
            case 5:
                return "пять ";
            case 6:
                return "шесть ";
            case 7:
                return "семь ";
            case 8:
                return "восемь ";
            case 9:
                return "девять ";
        }

        return "Unknown";
    }

    private static String tensToRus(int tens) {
        switch (tens) {
            case 2:
                return "двадцать ";
            case 3:
                return "тридцать ";
            case 4:
                return "сорок ";
            case 5:
                return "пятьдесят ";
            case 6:
                return "шестьдесят ";
            case 7:
                return "семьдесят ";
            case 8:
                return "восемьдесят ";
            case 9:
                return "девяносто ";
        }

        return "Unknown";
    }

    private static String teenToRus(int teen) {
        switch (teen) {
            case 10:
                return "десять ";
            case 11:
                return "одиннадцать ";
            case 12:
                return "двенадцать ";
            case 13:
                return "тринадцать ";
            case 14:
                return "четырнадцать ";
            case 15:
                return "пятнадцать ";
            case 16:
                return "шестнадцать ";
            case 17:
                return "семнадцать ";
            case 18:
                return "восемнадцать ";
            case 19:
                return "девятнадцать ";
        }

        return "Unknown";
    }
}
