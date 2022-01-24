/**
 *
 * @author DIAN
 */
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Animal[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Animal[capacity];
    }

    public void add(Animal employee) {
        if (back == queue.length) {
            Animal[] newArray = new Animal[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Animal remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Animal animal = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return animal;
    }

    public Animal peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}