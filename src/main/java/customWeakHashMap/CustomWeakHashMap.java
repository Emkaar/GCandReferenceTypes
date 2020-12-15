package customWeakHashMap;

import java.util.Arrays;

public class CustomWeakHashMap<K, V>{

    private int size;
    private WeakNode<K, V>[] nodes;
    public CustomWeakHashMap(){
        size = 100;
        this.nodes = new WeakNode[100];
    }

    public CustomWeakHashMap(int size){
        this.size = size;
        this.nodes = new WeakNode[size];
    }

    public int ownHashCode(K key){
        return Math.abs(key.hashCode() % size);
    }

    public void insert(K key, V value) {
        if(nodes[ownHashCode(key)] == null){
            nodes[ownHashCode(key)] = new WeakNode(key, value, 1);
        }else{
            nodes[ownHashCode(key)].insert(key, value);
        }
    }

    @Override
    public String toString() {
        return "CustomWeakHashMap{" +
                "nodes=" + Arrays.toString(nodes) +
                '}';
    }
}
