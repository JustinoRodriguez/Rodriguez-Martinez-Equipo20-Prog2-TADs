import exceptions.EmptyQueueException;

public class Main {
    public static void main(String[] args) throws EmptyQueueException {
        MyQueueImpl lista = new MyQueueImpl();
        System.out.println(lista.isEmpty());
        lista.enqueue(1);
        lista.enqueue(5);
        lista.enqueue(3);
        System.out.println(lista.isEmpty());
        System.out.println(lista.dequeue());
        System.out.println(lista.dequeue());
        System.out.println(lista.dequeue());
        System.out.println(lista.dequeue());
    }
}
