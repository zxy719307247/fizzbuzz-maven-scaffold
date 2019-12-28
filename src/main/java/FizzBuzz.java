import static java.lang.String.format;

/**
 * @author: zxy
 * @description: 被3整除输出Fizz，被5整除输出Buzz，被3和5输出整除Fizz Buzz
 * @date: 2019/12/28
 */
public class FizzBuzz {


    public static String of(int number) {
        String result;
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            result = "FizzBuzzWhizz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0 && number % 7 == 0) {
            result = "FizzWhizz";
        } else if (number % 5 == 0 && number % 7 == 0) {
            result = "BuzzWhizz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else if (number % 7 == 0) {
            result = "Whizz";
        } else if (number <= 0) {
            result = "Invalid input";
        } else {
            result = format("%d", number);
        }
        return result;
    }


}
