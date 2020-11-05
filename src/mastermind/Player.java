package mastermind;

import java.util.ArrayList;

public class Player {

	ArrayList<ProposedCombination> proposedCombinations;

	public Player() {
		proposedCombinations = new ArrayList<ProposedCombination>();
	}

	public void printAttempts() {
		new ConsoleIO().printAttempts(proposedCombinations.size()+1);
	}

	public void printResults(SecretCombination secretCombination) {
		ConsoleIO console = new ConsoleIO();
		for (ProposedCombination proposedCombination : proposedCombinations) {
			int blacks = proposedCombination.checkBlacks(secretCombination);
			int whites = proposedCombination.checkWhites(secretCombination);
			console.printProposalResult(proposedCombination, blacks, whites);
		}
	}

	public void proposeCombination(int combinationLength) {
		char[] validColorInitials = new char[Color.values().length];
		for (int i = 0; i < Color.values().length; i++) {
			validColorInitials[i] = Color.getInitialFromColor(Color.values()[i]);
		}
		ProposedCombination proposedCombination = new ProposedCombination(
		new ConsoleIO().getValidValue("Propose a combination", validColorInitials, combinationLength));
		proposedCombinations.add(proposedCombination);
	}
}
