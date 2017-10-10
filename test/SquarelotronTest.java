import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquarelotronTest {
    Squarelotron squarelotron;

    @Before
    public void setUp(){
        squarelotron = new Squarelotron(4);
    }

    @Test
    public void testConstructor(){
        int  array[][] = new int[4][4];
        int k=1;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++, k++){
                //array[i][j] = k*k; Actual test
                array[i][j] = k;
            }
        }
         assertArrayEquals(null, array, squarelotron.getSquarelotron());
    }

    @Test
    public void testClockwiseRotateRight(){
        int array[][]={
                {13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}
        };
        squarelotron.rotateRight(1);
        assertArrayEquals(null, array, squarelotron.getSquarelotron());
    }

    @Test
    public void testAntiClockwiseRotateRight(){
        int array[][]={
                {4, 8, 12, 16},{3, 7, 11, 15},{2, 6, 10, 14},{1, 5, 9, 13}
        };
        squarelotron.rotateRight(-1);
        assertArrayEquals(null, array, squarelotron.getSquarelotron());
    }
}
