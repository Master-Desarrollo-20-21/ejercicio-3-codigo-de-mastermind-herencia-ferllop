package mastermind;

class Mastermind {
	public final int ALLOWED_TOTAL_ATTEMPTS = 10;
	
	Game game;
	
	public void play() {
		do {			
			this.game = new Game();
			this.game.play(this.ALLOWED_TOTAL_ATTEMPTS);
		} while (this.game.resume());
		System.out.println("BYE BYE");
	}	

	public static void main(String[] args) {
		new Mastermind().play();
	}
}
