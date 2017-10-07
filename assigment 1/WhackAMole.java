import java.util.Random;
import java.io.*;
public class WhackAMole {
	//It contains three integer instance variables called score, molesLeft, and attemptsLeft and moleGrid which is a 2-dimensional array of chars
	public int score, molesLeft,attemptsLeft;
	public char moleGrid[][]
	
	public WhackAMole(int numAttempts, int gridDimension){
		this.molesLeft = 0;
		this.attemptsLeft = numAttempts;
		moleGrid = new char[gridDimension][gridDimension];

		//Making object of random class
		Random rand = new Random();

		//Initialize the moleGrid with the '*'.
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				moleGrid[i][j] = '*';
			}
			int n= rand.nextInt(gridDimension);
			Boolean b = place(i,n);
		}
	}

	public boolean place(int x, int y){
		//Updating moleGrid with m
		moleGrid [x][y] = 'M';
		//updating number of moles left
		molesLeft++;
		return true;
	}

	public void whack(int x, int y){
		if (x == -1 && y == -1) {
			attemptsLeft = 0;
		}
		else{
			if (moleGrid[x][y] == 'M'){
				molesLeft--;
				attemptsLeft--;
				score++;
				moleGrid[x][y] = 'W'
			}
			else{
				attemptsLeft--;
			}
		}
	}

	public void printGridToUser(){
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				if (moleGrid[i][j] == 'M') {
					System.out.print('*');	
				}
				else{
					System.out.print(moleGrid[i][j]);
				}
			}
			System.out.println();
		}
	}

	public void printGrid(){
		for (int i = 0 ; i < gridDimension ; i++ ) {
			for ( int j = 0 ; j < gridDimension ; j++ ) {
				System.out.print(moleGrid[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args)throws IOException {
		WhackAMole whackAMole = new WhackAMole(50, 10);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the game WhackAMole");
		System.out.println("You have maximum 50 attemps to play the game");
		while (numAttempts != 0){	
			printGridToUser();
			System.out.println("Enter the location where you want Whack in x and y respectively");
			int x = Integer.parseInt(in.readLine());
			int y = Integer.parseInt(in.readLine());
			whack(x, y); 
		}
		printGrid();
		System.out.println("Your score is : " + score );
	}
}