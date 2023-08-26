public class FunctionsDemo2 {
    public static void main(String[] args) {
//        System.out.println(productOfThreeNumbers(2,5,3));
//        int answer=productOfThreeNumbers(4,5,10);
//        System.out.println(answer);

        for(int i=1;i<=5;i++){
            hello();
        }
    }

    static int productOfThreeNumbers(int no1, int no2, int no3) {

        return no1*no2*no3;
    }
    static void hello(){
        System.out.println("Hello");
    }
}
