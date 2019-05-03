package FirstSet;

public class FizzBuzz{

    public static void main(String[]args){

        FizzBuzz(100);

    }


    public static void FizzBuzz(int num) {



        for(int n=1;n<=num;n++){
            if(n%3 == 0){
                System.out.println("Fizz");
            }
            else if(n%5 == 0){
                System.out.println("Buzz");
            }
            else if (n%3 == 0 && n%5 == 0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(n);
            }
        }
    }

}

