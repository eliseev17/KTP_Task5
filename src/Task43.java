public class Task43 {
    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));
    }

    public static boolean canComplete(String sub, String full) {
        int count = 0;
        for (int i = 0; i < full.length(); i++) {
            if (full.charAt(i) == sub.charAt(count)) {
                count++;
                if (count == sub.length())
                    return true;
            }
        }

        return false;
    }
}
