package crossword;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorSA {
	
	public static void main(String[] args) throws IOException {
		
		Double energyQ;
		Double energyS;
		Double T;
		Double Pqs;
		Grid grid = new Grid(6,6);
		
		/*Establecemos la solución inicial:*/
		Candidate solv = new Candidate();
		Candidate solvn = new Candidate();
		solv.setGrid(grid);
		solvn.setGrid(grid);
		/*Establecemos las palabras iniciales:*/
		WordList wordList = new WordList();
		wordList.getWords(grid);
		wordList.fillWords();
		solv.setWordList(wordList);
		solv.evaluate();
		T=solv.getFitness();
		energyQ=T;
		System.out.printf("Energía inicial: %e\n", T);
		
		solv.grid.updateGrid(solv.wordList);
		solv.grid.printGrid(solv.wordList);
		
		/*for(int i=0; i<solv.wordList.nwords; i++) {
			System.out.printf("Palabra %d: %s\n", i, solv.wordList.wordList.get(i).getValue());
		}*/
		
		while(T > 0) {
			
			for(int i=0; i<100; i++) {
				
				/*perturb candidate:*/
				solvn.copy(solv);
				
				/*for(int j=0; j<solvn.wordList.nwords; j++) {
					System.out.printf("Palabra %d: %s\n", j, solvn.wordList.wordList.get(j).getValue());
				}*/
				
				solvn.perturb();
				
				/*Evaluate the new state:*/
				solvn.evaluate();
				
				/*Energy of the new state:*/
				energyS = solvn.getFitness();
				System.out.printf("Energía nuevo estado: %e\n", energyS);
				
				/*Probability of change:*/
				Pqs = 1/(1+Math.exp((energyS - energyQ)/energyS));
				System.out.printf("Probabilidad de cambio: %e\n", Pqs);
				
				if(ThreadLocalRandom.current().nextDouble() >= Pqs) {
					solv.copy(solvn);
					T=solv.getFitness();
				}
				
				System.out.printf("Energía: %e\n", T);
				
				solv.grid.updateGrid(solv.wordList);
				solv.grid.printGrid(solv.wordList);
				
			}
		}
		
		
	}

}
