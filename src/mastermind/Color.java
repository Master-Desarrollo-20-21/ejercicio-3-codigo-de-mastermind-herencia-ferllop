package mastermind;

enum Color {
	RED,
	BLUE,
	YELLOW,
	GREEN,
	ORANGE,
	PURPLE;
	
	public static char getInitialFromColor(Color color) {
		char result;
		switch (color) {
			case RED:
				result = 'r';
				break;
			case BLUE:
				result = 'b';
				break;
			case YELLOW:
				result = 'y';
				break;
			case GREEN:
				result = 'g';
				break;
			case ORANGE:
				result = 'o';
				break;
			case PURPLE:
				result = 'p';
				break;
			default:
				result = '-'; //CHECK THIS!!!!
		}
		
		return result;		
	}
	
	public static Color getColorFromInitial(char initial) {
		Color result = null;
		
		switch (initial) {
			case 'r':
				result = RED;
				break;
			case 'b':
				result = BLUE;
				break;
			case 'y':
				result = YELLOW;
				break;
			case 'g':
				result = GREEN;
				break;
			case 'o':
				result = ORANGE;
				break;
			case 'p':
				result = PURPLE;
				break;
		}
		
		return result;		
	}
}
