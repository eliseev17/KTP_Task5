import java.util.LinkedList;
import java.util.List;

public class Task45 {
    public static void main(String[] args) {
        System.out.println(sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"}));
    }

    public static List<String> sameVowelGroup(String[] arr) {
        List<String> result = new LinkedList<String>();
        String vowels = takeVowels(arr[0]);
        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr[i].length(); j++) {
                if (isVowel(arr[i].charAt(j)) && !vowels.contains(arr[i].substring(j, j + 1)))
                    flag = false;
            }
            if (flag)
                result.add(arr[i]);
        }
        return result;

    }

    private static boolean isVowel(char ch) {
        String vowels = "AOUIEaouie";
        return vowels.contains(Character.toString(ch));
    }

    public static String takeVowels(String str) {
        String vowels = "AEIOUaeiou";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(Character.toString(str.charAt(i))))
                result += str.charAt(i);
        }
        return result;
    }
}