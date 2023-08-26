import java.util.Scanner;

public class FunctionsDEMO {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        //method,function,procedure
//        int result=sum(num1,num2);
//        System.out.println("Sum of :"+num1+"  and "+num2+" is :"+result);
        System.out.println(sum(num1,num2));
    }

    public  static int sum(int num1, int num2) {
        return num1+num2;
    }

}
