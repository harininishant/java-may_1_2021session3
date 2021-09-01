import javafx.scene.control.TextInputDialog;

import javax.print.DocFlavor;

public class OperatorPractices {

    public static void main(String[] args) {
        //arithmatic operators
        //+
        int num1 = 10, num2 = 30;
        int result = num1 + num2;
        System.out.println(result);
        result = num1 - num2;
        System.out.println(result);
        result = num1 * num2;
        System.out.println(result);
        int count = 10;
        // count++ ; //count =count +1; post increment
        //+count=pre increment , pre increment
        // --count pre decrement  and count-- post decrement;
        System.out.println(count--);
        System.out.println(count);
        //==(equality)
        //relational operator -- outcome is always boolean true/false;
        System.out.println(num1 == num2);
        //!= not equal;
        System.out.println(1 != 10);
        System.out.println(num1 < num2);
        System.out.println(10 >= 10);

//logical operator work boolean type only;
        System.out.println(10 == 10 && 2 > 5);
        boolean iscitizen = true;
        System.out.println(iscitizen && 2 <= 6);
        num1 = 20;
        num2 = 15;
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2 && 10 >= 9);
        System.out.println(num1 != num2 || 10 >= 10);
        //if condition our task is to figure max of the two numbers
        num1 = 299393;
        num2 = 2890399;
        if (num1 > num2) {
            System.out.println("number 1 is big" + num1);
        }
        if (num2 > num1) {
            System.out.println("number 2 is big" + num2);
        }





    }}