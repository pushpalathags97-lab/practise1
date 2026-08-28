import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String sentence = sc.nextLine();
        int words = 0;
        int vowel = 0;
        int character = 0;
        String lower = sentence.toLowerCase();


        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch != ' ') {
                character++;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel++;
            }
            System.out.println("words:" + words);
            System.out.println("vowel:" + vowel);
            System.out.println("character:" + character);
            System.out.println("sentence:" + sentence);
            System.out.println("sentence:" + lower);
            sc.close();


        }
    }

