public class Squarelotron {
    public int[][] squarelotron;
    public int size;

    public Squarelotron(int n){
        size = n;
        squarelotron = new int[size][size];
        int k = 1;
        for(int i = 0; i < size; i++){
            for (int j=0; j < size; j++){
                //squarelotron[i][j] = k * k;
                //Modified actual k for testing purpose
                squarelotron[i][j] = k;
                k++;
            }
        }
    }

    public int[][] getSquarelotron() {
        return squarelotron;
    }

    public Squarelotron  mainDiagonalFlip(int ring){
        Squarelotron square= new Squarelotron(size);
        int [][] array = square.getSquarelotron();
        for(int i = 0; i < size; i++){
            for (int j=0; j < size; j++){
                if ((i>0 && i < ring) && (j>0 && j < ring)){
                    array[i][j] = squarelotron[i][j];
                }
                else {
                    array[i][j] = squarelotron[j][i];
                }
            }
        }
        square.squarelotron = array;

        return square;
    }

    public Squarelotron upsideDownFlip(int ring){
        Squarelotron square= new Squarelotron(size);
        int [][] array = square.getSquarelotron();
        for(int i = 0,k = size -1; i < size; i++,k--){
            for (int j=0; j < size; j++){
                if ((i>0 && i < ring) && (j>0 && j < ring)){
                    array[i][j] = squarelotron[i][j];
                }
                else {
                    array[i][j] = squarelotron[k][j];
                }
            }
        }
        square.squarelotron = array;
        return square;
    }

    public void rotateRight(int numberOfTurns){
        int rotatedArray[][] = new int[size][size] ;
        for (int n = 0; n < numberOfTurns ; n++){
            for(int i = 0; i < size; i++){
                for (int j=0; j < size; j++) {
                    rotatedArray[i][j] = squarelotron[size - 1 - j][i];
                }
            }
        }
        for (int n = numberOfTurns ; n < 0 ; n++){
            for(int i = 0; i < size; i++){
                for (int j=0; j < size; j++) {
                    rotatedArray[i][j] = squarelotron[ j ][size- i -1];
                }
            }
        }
        squarelotron = rotatedArray;
    }

}
