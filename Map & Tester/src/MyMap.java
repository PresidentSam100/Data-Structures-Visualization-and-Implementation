import java.util.*;

public class MyMap <K, V> implements MapInterface <K, V>
{
    /*
    Sam Lu
    Mr. Tully
    Period 4
    */

    private ArrayList <MapEntry <K, V>> map;

    public MyMap()
    {
        map = new ArrayList <MapEntry <K, V>> ();
    }

    @Override
    public void clear()
    {
        map.clear();
    }

    @Override
    public boolean containsKey(K key)
    {
        for (MapEntry <K, V> mapEntry : map)
        {
            if (mapEntry.getKey().equals(key))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(V value)
    {
        for (MapEntry <K, V> mapEntry : map)
        {
            if (mapEntry.getValue().equals(value))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public SetInterface <MapEntry <K, V>> entrySet()
    {
        SetInterface <MapEntry <K, V>> set = new MySet <MapEntry <K, V>> ();
        for (MapEntry <K, V> mapEntry : map)
        {
            set.add(mapEntry);
        }
        return set;
    }

    @Override
    public V get(K o)
    {
        for (MapEntry <K, V> mapEntry : map)
        {
            if (mapEntry.getKey().equals(o))
            {
                return mapEntry.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value)
    {
        if (!containsKey(key))
        {
            map.add(new MapEntry<>(key, value));
        }
        else if (containsKey(key))
        {
            int index = -1;
            for (int i = 0; i < map.size(); i++)
            {
                if (map.get(i).getKey().equals(key))
                {
                    index = i;
                }
            }
            if (index != -1)
            {
                V val = map.get(index).getValue();
                map.get(index).setValue(value);
                return val;
            }
        }
        return null;
    }

    @Override
    public V remove(K key)
    {
        for (int i = 0; i < map.size(); i++)
        {
            MapEntry <K, V> mapEntry = map.get(i);
            if (mapEntry.getKey().equals(key))
            {
                V value = map.get(i).getValue();
                map.remove(i);
                return value;
            }
        }
        return null;
    }

    @Override
    public int size()
    {
        return map.size();
    }

    @Override
    public SetInterface <K> keySet()
    {
        SetInterface <K> keys = new MySet <K> ();
        for (MapEntry <K, V> mapEntry : map)
        {
            keys.add(mapEntry.getKey());
        }
        return keys;
    }

    @Override
    public ArrayList <V> values()
    {
        ArrayList <V> values = new ArrayList <V> ();
        for (MapEntry <K, V> mapEntry : map)
        {
            values.add(mapEntry.getValue());
        }
        return values;
    }

    @Override
    public boolean isEmpty()
    {
        return map.isEmpty();
    }
}