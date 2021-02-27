import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList(1, 2, 4, 4, 2, 3, 4, 1 ,7), Arrays.asList(1,7)},
                {Arrays.asList(1,4 ,4,5,7), Arrays.asList(5,7)}
        });
    }

    private int[] n1;
    private int[] res;
    private NewArray array;

    public ParametrizedTest(List<Integer> n1,  List<Integer> res) {

        this.n1 = new int[n1.size()];
        this.res = new int[res.size()];
        for(int i = 0;i < this.n1.length;i++){
            this.n1[i] = n1.get(i);
        }
        for(int i=0;i<this.res.length;i++){
            this.res[i] = res.get(i);
        }
    }
    @Before
    public void init(){
        array = new NewArray();
    }
    @Test
    public void newArrayTest() throws RuntimeException{
        Assert.assertArrayEquals(res, array.getAfterFour(n1));
    }

}
