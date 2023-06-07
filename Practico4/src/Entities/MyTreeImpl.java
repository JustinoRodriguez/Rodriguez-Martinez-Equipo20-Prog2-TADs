package Entities;

import java.util.ArrayList;
import java.util.List;

public class MyTreeImpl<K extends Comparable<K>, T> implements MyTreeInt<K, T>{

    private Nodo<K, T> root;
    private int tamanio;

    public Nodo<K, T> getRoot() {
        return root;
    }

    public void setRoot(Nodo<K, T> root) {
        this.root = root;
    }

    public MyTreeImpl() {
        this.root = null;
        this.tamanio = 0;
    }

    @Override
    public T find(K key) {
        if (root==null){
            return null;
        }
        Nodo<K, T> temp = new Nodo<K, T>(key, null);
        return root.search(temp);
    }

    @Override
    public void insert(K key, T data) {
        Nodo nuevoNodo = new Nodo(key, data);
        if (root == null) {
            root = nuevoNodo;
        } else {
            root.add(key, data);
        }
        tamanio++;
    }

    @Override
    public void delete(K key) {
        Nodo<K,T> temp = new Nodo<>(key, find(key));
        if(temp.getLeftChild()==null && temp.getLeftChild()==null){
            Nodo<K,T> padre = getPadre(root, temp);
            if(padre.compareTo(temp)>0){
                padre.setLeftChild(null);
            }
            else{
                padre.setRightChild(null);
            }
            tamanio--;
        }

        if(temp.getLeftChild() != null && temp.getRightChild() == null){
            Nodo<K,T> padre = getPadre(root, temp);
            if(padre.compareTo(temp)>0){
                padre.setLeftChild(temp.getLeftChild());
            }
            else{
                padre.setRightChild(temp.getLeftChild());
            }
            tamanio--;
        }

        if(temp.getLeftChild() == null && temp.getRightChild() != null){
            Nodo<K,T> padre = getPadre(root, temp);
            if(padre.compareTo(temp)>0){
                padre.setLeftChild(temp.getRightChild());
            }
            else{
                padre.setRightChild(temp.getRightChild());
            }
            tamanio--;
        }


        if(temp.getLeftChild()!=null && temp.getRightChild()!=null){
            Nodo<K,T> padre = getPadre(root, temp);
            if(padre.compareTo(temp)>0){
                Nodo<K,T> nodoDerecho = temp.getRightChild();
                padre.setLeftChild(nodoDerecho);
                nodoDerecho.setLeftChild(temp.getLeftChild());


            }
            else{
                Nodo<K,T> nodoDerecho = temp.getRightChild();
                padre.setRightChild(nodoDerecho);
                nodoDerecho.setLeftChild(temp.getLeftChild());

            }
            tamanio--;
        }
    }

    public Nodo<K,T> getPadre(Nodo<K,T> current,Nodo<K,T> nodoHijo){
        if(current.getLeftChild().compareTo(nodoHijo) == 0 || current.getRightChild().compareTo(nodoHijo) == 0){
            return current;
        }
        if(current.compareTo(nodoHijo) > 0){
            current = current.getLeftChild();
            return(getPadre(current, nodoHijo));
        }
        if(current.compareTo(nodoHijo) < 0){
            current = current.getRightChild();
            return(getPadre(current, nodoHijo));
        }
        return null;
    }

    public int size(){
        return tamanio;
    }

    public int countLeaf() {
        return root.countHojas();
    }

    public int countComplete(){
        return root.countComplete();
    }

    public List preOrder(){
        List lista = new ArrayList();
        root.hacerPreOrder(lista);
        return lista;
    }

    public List postOrder(){
        List lista = new ArrayList();
        root.hacerPostOrder(lista);
        return lista;
    }

    public List inOrder(){
        List lista = new ArrayList();
        root.hacerInOrder(lista);
        return lista;
    }
}
