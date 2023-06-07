package uy.edu.um.prog2.adt.linkedlist;

public class MyLinkedListImpl<T> implements MyList<T> {
    private Nodo<T> first;
    private Nodo<T> last;

    public MyLinkedListImpl() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void add(T value) {
        Nodo<T> nodoAAgregar = new Nodo<>(value);

        if(this.first == null) {
            this.first = nodoAAgregar;
            this.last = nodoAAgregar;
        } else {
            this.last.setNext(nodoAAgregar);
        }
        this.last = nodoAAgregar;
    }

    @Override
    public void remove(int position) {
        if (this.first != null && position<size() && position>=0) {
            if (position == 0) {
                if (size() == 1){
                    this.first = null;
                    this.last = null;
                } else {
                this.first = this.first.getNext();
                }
            } else {
                Nodo<T> temp = this.first;
                Nodo<T> anterior = null;
                for (int i=0; i < position; i++) {
                    anterior = temp;
                    temp = temp.getNext();
                }
                anterior.setNext(temp.getNext());
                if (position == (size()-1)){
                    this.last = anterior;
                }
            }
        }
    }

    @Override
    public T get(int position) {
        T resultado = null;
        if (this.first != null && position<size() && position>=0) {
            int listPosition = 0;
            Nodo<T> temp = this.first;
            while (listPosition < position) {
                temp = temp.getNext();
                listPosition++;
            }
            resultado = temp.getValue();
        }
        return resultado;
    }

    @Override
    public int size() {
        int count = 0;

        Nodo<T> temp = this.first;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void imprimir(){
        if (this.first != null) {
            Nodo<T> temp = first;
            System.out.print("Lista: ");
            while (temp.getNext()!=null) {
                System.out.print(temp.getValue() + " ");
                temp = temp.getNext();
            }
            System.out.println(temp.getValue() + " ");
        } else {
            System.out.println("Lista vacía");
        }
    }
}
