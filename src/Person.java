
public class Person{

    private String name;

    // returns the person's name
    public String getName () {
        return this.name;
    }
    // changes the name property to the passed value
    public void setName (String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public String sayHello (){
        return String.format("%s says hello!", name);
    }
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] name) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}