public interface Lista <Tipo> {
    void add(Tipo value);
    void remove(int position) throws NoExiste;
    Tipo get(int position) throws NoExiste;
    int size();
}
