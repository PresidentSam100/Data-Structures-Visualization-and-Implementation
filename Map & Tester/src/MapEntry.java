public class MapEntry <K, V>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private K key;
    private V value;

    public MapEntry(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

    public void setKey(K key)
    {
        this.key = key;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

    public boolean equals(Object o)
    {
        if(o instanceof MapEntry)
        {
            MapEntry <K, V> t = (MapEntry<K, V>) o;
            return getKey().equals(t.getKey());
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "(" + key + " - " + value + ")";
    }
}