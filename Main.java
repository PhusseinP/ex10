import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Hussein", "husseinsyhudgvfhjsd@coolman.com");
        Person person2 = new Person("Pluto", "pluto@coolerman.com");

        Contact contact = new Contact();
        contact.addPerson(person1);
        contact.addPerson(person2);

        contact.display();
    }
}

class Person{
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "\nName: " + name + "\nEmail Address:" + email + "\n";
    }

}

class Contact implements Iterable{
    private ArrayList<Person> myList = new ArrayList<>();
    public Contact(){
    }
    public void addPerson(Person a){
        myList.add(a);
    }
    @Override
    public String toString() {
        return "Contact{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    //has to have a for-each loop
    public void display(){
        Iterator<Person> it = myList.iterator();
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(it.next());
        }
    }
}