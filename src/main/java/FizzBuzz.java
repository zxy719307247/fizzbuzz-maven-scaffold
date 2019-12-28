import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * @author: zxy
 * @description: 被3整除输出Fizz，被5整除输出Buzz，被3和5输出整除Fizz Buzz
 * @date: 2019/12/28
 */
public class FizzBuzz {


    public static String of(int number) {
        if(number % 3 == 0){
            return "Fizz";
        }
        return format("%d", number);
    }

    public String printFizzBuzz(int num){
        int i=1;
        List<String> fizzAndBuzzLists = new ArrayList<String>();
        for(;i<num;i++){
            fizzAndBuzzLists.add(FizzBuzz.of(i));
        }
        return fizzAndBuzzLists.toString();
    }
}
