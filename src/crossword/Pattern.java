package crossword;

public class Pattern {
	
	public String gridv[][];
	
	public Pattern(int nrow, int ncol) {
		this.gridv = new String[nrow][ncol];
	}
	
	public void setPattern1() {
		this.gridv[0][1]="0";
		this.gridv[0][2]="0";
		this.gridv[0][3]="0";
		this.gridv[0][4]="0";
		this.gridv[0][12]="0";
		
		this.gridv[1][1]="0";
		this.gridv[1][2]="0";
		this.gridv[1][3]="0";
		this.gridv[1][4]="0";
		this.gridv[1][5]="0";
		this.gridv[1][6]="0";
		this.gridv[1][8]="0";
		this.gridv[1][9]="0";
		this.gridv[1][10]="0";
		this.gridv[1][11]="0";
		this.gridv[1][12]="0";
		
		this.gridv[2][1]="0";
		this.gridv[2][2]="0";
		this.gridv[2][3]="0";
		this.gridv[2][8]="0";
		this.gridv[2][9]="0";
		this.gridv[2][11]="0";
		this.gridv[2][12]="0";
		
		this.gridv[3][1]="0";
		this.gridv[3][2]="0";
		this.gridv[3][3]="0";
		this.gridv[3][4]="0";
		this.gridv[3][5]="0";
		this.gridv[3][6]="0";
		this.gridv[3][8]="0";
		this.gridv[3][9]="0";
		this.gridv[3][11]="0";
		this.gridv[3][12]="0";
		
		this.gridv[4][1]="0";
		this.gridv[4][2]="0";
		this.gridv[4][3]="0";
		this.gridv[4][4]="0";
		this.gridv[4][5]="0";
		this.gridv[4][6]="0";

		this.gridv[5][8]="0";
		this.gridv[5][9]="0";
		this.gridv[5][11]="0";
		this.gridv[5][12]="0";
		this.gridv[5][13]="0";
		
		this.gridv[6][0]="0";
		this.gridv[6][1]="0";
		this.gridv[6][2]="0";
		this.gridv[6][3]="0";
		this.gridv[6][4]="0";
		this.gridv[6][5]="0";
		this.gridv[6][6]="0";
		this.gridv[6][8]="0";
		this.gridv[6][9]="0";
		this.gridv[6][11]="0";
		this.gridv[6][12]="0";
		this.gridv[6][13]="0";
		
		this.gridv[7][0]="0";
		this.gridv[7][1]="0";
		this.gridv[7][2]="0";
		this.gridv[7][4]="0";
		this.gridv[7][11]="0";
		this.gridv[7][12]="0";
		this.gridv[7][13]="0";
		
		this.gridv[8][4]="0";
		this.gridv[8][5]="0";
		this.gridv[8][6]="0";
		this.gridv[8][7]="0";
		this.gridv[8][8]="0";
		this.gridv[8][9]="0";

		this.gridv[9][0]="0";
		this.gridv[9][1]="0";
		this.gridv[9][2]="0";
		this.gridv[9][3]="0";
		this.gridv[9][8]="0";
		this.gridv[9][9]="0";
		this.gridv[9][11]="0";
		this.gridv[9][12]="0";
		this.gridv[9][13]="0";
		
	}
	
