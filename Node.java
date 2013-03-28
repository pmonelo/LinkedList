public class Node<T> 
{
    private Object value;
    private Node next;
    
    public Node(T v, Node n)
    {
        value= v;
        next= n;
    }
    
    public T getValue()
    {
        return (T)value;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public void setNext(Node n)
    {
        next=n;
    }
    
    public void setValue(T n)
    {
        value= n;
    }    
}
