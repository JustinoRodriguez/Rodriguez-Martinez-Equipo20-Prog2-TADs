import Entities.MyTreeImpl;
public class Main {

    public static void main(String[] args) {
        MyTreeImpl<Integer, String> arbol = new MyTreeImpl<Integer, String>();
        System.out.println(arbol.find(10));
        arbol.insert(10,"*");
        arbol.insert(15, "-");
        arbol.insert(14, "c");
        arbol.insert(16, "d");
        arbol.insert(5, "+");
        arbol.insert(6,"b");
        arbol.insert(4,"a");
        System.out.println(arbol.find(5));
        System.out.println(arbol.size());
        System.out.println(arbol.countLeaf());
        System.out.println(arbol.countComplete());
        System.out.println(arbol.preOrder());
        System.out.println(arbol.postOrder());
        System.out.println(arbol.inOrder());
    }
}