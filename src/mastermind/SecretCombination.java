package mastermind;

import java.util.Random;

public class SecretCombination extends Combination {

	public SecretCombination() {
		do {
			Position[] combination = new Position[this.COMBINATION_LENGTH];
			for (int i = 0; i < combination.length; i++) {
				int randomValue = new Random().nextInt(Color.values().length);
				Color randomColor = Color.values()[randomValue];
				combination[i] = new Position(randomColor);
			}
			this.combination = combination;
		} while (this.hasDuplicates());
	}
	
	private boolean hasDuplicates() { //COPIA PEGA DEL ALGORITMO DE CONSOLE ARJJJJ!!
		String string = this.getUnhiddenString();
		
		for (int i = 0; i< string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if (j==i) {
					continue;
				}
				if (string.toCharArray()[j] == string.toCharArray()[i]) {
					return true;
				}
			}
		}		
		return false;
	}
}
