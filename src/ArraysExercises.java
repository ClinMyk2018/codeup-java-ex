import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] morePeople = Arrays.copyOf(people, people.length + 1);
        morePeople[morePeople.length - 1]= person;
        return morePeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Bill Jenkins"), new Person("John Hammerstein"), new Person("John Stamos")};

//        for (Person person : people) {
//            System.out.println(person.getFullName());
//        }

//        for (int i = 0; i < people.length; i++) {
//            System.err.println(people[i].getFullName());
//        }

        people=addPerson(people, new Person("Val Kilmer"));
//        for (int i = 0; i < people.length; i++) {
//            System.err.println(people[i].getFullName());
//        }
    }
}
