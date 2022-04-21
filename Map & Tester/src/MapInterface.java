import java.util.*;

public interface MapInterface <K, V>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    public void clear();

    public boolean containsKey(K key);

    public boolean containsValue(V value);

    public SetInterface <MapEntry <K, V>> entrySet();

    public V get(K o);

    public V put(K key, V value);

    public V remove(K key);

    public int size();

    public SetInterface <K> keySet();

    public ArrayList <V> values();

    public boolean isEmpty();
}