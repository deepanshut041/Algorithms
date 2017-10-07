public class WhackAMole {
	//It contains three integer instance variables called score, molesLeft, and attemptsLeft and moleGrid which is a 2-dimensional array of chars
	public int score, molesLeft,attemptsLeft;
	public char moleGrid[][]
	
	public WhackAMole(int numAttempts, int gridDimension){
		moleGrid = new char[gridDimension][gridDimension];

		//Initialize the moleGrid with the '*'.
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				moleGrid[i][j] = '*';
			}
		}

		this.attemptsLeft = numAttempts;
	}

	public boolean place(int x, int y){


	}

	public void whack(int x, int y){


	}

	public void printGridToUser(){


	}

	public void printGrid(){


	}

}