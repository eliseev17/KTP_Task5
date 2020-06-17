public class Task49 {
    public static void main(String[] args) {
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
    }

    public static String correctTitle(String title) {
        String[] words = title.split(" ");
        String result = "";
        for (String word : words) {
            if (word.toLowerCase().equals("the") || word.toLowerCase().equals("in") ||
                    word.toLowerCase().equals("and") || word.toLowerCase().equals("of")) {
                result += word.toLowerCase() + " ";
                continue;
            }
            if (word.contains("-")) {
                String firstHalf = word.substring(0, 1).toUpperCase() + word.substring(1, word.indexOf('-'));
                String secondHalf = word.substring(word.indexOf('-') + 1, word.indexOf('-') + 2).toUpperCase() +
                        word.substring(word.indexOf('-') + 2);
                result += firstHalf + "-" + secondHalf + " ";
                continue;
            }
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result += word + " ";
        }
        return result;
    }
}
