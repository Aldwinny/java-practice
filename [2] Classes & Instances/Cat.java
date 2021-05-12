/**
 * Me learning about constructors.
 * 
 * @author Aldwin Dennis Reyes
 */
class Cat {

    String name;
    int age;
    private static int counter = 1;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.print(counter > 5 ? "You have too many cats\n" : "");
        counter++;
    }

    public static int getNumberOfCats() {
        return counter;
    }
}
