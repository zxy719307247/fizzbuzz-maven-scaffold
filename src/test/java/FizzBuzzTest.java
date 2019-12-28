import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    public int input;
    public String output;

    public FizzBuzzTest(int input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
//                {1,"1"},
                {3,"Fizz"}/*,
                {5,"Buzz"},
                {15,"FizzBuzz"}*/
        });
    }

    @Test
    public void should_return_Fizz_given_num_dic_by_3() {
        assertThat(FizzBuzz.of(input)).isEqualTo(output);
    }
}