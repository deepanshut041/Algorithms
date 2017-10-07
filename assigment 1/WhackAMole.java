import java.util.Random;
import java.io.*;
public class WhackAMole {
	//It contains three integer instance variables called score, molesLeft, and attemptsLeft and moleGrid which is a 2-dimensional array of chars
	public int score, molesLeft, attemptsLeft, gridDimension;
	public boolean moles[][];
	public char moleGrid[][];
	
	public WhackAMole(int numAttempts, int gridDimension){

		this.gridDimension = gridDimension;
		this.molesLeft = 0;
		this.attemptsLeft = numAttempts;
		this.score = 0;
		moleGrid = new char[gridDimension][gridDimension];
		moles = new boolean[gridDimension][gridDimension];
		
		//Initialize the moleGrid with the '*'.
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				moleGrid[i][j] = '*';
				moles[i][j] = false;
			}
		}
	}

	public boolean place(int x, int y){
		//Updating moleGrid with M
		if (!moles[x][y]) {
			moles[x][y] = true;
			moleGrid[x][y] = 'M';
			//updating number of moles left
			molesLeft = molesLeft + 1;
			//retuns true and add true to that position
			return true;
		}
		else{
			return false;
		}
		
	}

	public void whack(int x, int y){
		if (x == -1 && y == -1) {
			attemptsLeft = 0;
		}
		else{
			if (moles[x][y]){
				molesLeft = molesLeft - 1;
				attemptsLeft = attemptsLeft -1;
				score = score + 1;
				moleGrid[x][y] = 'W';
				moles[x][y] = false;
			}
			else{
				attemptsLeft = attemptsLeft - 1;
			}
		}
	}

	public void printGridToUser(){
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				System.out.print(moleGrid[i][j]);
			}
			System.out.println();
		}
	}

	public void printGrid(){
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				if (moles[i][j]) {
					System.out.print('M');	
				}
				else{
				System.out.print(moleGrid[i][j]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args)throws IOException {
		WhackAMole whackAMole = new WhackAMole(50, 10);
		
		int moles[] = {3, 1, 3, 4, 7, 7, 2, 9, 2, 6};
		for (int i = 0 ; i < 10 ; i++ ) {
			if( whackAMole.place(i,moles[i])){
				System.out.println("Successfully placed a mole");
			}else{
				System.out.println("Successfully placed a mole");
			}
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the game WhackAMole");
		System.out.println("You have maximum 50 attemps to play the game");
		while (whackAMole.attemptsLeft != 0){
			whackAMole.printGridToUser();
			System.out.println(" attemps left and moles " + whackAMole.attemptsLeft + " / " + whackAMole.molesLeft );
			System.out.println("Enter the location where you want Whack in x and y respectively");
			int x = Integer.parseInt(in.readLine());
			int y = Integer.parseInt(in.readLine());
			whackAMole.whack(x, y); 
		}
		whackAMole.printGrid();
		System.out.println("Your score is : " + whackAMole.score );
	}
}