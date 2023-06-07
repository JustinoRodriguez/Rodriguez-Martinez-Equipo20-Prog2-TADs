import exceptions.EmptyQueueException;
import exceptions.NoExiste;

public interface Lista <Tipo> {
    void add(Tipo value);
    void remove(int position) throws EmptyQueueException;
    Tipo get(int position) throws NoExiste, EmptyQueueException;
    int size();
}

