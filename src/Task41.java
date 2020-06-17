import java.util.Arrays;

public class Task41 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(decrypt(new int[]{72, 29, 7, 0, 3}));
    }

    public static int[] encrypt(String msg) {
        int[] result = new int[msg.length()];
        char[] chars = msg.toCharArray();
        result[0] = chars[0];
        for (int i = 1; i < chars.length; i++) {
            result[i] = chars[i] - chars[i - 1];
        }
        return result;
    }

    public static String decrypt(int[] arr) {
        char[] chars = new char[arr.length];
        chars[0] = (char) arr[0];
        int code = arr[0];
        for (int i = 1; i < arr.length; i++) {
            code += arr[i];
            chars[i] = (char) (code);
        }
        return new String(chars);
    }
}
