package dataStructures;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues
{
    public static void main(String[] args)
    {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("camilo", 25));
        linkedList.add(new Person("Luis", 24));
        linkedList.add(new Person("carla", 23));
        linkedList.add(new Person("elkin", 22));
        linkedList.add(0, new Person("juan", 21));

        ListIterator<Person> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("__________________________________");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        queues();

    }

    public static void queues()
    {
        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(new Person("carlos", 23));
        personQueue.add(new Person("luis", 16));
        personQueue.add(new Person("camilo", 25));
        personQueue.add(new Person("daniel", 22));
        System.out.println("Size: " + personQueue.size());
        System.out.println("Peek: " + personQueue.peek());
        System.out.println("Poll or Remove: " + personQueue.poll());
        System.out.println("Poll or Remove by object: " + personQueue.remove(new Person("luis", 16)));
        System.out.println("Size: " + personQueue.size());
        System.out.println("Peek: " + personQueue.peek());
        for (Person person : personQueue
        )
        {
            System.out.println("Queue: " + person);

        }
    }
    static record Person(String name, int age){}

}
