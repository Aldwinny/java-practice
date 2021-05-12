import java.util.*;

public class Invoker {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		for (int i = num.nextInt(); i > 0; i--) {
			Cat callcat = new Cat("cat" + i, i);
		}
		System.out.println(Cat.getNumberOfCats());

	}

}
