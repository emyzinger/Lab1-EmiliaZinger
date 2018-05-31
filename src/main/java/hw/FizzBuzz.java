package hw;

public class FizzBuzz {

    public static void fizzBuzz(int upperBound) {
        int iteration = 1; //number which will be printed
        while(iteration <= upperBound) { //making it loop the necessary number of times
            if ((iteration % 3 == 0)&&(iteration % 5 == 0)){ //divisible by 3 and 5
                System.out.println("FizzBuzz");
            }
            else
                if (iteration % 3 == 0){ //divisible by 3
                    System.out.println("Fizz");
                }
                else
                    if(iteration % 5 == 0){ //divisible by 5
                        System.out.println("Buzz");
                    }
                    else{ //not divisible by anything
                        System.out.println(iteration);
                    }
            iteration++; //makes the loop keep going and not be infinite
        }

    }
}
