/**
 *
 * @author DIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal Anjing = new Animal("Anjing","Hitam", 1);
        Animal Kucing = new Animal("Kucing","Putih", 2);
        Animal Burung = new Animal("Burung","Hijau", 3);
        Animal Kuda = new Animal("Kuda","Cokelat", 4);
        Animal Kelinci = new Animal("Kelinci","Putih", 5);
        
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(Anjing);
        queue.add(Kucing);
        queue.add(Burung);
        queue.add(Kuda);
        queue.add(Kelinci);
        //queue.printQueue();

        queue.remove();
        queue.remove();
        //queue.printQueue();

        //System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(Kuda);
        
        queue.printQueue();
    }
    
}