	public void setPattern2() {
		this.gridv[0][1]="0";
		this.gridv[0][3]="0";
		this.gridv[0][4]="0";
		this.gridv[0][12]="0";
		
		this.gridv[1][1]="0";
		this.gridv[1][3]="0";
		this.gridv[1][4]="0";
		this.gridv[1][5]="0";
		this.gridv[1][6]="0";
		this.gridv[1][8]="0";
		this.gridv[1][9]="0";
		this.gridv[1][10]="0";
		this.gridv[1][11]="0";
		this.gridv[1][12]="0";
		
		this.gridv[2][8]="0";
		
		this.gridv[3][1]="0";
		this.gridv[3][3]="0";
		this.gridv[3][4]="0";
		this.gridv[3][5]="0";
		this.gridv[3][6]="0";
		this.gridv[3][8]="0";
		this.gridv[3][9]="0";
		this.gridv[3][11]="0";
		this.gridv[3][12]="0";
		
		this.gridv[4][1]="0";
		this.gridv[4][3]="0";
		this.gridv[4][4]="0";
		this.gridv[4][5]="0";
		this.gridv[4][6]="0";

		this.gridv[5][8]="0";
		this.gridv[5][9]="0";
		this.gridv[5][11]="0";
		this.gridv[5][13]="0";
		
		this.gridv[6][0]="0";
		this.gridv[6][2]="0";
		this.gridv[6][3]="0";
		this.gridv[6][4]="0";
		this.gridv[6][5]="0";
		this.gridv[6][8]="0";
		this.gridv[6][9]="0";
		this.gridv[6][11]="0";
		this.gridv[6][13]="0";
		
		this.gridv[7][0]="0";
		this.gridv[7][2]="0";
		this.gridv[7][4]="0";
		this.gridv[7][11]="0";
		this.gridv[7][13]="0";
		
		this.gridv[8][4]="0";
		this.gridv[8][5]="0";
		this.gridv[8][7]="0";
		this.gridv[8][8]="0";
		this.gridv[8][9]="0";

		this.gridv[9][0]="0";
		this.gridv[9][1]="0";
		this.gridv[9][2]="0";
		this.gridv[9][3]="0";
		this.gridv[9][8]="0";
		this.gridv[9][9]="0";
		this.gridv[9][11]="0";
		this.gridv[9][12]="0";
		this.gridv[9][13]="0";
		
	}
	
	public void setPattern3() {
		this.gridv[0][1]="0";
		this.gridv[0][2]="0";
		this.gridv[0][7]="0";
		this.gridv[0][8]="0";
		this.gridv[0][9]="0";
		
		this.gridv[1][8]="0";
		
		this.gridv[2][1]="0";
		this.gridv[2][2]="0";
		this.gridv[2][6]="0";
		this.gridv[2][8]="0";
		
		this.gridv[3][6]="0";
		
		this.gridv[4][1]="0";
		this.gridv[4][2]="0";
		this.gridv[4][4]="0";
		this.gridv[4][5]="0";
		this.gridv[4][6]="0";
		this.gridv[4][8]="0";

		this.gridv[5][0]="0";
		this.gridv[5][1]="0";
		this.gridv[5][2]="0";
		this.gridv[5][8]="0";
		
		this.gridv[6][0]="0";
		this.gridv[6][7]="0";
		this.gridv[6][8]="0";
		
		this.gridv[7][2]="0";
		this.gridv[7][3]="0";
		this.gridv[7][5]="0";
		
		this.gridv[8][5]="0";
		this.gridv[8][6]="0";
		this.gridv[8][7]="0";
		this.gridv[8][9]="0";

		this.gridv[9][0]="0";
		this.gridv[9][2]="0";
		this.gridv[9][3]="0";
		this.gridv[9][4]="0";
	}
	
	public void setPattern4() {
		this.gridv[0][8]="0";
		this.gridv[1][8]="0";
		this.gridv[2][8]="0";
		this.gridv[3][4]="0";
		this.gridv[3][5]="0";
		this.gridv[3][10]="0";
		this.gridv[4][0]="0";
		this.gridv[4][1]="0";
		this.gridv[4][2]="0";
		this.gridv[4][6]="0";
		this.gridv[4][7]="0";
		this.gridv[4][12]="0";
		this.gridv[4][13]="0";
		this.gridv[4][14]="0";
		this.gridv[5][14]="0";
		this.gridv[6][3]="0";
		this.gridv[6][8]="0";
		this.gridv[6][9]="0";
		this.gridv[7][4]="0";
		this.gridv[7][10]="0";
		this.gridv[8][5]="0";
		this.gridv[8][6]="0";
		this.gridv[8][11]="0";
		this.gridv[9][0]="0";
		this.gridv[10][0]="0";
		this.gridv[10][1]="0";
		this.gridv[10][2]="0";
		this.gridv[10][7]="0";
		this.gridv[10][8]="0";
		this.gridv[10][12]="0";
		this.gridv[10][13]="0";
		this.gridv[10][14]="0";
		this.gridv[11][4]="0";
		this.gridv[11][9]="0";
		this.gridv[11][10]="0";
		this.gridv[12][6]="0";
		this.gridv[13][6]="0";
		this.gridv[14][6]="0";		
	}
	
	public void setPattern5() {
		
	}

}
