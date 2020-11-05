package mastermind;

public class ProposedCombination extends Combination{
	
	public ProposedCombination(char[] proposedCombination) {
		this.combination = new Position[COMBINATION_LENGTH];
		for (int i = 0; i < proposedCombination.length; i++) {
			this.combination[i] = new Position(Color.getColorFromInitial(proposedCombination[i]));
		}
	}
	
	public ProposedCombination(String proposedCombination) {
		this(proposedCombination.toCharArray());
	}
	
	public int checkBlacks(SecretCombination secretCombination) {
		int blacks = 0;
		for (int i = 0; i < this.combination.length; i++) {
			if (this.combination[i].color == secretCombination.combination[i].color) {
				blacks++;
			}
		}
		return blacks;
	}

	public int checkWhites(SecretCombination secretCombination) {
		int whites = 0;
		for (Position position: combination) {
			if(secretCombination.hasColor(position.color)) {
				whites++;
			}
		}
		return whites - checkBlacks(secretCombination);
	}
}
