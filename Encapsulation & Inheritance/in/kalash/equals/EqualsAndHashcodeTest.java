package in.kalash.equals;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Kalash", 109, "077");
        Person person2 = new Person("Kalash", 109, "077");

        if(person1.equals(person2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
