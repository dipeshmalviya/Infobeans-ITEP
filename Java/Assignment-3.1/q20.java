/* 20. W.A.P to check whether a charachter is an alphabet or not.
*/

import java.util.Scanner;
class Character{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'Z'){
            System.out.println("Character is in aplbhabet: ");
        }else if(ch == 'a' || ch == 'z'){
            System.out.println("character is in albhabet");
        }
        else
        System.out.println("invalid character: ");
    }
}