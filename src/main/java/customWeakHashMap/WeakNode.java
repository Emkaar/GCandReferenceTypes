package customWeakHashMap;

import java.lang.ref.WeakReference;

public class WeakNode <K, V>  extends WeakReference<Object> {
    int position;
    K key;
    V value;
    WeakNode next = null;

    public WeakNode(K key, V value, int position) {
        super(key);
        this.position = position;
        this.value = value;
        this.key = key;
    }

    public void insert(K key, V value) {
        if(!hasNext()){
            next = new WeakNode(key, value, this.position + 1);
        } else {
            next.insert(key, value);
        }
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return key + ": " + value + " " + position;
    }
}
