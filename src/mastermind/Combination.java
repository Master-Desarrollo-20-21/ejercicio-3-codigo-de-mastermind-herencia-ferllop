package mastermind;

public abstract class Combination {
	
	protected Position[] combination;
	protected final int COMBINATION_LENGTH = 4;
	
	public boolean hasColor(Color color) {
		for(Position position: this.combination) {
			if (position.color == color) {
				return true;
			}
		}		
		return false;
	}
	
	public String getHiddenString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < combination.length; i++) {
			result.append("x");
		}		
		return result.toString();
	}
	
	public String getUnhiddenString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < combination.length; i++) {
			result.append(Color.getInitialFromColor(combination[i].color));
		}		
		return result.toString();
	}	
}
