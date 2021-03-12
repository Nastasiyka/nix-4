package alevel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int check;
        System.out.println("Select the required task: \n 1 - sum of all numbers \n 2 - sort all cyrillic and latin characters \n 3 - check endtime of the lesson");
        check = scanner.nextInt()switch (check) {
            case 1:
                FoundSumOfAllNumberInString();
                break;
            case 2:
                SortAllCyrillicAndLatinCharactersInString();
                break;
            case 3:
                CheckEndtimeOfTheLesson();
                break;
            default:
                break;
        }
        scanner.close();

    }

    public static void FoundSumOfAllNumberInString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to find the sum of all numbers inside: ");
        String string = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.codePointAt(i) > 47 && string.codePointAt(i) < 58) {
                sum += Character.getNumericValue(string.charAt(i));
            }
        }
        System.out.println("Sum: " + sum);
    }

    public static void SortAllCyrillicAndLatinCharactersInString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to sort all cyrillic and latin characters inside: ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (((chars[i] >= 'а') && (chars[i] <= 'я')) || ((chars[i] >= 'А') && (chars[i] <= 'Я')) || ((chars[i] >= 'a') && (chars[i] <= 'z')) || ((chars[i] >= 'A') && (chars[i] <= 'Z'))) {
                if ((i <= chars.length - 2) && ((int) chars[i] == (int) chars[i + 1])) {
                    count += 1;
                    continue;
                } else {
                    System.out.println(chars[i] + " - " + count);
                    count = 1;
                }
            }
        }
    }

    public static void CheckEndtimeOfTheLesson() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lessons: ");
        int number = scanner.nextInt();
        int oclock = 9;
        int minutes = 0;
        int oddNumbers = number / 2;
        int evenNumbers = (number + 1) / 2 - 1;
        int allAdditionalMinutes = number * 45 + evenNumbers * 15 + oddNumbers * 5;
        System.out.println((oclock + allAdditionalMinutes / 60) + " " + (minutes + allAdditionalMinutes % 60));
    }

}