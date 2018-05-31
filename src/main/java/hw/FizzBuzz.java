package hw;

public class FizzBuzz {

    public static void fizzBuzz(int upperBound) {
        int iteration = 1;
        while(iteration <= upperBound) {
            if ((iteration % 3 == 0)&&(iteration % 5 == 0)){
                System.out.println("FizzBuzz");
            }
            else
                if (iteration % 3 == 0){
                    System.out.println("Fizz");
                }
                else
                    if(iteration % 5 == 0){
                        System.out.println("Buzz");
                    }
                    else{
                        System.out.println(iteration);
                    }
            iteration++;
        }

    }
}
