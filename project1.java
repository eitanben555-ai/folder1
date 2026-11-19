import java.util.Scanner;
public class project1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        while (true) {
            System.out.println("enter a number: ");    //getting a value for my numbers and operator from lines 9-14 
            num1=scanner.nextInt();
            System.out.println("enter a operator: ");
            operator=scanner.nextLine();
            System.out.println("enter another number: ");
            num2=scanner.nextInt();
            double result;
            switch (operator) {
                case "+": //if the operator is "+" then it will add up the numbers
                    result=num1+num2;
                    break;
                case "-": //if the operator is "-" then it will subtract the numbers
                    result=num1-num2;
                    break;
                case "/": //if the operator is "/" then it will subtract the numbers
                    if (num2==0)
                    {
                        System.out.println("cannot devide by zero!");
                        continue;
                    }

                    result=num1/num2;
                    break;
                case "*": // if the operator is "8" then it wil multiply the numbers
                    result=num1*num2;
                    break;
                default: //if the user writes something that is not "+,-,/,*" the code will tell it thats its an error
                    System.out.println("not an allowed operator!");
                    continue;
                

              
            }
            
            System.out.println("the result is: "+ result);
            break;
        }
        
        scanner.close();
    }
}