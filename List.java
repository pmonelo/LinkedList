public interface List<T>
{
    public int size();
    public String toString();
    public void add(T value);
    public void delete(int index);
    public T get(int index);
    public void set(int x, T value);
    public void remove();
    public void insert(T value,int index);
    public void clear();
    public int indexOf(T value);
    public void addFirst(T value);
    public void addLast(T value);
    public void removeFirst();
    public void removeLast();
}