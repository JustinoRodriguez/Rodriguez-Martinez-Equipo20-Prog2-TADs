public class DoubleLinkedList<Tipo> implements Lista<Tipo> {

    private Node first;

    @Override
    public int size() {
        int count = 0;
        Node temp = this.first;
        while (temp.getNext()!=null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    @Override
    public void add(Tipo value) {

    }

    @Override
    public void remove(int position) throws NoExiste {

    }

    @Override
    public Tipo get(int position) throws NoExiste {
        return null;
    }


}
