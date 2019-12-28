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

        if (number % 3 == 0) {
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }

        return format("%d", number);
    }

    public String printFizzBuzz(int num){
        int i=1;
        List<String> fizzAndBuzzLists = new ArrayList<String>();
        for(; i <= num ; i++){
            fizzAndBuzzLists.add(i+"");
        }
        for(i = 2 ; i< num ;){
            fizzAndBuzzLists.set(i,"fizz");
            i+=3;
        }
        for(i = 4 ; i < num ;){
            if("fizz".equals(fizzAndBuzzLists.get(i))){
                fizzAndBuzzLists.set(i,"fizz buzz");
            }else{
                fizzAndBuzzLists.set(i,"buzz");
            }
            i+=5;
        }
        return fizzAndBuzzLists.toString();
    }
}
