import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQues {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

//        add
        linkedList.add(new Person("John", 20));
        linkedList.add(new Person("Mary", 30));
        linkedList.add(new Person("Mike", 40));

//        looping
        //        while (PersonIterator.hasNext()) {
//            System.out.println(PersonIterator.next());
//        }
        for (Person person : linkedList) {
            System.out.println(person);
        }
        System.out.println();
// reverse looping
        ListIterator<Person> personListIterator = linkedList.listIterator(3);
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    public static void ques(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("John", 20));
        supermarket.add(new Person("Mary", 30));
        supermarket.add(new Person("Mike", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }

    static record Person(String name, int age) {
    }
}
