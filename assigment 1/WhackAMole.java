import java.util.Random;
import java.io.*;
public class WhackAMole {
	//It contains three integer instance variables called score, molesLeft, and attemptsLeft and moleGrid which is a 2-dimensional array of chars
	public int score, molesLeft,attemptsLeft,gridDimension;
	public boolean leaveGame,moles[][];
	public char moleGrid[][];
	
	public WhackAMole(int numAttempts, int gridDimension){
		this.gridDimension = gridDimension;
		this.molesLeft = 0;
		this.attemptsLeft = numAttempts;
		leaveGame = false;
		moleGrid = new char[gridDimension][gridDimension];
		moles = new boolean[gridDimension][gridDimension];
		//Making object of random class
		Random rand = new Random();

		//Initialize the moleGrid with the '*'.
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				moleGrid[i][j] = '*';
				moles[i][j] = false;
			}
		}
		for (int i = 0 ; i < gridDimension ; i++ ) {
			int n= rand.nextInt(gridDimension);
			boolean b = place(i,n);
		}
	}

	public boolean place(int x, int y){
		//Updating moleGrid with m
		moles[x][y] =true;
		//updating number of moles left
		molesLeft++;
		return true;
	}

	public void whack(int x, int y){
		if ((x == -1 && y == -1) || attemptsLeft == 0) {
			leaveGame = true;
		}
		else{
			if (moles[x][y]){
				molesLeft--;
				attemptsLeft--;
				score++;
				moleGrid[x][y] = 'W';
				moles[x][y] = false;
			}
			else{
				attemptsLeft--;
			}

			if (attemptsLeft == 0) {
				leaveGame = true;
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
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the game WhackAMole");
		System.out.println("You have maximum 50 attemps to play the game");
		while (!whackAMole.leaveGame){
			whackAMole.printGridToUser();
			System.out.println("Enter the location where you want Whack in x and y respectively");
			int x = Integer.parseInt(in.readLine());
			int y = Integer.parseInt(in.readLine());
			whackAMole.whack(x, y); 
		}
		whackAMole.printGrid();
		System.out.println("Your score is : " + whackAMole.score );
	}
}