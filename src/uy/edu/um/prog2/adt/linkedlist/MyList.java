package uy.edu.um.prog2.adt.linkedlist;
import uy.edu.um.prog2.adt.linkedlist.InvalidPosition;

public interface MyList<T> {
    public void add(T value);

    public void remove(int position) throws InvalidPosition;

    public T get(int position);

    public int size();

    //public boolean elementExists(Object value);
}
