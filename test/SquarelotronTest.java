import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquarelotronTest {
    Squarelotron squarelotron;

    @Before
    public void setUp(){
        squarelotron = new Squarelotron(5);
    }

    @Test
    public void testConstructor(){
        int  array[][] = new int[5][5];
        int k=1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++, k++){
                array[i][j] = k*k;
            }
        }
         assertArrayEquals(null, array, squarelotron.getSquarelotron());
    }
}
