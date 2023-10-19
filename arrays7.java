You are given a string s. You need to reverse the string.

public class ReverseString {
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Swap the characters at the left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
