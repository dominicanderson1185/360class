import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Scratch {

    public static void main(String[] args) {




    }

    public static void display(){
        Scanner theObj = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = theObj.nextInt();
        System.out.println("Please enter second number");
        int number2 = theObj.nextInt();

        System.out.println(number1 + " " + number2);

    }




}

import java.util.Scanner;
        import java.util.ArrayList;
        import java.util.*;
/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
public class Main
{
    public static void main(String[] args) {

        Scanner theObj = new Scanner(System.in);
        int number1;
        int number2;
//Do while should run excluding all non numbers giving people the opertunity to keep trying until a positive real number is given
        do{
            System.out.println("Please enter first number. It must be a positive number.");
            while(!theObj.hasNextInt()){
                System.out.println("Please enter a normal numerical number.");
                theObj.next();
            }
            number1 = theObj.nextInt();
            System.out.println("Please enter second number. It must be a positive number.");
            while(!theObj.hasNextInt()){
                System.out.println("Please enter a normal numerical number.");
                theObj.next();

            }
            number2 = theObj.nextInt();
        }while(number1 <=0 && number2 <=0);
// Check for the numbers input. 0 will sill be able to be added in the function so the arithmetic exception can be triggered.
        try{
            System.out.println(number1/number2 +" with a remander of "+ number1%number2);
        }
        catch(ArithmeticException e){
            System.out.println("The denominator can not be divided by " + number2);

        }catch(Exception e){
            System.out.println("Something has gone wrong");
        }
        finally {
            System.out.println("Thank you for the math fun!");
        }





    }
}







