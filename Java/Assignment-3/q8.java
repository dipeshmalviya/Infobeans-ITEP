/*8. Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */

import java.util.Scanner;
class MedicalCause{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("DO you have any medical cause yes or no: ");
        char medicalCause = sc.next().charAt(0);
        if (medicalCause == 'y' || medicalCause == 'Y'){
            System.out.println("you are eligible to sit: ");
        } 
        else 
        System.out.println("you are not eligible:");
    }
}