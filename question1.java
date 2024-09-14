package JavaPractice;

import java.util.Scanner;

class question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double input1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double input2 = input.nextDouble();

        System.out.println("Enter a operator: ");
        char operator = input.next().charAt(0);

        double result;

        switch(operator){
            case '+':
            result = input1 + input2;
            System.out.println(input1 + " + " + input2 + " = " + result);
            break;
            case '-':
            result = input1 - input2;
            System.out.println(input1 + " - " + input2 + " = " + result);
            break;
            case '*':
            result = input1 * input2;
            System.out.println(input1 + " * " + input2 + " = " + result);
            break;
            case '/':
            if(input1 != 0){
                result = input1 / input2;
                System.out.println(input1 + " / " + input2 + " = " + result);
            } else {
                System.out.println(" You can't divide by zero! ");
            }
            break;
            default: 
            System.out.println(" Invalid operator. ");
        }
        input.close();

    }
}