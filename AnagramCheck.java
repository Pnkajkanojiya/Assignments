import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();


        if (str1.length() != str2.length()) {
            return false;
        }


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int left = 0, right = 0;
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] != arr2[right]) {
                return false;
            }
            left++;
            right++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        scanner.close();

        if (isAnagram(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }
}