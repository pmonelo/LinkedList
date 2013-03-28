public class LList<T> implements List<T>
{
    private Node<T> head;
    private int size;
    public LList()
    {
        head = null;
        size = 0;
    }
    
    public void add(T value)
    {
        if(head== null)
        {
            Node<T> n = new Node(value,null);
            head=n;
            size++;
        }
        else 
        {
            Node<T> n = new Node(value, head);
            head=n;
            size++;
        }
    }
    
    public int size()
    {
        return this.size;
    }
    
    public T get(int index)
    {
        Node<T> n= head;
         
        if(index<=size && index>=0)
        {
            for(int i=0; i<index; i++)
            {
            n= n.getNext();
            }
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return  n.getValue();
        
    }
    
    public void set(int x, T value)
    {
        if(x<=size || x>=0)
        {
            Node<T> c = head;
            for(int i=0; i<x; i++)
            {
                c=c.getNext();
            }
            Node<T> n= new Node(value, c.getNext());
            c.setNext(n);
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException(x);
        }        
    }

    public void clear()
    {
        Node<T> n = new Node(null, head);
        head=n;
        this.size=0;
    }
    
    public String toString()
    {
        Node<T> n= head;
        String s= "";
        while(n!= null)
        {
               if(n.getNext()!=null)
               {
                   s+= n.getValue()+",";
                   n= n.getNext();
               }
               else 
               {
                   s+= n.getValue()+"";
                   n= n.getNext();
               }
        }
        return s;
    }
    
    public void insert(T value,int index)
    {
        Node<T> c = head;
        if(index>0)
        {
            for(int i=0; i<index-1; i++)
            {
                c=c.getNext();
            }
            Node<T> n= new Node(value, c.getNext());
            c.setNext(n);
            size++;
        }
        else
        {
            Node<T> n= new Node(value,head);
            head=n;
            size++;
        }
    }
    
    public int indexOf(T value)
    {
        Node<T> c=head;
        int i=0;
        while(!c.getValue().equals( value))
        {
            c=c.getNext();
            i++;
        }
        return i;
    }
    
    public void remove()
    {
        this.delete(0);
        size--;
    }
    
    public void delete(int index)
    {        
        Node<T> n= head;
        if(index==0)
        {
            head=n.getNext();
            size--;
        }
        else if(index>0 && index<size)
        {
            for(int i=0; i<index-1; i++)
            {
                n=n.getNext();
            }
            n.setNext(n.getNext().getNext());
            size--;
        }
        else if(index==size)
        {
            for(int i=0; i<index-1; i++)
            {
                n=n.getNext();
            }
            n.setNext(null);
            size--;
        }
        else
        {
             throw new ArrayIndexOutOfBoundsException();
        }
    }
            
    public void addFirst(T value)
    {
        Node<T> c = new Node(value, head);
        head=c;
        size++;
    }
    
    public void addLast(T value)
    {
        Node<T> c = head;
        for(int i=0; i<size-1; i++)
        {
            c=c.getNext();
        }
        Node<T> n = new Node(value,null);
        c.setNext(n);
        size++;
    }  
    
    public void removeLast()
    {
        this.delete(size-1);
        size--;
    }
    
    public void removeFirst()
    {
        this.remove();    
    }
}
            
    
        
       

    