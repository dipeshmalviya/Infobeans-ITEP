
/*
  49. Write a program to Check given strings are Anagram or not
 */
import java.util.Scanner;

class Utility {
    Utility() {
    };

    public boolean isAnagrams() {
        Scanner sc = new Scanner(System.in);
        System.out.println("In this program you check words are anagrams of each other");
        System.out.println("Enetr first word : ");
        String fw = sc.next();
        System.out.println("Enetr Second word : ");
        String sw = sc.next();
        int count = 0;
        if (fw.length() == sw.length()) {
            for (int i = 0; i < fw.length(); i++) {
                for (int j = 0; j < sw.length(); j++) {
                    if (fw.charAt(i) == sw.charAt(j)) {
                        count++;
                    }
                }
            }
        }
        if (count == fw.length()) {
            return true;
        }
        return false;
    }
}

class TestMain {
    public static void main(String[] args) {

        Utility u1 = new Utility();
        boolean anagrams = u1.isAnagrams();
        if (anagrams)
            System.out.println("Words are Anagrams ");
        else
            System.out.println("Words are not Anagrams ");

    }
}
