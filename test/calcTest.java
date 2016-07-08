import com.interlink.calcFunctions;
import org.junit.Test;

import static com.interlink.calcFunctions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by employee on 7/8/16.
 */
public class calcTest {
    @Test
    public void emptyStringTest() throws Exception {
        assertThat(sum(""),is(0));

    }

    @Test
    public void oneParametrSumTest() throws Exception {
        assertThat(sum("2"),is(2));
    }

    @Test
    public void twoParametrSumTest() throws Exception {
        assertThat(sum("1,2"),is(3));

    }

    @Test
    public void unknownAmountNumbersSumTest() throws Exception {
        assertThat(sum("1,2,6,8,9"),is(26));

    }

    @Test
    public void newLineExceptOfComaTest() throws Exception {
        assertThat(sum("1\n3,5"),is(9));

    }

    @Test
    public void commasAmdNewLineTest()throws Exception{
        assertThat(sum("1\n5\n6\n7,8,2"),is(29));
    }
    @Test
    public void customDelimiterTest()throws Exception{
        assertThat(sum("//;\n1;4"),is(5));
    }
}
