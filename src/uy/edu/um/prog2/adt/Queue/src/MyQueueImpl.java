import exceptions.EmptyQueueException;

public class MyQueueImpl implements MyQueue{

    private LinkedList lista = new LinkedList();

    @Override
    public void enqueue(Object element) {
        lista.add(element);

    }

    @Override
    public Object dequeue() throws EmptyQueueException {
        Object a = lista.get(0);
        lista.remove(0);
        return a;
    }

    @Override
    public boolean isEmpty() {
        if (lista.size() == 0) {
            return true;
        }
        else{
            return false;

        }
    }
}
