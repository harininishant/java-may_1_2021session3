
import java.util.Scanner;
public class SwitchCasePractice {
    public static void main(String[] args) {
         /*
    bell canada,
    write a program to charge the calls
    you need to match countrycode 91,60,44
    charges will  be applies based on countrycode
    typically on everyday we see 400 international calls
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please print a countrycode");
        String CountryCode = scanner.nextLine();

       if (CountryCode.equals("CAD") ){
           System.out.println("country is Canada");
       }else if (CountryCode.equals("IN")){
           System.out.println("country is india");
       }else if (CountryCode.equals("USA")){
           System.out.println("country is United states of america");
       }else
           System.out.println("not valid code");


            if((a==6||b==6)||(a+b==6)||(a-b==6)){
                return true;
            }else
            {
                return false;
            }
        }


    }



}
