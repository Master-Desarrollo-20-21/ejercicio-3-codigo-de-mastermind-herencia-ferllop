package mastermind;

public class Game {
	
	Player player;	
	SecretCombination secretCombination;
	
	public Game() {
		this.secretCombination = new SecretCombination();
		this.player = new Player();
	}

	public void play(int allowedTotalAttempts) {
		do {
			player.printAttempts();
			this.printUnhidden(secretCombination);
			player.printResults(secretCombination);
			player.proposeCombination(secretCombination.COMBINATION_LENGTH);		
		} while (
			!totalAttemptsSurpassed(allowedTotalAttempts) && 
			!allBlacks(this.getLastProposedCombination()) 
		);		
	}	
	
	private boolean totalAttemptsSurpassed(int allowedTotalAttempts) {
		if (player.proposedCombinations.size() >= allowedTotalAttempts) {
			new ConsoleIO().print("You've lost!!!");
			return true;
		}		
		return false;
	}
	
	private boolean allBlacks(ProposedCombination proposedCombination) {
		if (proposedCombination.checkBlacks(secretCombination) == secretCombination.COMBINATION_LENGTH) {
			new ConsoleIO().print("You've won!!!");
			return true;
		};		
		return false;
	}
	
	private ProposedCombination getLastProposedCombination() {
		return player.proposedCombinations.get(player.proposedCombinations.size()-1);
	}

	public boolean resume() {
		String answer;
		do {
			 answer = new ConsoleIO().getValidValue("¿Quieres volver a jugar? (s/n)", new char[] {'s', 'n'});			
		} while (!answer.equals("s") && !answer.equals("n") );	
		return answer.equals("s");
	}
	
	public void printUnhidden(Combination combination) {
		new ConsoleIO().print(combination.getUnhiddenString());
	}
	
	public void printHidden(Combination combination) {		
		new ConsoleIO().print(combination.getHiddenString());
	}	
}
