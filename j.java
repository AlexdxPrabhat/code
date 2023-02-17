import java.util.Scanner;  
public class CheckPositiveOrNegative
{  
public static void main(String[] args)   
{  
int num;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reading a number from the user  
num = sc.nextInt();  
//checks whether  number is greater than 0 or not  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
//checks whether  number is less than 0 or not  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
//executes when the above two conditions are false  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}
