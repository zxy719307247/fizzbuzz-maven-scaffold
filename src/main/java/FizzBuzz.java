import static java.lang.String.format;

/**
 * @author: zxy
 * @description: 被3整除输出Fizz，被5整除输出Buzz，被3和5输出整除Fizz Buzz
 * @date: 2019/12/28
 */
public class FizzBuzz {


    public static String of(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return format("%d", number);
    }


}
