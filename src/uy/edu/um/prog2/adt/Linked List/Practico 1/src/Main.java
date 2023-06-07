public class Main {

    public static void main(String[] args) throws NoExiste {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(12);
        lista.add(13);
        lista.add(14);
        System.out.println(lista.size());
        System.out.println(lista.get(0));
        lista.remove(0);
        System.out.println(lista.get(0));
        System.out.println(lista.estaEnLista(12));
        lista.addFirst(1);
        System.out.println(lista.get(0));

    }

}