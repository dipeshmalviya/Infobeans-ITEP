/*
 * 4. String Problem #2
 * 
 * Reverse Each Word in a Sentence
 * 
 * Input: "Java makes coding fun"
 * 
 * Output: "avaJ sekam gnidoc nuf"
 * 
 * Keep the word order intact but reverse the characters of each word.
 */
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        String result = "";
        String result2 = "";
        for (String word : words) {
            result = "";
            int t=word.length() - 1;
            for (int i =t ; i >= 0; i--) {
                result += word.charAt(i);
            }
            result2 += result + " ";

        }
        System.out.println("result String: " + result2 + " ");
    }
}

























