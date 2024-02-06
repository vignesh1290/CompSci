package battleship;

public class Board {
	public int[][] board1 = new int[10][10];

	public Board() {
		
	}
	public int[][] init(){
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				board1[i][j]=0;
			}
		}
		return board1;
	}
	public void place(int x, int y, int length, int rotation) {
		
		if (rotation==90) {
			for(int i=0; i<length; i++) {
				board1[x][y-i]=1;
			}
		}
		if (rotation==180) {
			for(int i=0; i<length; i++) {
				board1[x-i][y]=1;
			}
		}
		if (rotation==270) {
			for(int i=0; i<length; i++) {
				board1[x][y+i]=1;
			}
		}
		
		}
	
}
	


