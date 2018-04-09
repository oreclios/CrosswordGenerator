package crossword;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Candidate {
	
	public WordList wordList;
	public double fitness;
	public Grid grid;
	public List<Integer> badWords = new ArrayList<Integer>();
	
	public WordList getWordList() {
		return wordList;
	}
	
	public void setWordList(WordList wordList) {
		this.wordList = wordList;
	}
	
	public double getFitness() {
		return fitness;
	}
	
	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
	
	public Grid getGrid() {
		return grid;
	}
	
	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	public void evaluate() {
		/*Obtenemos la energía de la solucion:*/
		this.fitness = 0;
		this.badWords.clear();
		
		Grid gridaux = this.grid;
		/*Establecemos todos los valores a 1:*/
		for(int i=0; i<gridaux.nrows; i++) {
			for(int j=0; j<gridaux.ncols; j++) {
				if(gridaux.gridv[i][j] != "0")
					gridaux.gridv[i][j]="1";
			}
		}
		
		/*Añadimos las palabras:*/
		for(int i=0; i<this.wordList.nwords; i++) {
			/*Si es HORIZONTAL:*/
			if(this.wordList.wordList.get(i).pos == 0) {
					
				int row = this.wordList.wordList.get(i).row;
				int ini = this.wordList.wordList.get(i).col;
				int fin = ini+this.wordList.wordList.get(i).length;
				
				//System.out.println(this.wordList.wordList.get(i).value);
				//System.out.printf("row[%d], ini[%d], fin[%d]\n", row, ini, fin);
			
				for(int k=ini; k<fin; k++) {
					if(gridaux.gridv[row][k] != "0" && gridaux.gridv[row][k] == "1") {
						gridaux.gridv[row][k] = String.
							valueOf(this.wordList.wordList.get(i).getValue().charAt(k-ini));
					}
					else if(gridaux.gridv[row][k] != "0" && gridaux.gridv[row][k] != "1") {
						if(gridaux.gridv[row][k] != String.
								valueOf(this.wordList.wordList.get(i).getValue().charAt(k-ini))) {
							this.fitness++;
							this.badWords.add(i);
						}
						gridaux.gridv[row][k] = String.
								valueOf(this.wordList.wordList.get(i).getValue().charAt(k-ini));
					}
				}
		
			}
			/*Si es VERTICAL:*/
			else {
		
				int col = this.wordList.wordList.get(i).col;
				int ini = this.wordList.wordList.get(i).row;
				int fin = ini+this.wordList.wordList.get(i).length;
				
				//System.out.println(this.wordList.wordList.get(i).value);
				//System.out.printf("col[%d], ini[%d], fin[%d]\n", col, ini, fin);
		
				for(int k=ini; k<fin; k++) {
					if(gridaux.gridv[k][col] != "0" && gridaux.gridv[k][col] == "1") {
						gridaux.gridv[k][col] = String.
							valueOf(wordList.wordList.get(i).getValue().charAt(k-ini));
					}else if(gridaux.gridv[k][col] != "0" && gridaux.gridv[k][col] != "1") {
						if(gridaux.gridv[k][col] != String.
								valueOf(wordList.wordList.get(i).getValue().charAt(k-ini))) {
							this.fitness++;
							this.badWords.add(i);
						}
						gridaux.gridv[k][col] = String.
								valueOf(wordList.wordList.get(i).getValue().charAt(k-ini));
					}
				}
			}
		}
			
	}
	
	public void perturb() {
		
		char[] constrs;
		String constraints;
		
		/*Para cada palabra mala:*/
		for(int i=0; i<this.badWords.size(); i++) {
			/*Decidimos si cambiamos la palabra:*/
			if(ThreadLocalRandom.current().nextDouble() > 0.6) {
				
				/*System.out.printf("palabra antigua: %s\n", 
						this.wordList.wordList.get(this.badWords.get(i)).getValue());*/
				
				constrs = new char[this.wordList.wordList.get(this.badWords.get(i)).length];
				for(int j=0; j<this.wordList.wordList.get(this.badWords.get(i)).length; j++) {
					constrs[j]='_';
				}
				constraints = String.valueOf(constrs);
				WordBBDD wordddbb = new WordBBDD();
				this.wordList.wordList.get(this.badWords.get(i)).setValue(wordddbb.getWord(constraints));
				
				/*System.out.printf("palabra nueva: %s\n", 
						this.wordList.wordList.get(this.badWords.get(i)).getValue());*/
			}
		}
		
	}
	
	
	

}
