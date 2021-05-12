/**
 * This is me trying to implement time into Java without any knowledge of the
 * {@code System.currentTimeMillis()}.
 * 
 * @author Aldwin Dennis Reyes
 */
class BombCounter {

	public static void main(String[] args) {
		int time = 3;
		while (time > 0) {
			switch (time) {
				case 1:
					System.out.println("1.... oH No");
					--time;
					break;
				case 2:
					System.out.println("2...Oh noo");
					--time;
					break;
				case 3:
					System.out.println("bomb is exploding... 3");
					--time;
					break;
			}

		}
		System.err.println("KABOOM!");

	}

}
