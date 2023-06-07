package Entities;

public interface MyTreeInt<K, T> {
    T find(K key);

    void insert (K key, T data);

    void delete (K key);



}
