import java.util.Scanner;
public class project2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double[] numbers1={1.0, 2.9, 45, 3.0};
        double[][] numbers2={{340.3, 450.6, 34.0},
                            {67.0, 67.0, 6.7},
                            {2.0, 6.5, 12.56, 56}};
        System.out.println("the average number in the first list is:"+average(numbers1));
        System.out.println("the average number in the second list is:"+average(numbers2));
        System.out.println("enter a circle radius: ");
        double CircleRadius=scanner.nextDouble(); //getting a radius from the code user
        scanner.nextLine();
        System.out.println("the area of your circle is: "+getCircleArea(CircleRadius));
        System.out.println("enter a text: ");
        String PalindromeText=scanner.nextLine();//getting a text to check from the user
        System.out.println(isPalindrome(PalindromeText));
        System.out.println("enter a number: ");
        int mayBeAPrimeNumber=scanner.nextInt();//getting a number to be checked from the user
        System.out.println(isPrime(mayBeAPrimeNumber));
        System.out.println("enter a x: ");
        double x1=scanner.nextDouble();//getting x1
        System.out.println("enter a y: ");
        double y1=scanner.nextDouble();//getting y1
        System.out.println("enter another x: ");
        double x2=scanner.nextDouble();//getting x2
        System.out.println("enter another y: ");
        double y2=scanner.nextDouble();//getting y2
        System.out.println("the distance is: "+ getDistance(x1,y1,x2,y2));
        scanner.close();
    }
    public static double average(double[] list1){ //first method for a 1d array average calc
        if (list1.length==0){
            System.out.println("ERROR cannot work with an empty array!");
            return -1;
        }
        double sum=0; //a variable to sum up all the numbers from the list numbers1
        for (double a : list1){ //going over each number in list numbers1
            
            sum+=a; //adding up everything
        }
        return sum/list1.length;//calculating average
    }

    public static double average(double[][] list2D){ //second method for a 2d array average calc
        if (list2D.length==0){
            System.out.println("ERROR cannot work with an empty 2D array!");
            return -1;
        }
        double total=0; //a variable to sum up all the numbers from the list numbers2
        for ( double[] row : list2D){ //access each row in the 2D array
            for (double num2 : row){ //access an item from each collum in the 2D array
                if (row.length==0){
                    System.out.println("ERROR cannot calculate average with an empty row");
                    return -1;
                }
                total+=num2; //adding up the numbers
            }
        }
        return total/list2D.length; //average calculation
    }

    public static double getCircleArea(double r){
        if (r<0){//checking if the radius we got was negative
            System.out.println("ERROR your raidus is negative!");
            return -1;//returning that there was an error
        } 
            
        Double area=Math.PI*Math.pow(r,2); //calculation for circle area
        return area;
    }

    public static boolean isPalindrome( String text){
        String reversed="";
        for (int i= text.length()-1; i>-1; i-=1){//goes from the end of the string to the start
            reversed+=text.charAt(i);//adds up each charcter from the original string but backwords from end to start
            
        

        }
        return text.equals(reversed);//check if the reversed text is the same as the original
    }
    public static boolean isPrime(int num){
        if (num>1){ //checks if the number is positive and bigger then 1
            for (int i=2; i<num; i++){ //loop will start from 2 and stop when i is bigger then our checked number
                if (num%i==0) //check if the number can be devided by numbers other then itself or 1
                    return false;
            }
            return true;
        }
        else
            return false;
    }
    public static double getDistance(double x, double y, double secondX, double secondY){
        double distance=Math.sqrt(Math.pow(secondX-x, 2)+ Math.pow(secondY-y,2)); //calculates the distance
        return distance;
    }


}
