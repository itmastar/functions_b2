import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Switch case Demo
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter color");
//        String color=sc.next();
//        switch(color){
//            case "RED":
//            case "Red":
//            case "red":
//                System.out.println("STOP !!");
//                break;
//            case "GREEN" :
//                System.out.println("GO !!");
//                break;
//            case "YELLOW":
//                System.out.println("GET READY !!");
//                break;
//            default:
//                System.out.println("Please enter correct color ");
//
//
//        }

        System.out.println("Enter status code !!");
        int code=sc.nextInt();
        switch(code){
            case 404:
                System.out.println("NOT FOUND");
                break;
            case 500:
                System.out.println("INTERNAL SERVER ERROR");
                break;
            case 200:
                System.out.println("SUCCESS");
                break;
            default:
                System.out.println("ENTER VALID CODE ");
        }
    }
}