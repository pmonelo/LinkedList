public class FancyArray<T> implements List<T>
{
    private Object[] arr;
    public int size;
    
    public FancyArray()
    {
        this.clear();
    }
    
    public T get(int index)
    {
       if(index <= size && index >=0)
       {
           return (T) arr[index];
        }
       else
       {
           throw new ArrayIndexOutOfBoundsException(index);
       }
    }
    
    public int size()
    {
        return size; 
    }
    
    public int arrLength()
    {
        return arr.length;
    }
    
    public void add(T value)
    {
        if (this.size() < arr.length)
        {
            arr[size]= value;
        }
        else 
        {
            Object[]temp = new Object[size + size%10 + 10];
            for (int i=0; i<size; i++)
            {
                temp[i]= arr[i];
            }
            temp[size] = value;
            arr=temp;
        }
        size++;
    }
    
        public void addFirst(T value)
    {
        if (size <= 0)
        {
            Object[]temp = new Object[size];
            for (int i=0; i<size; i++)
            {
                temp[i]= arr[i+1];
            }
            arr[0]= value;
            arr=temp;
            
        }
        else 
        {
            Object[]temp = new Object[size + size/10 + 10];
            for (int i=0; i<size; i++)
            {
                temp[i]= arr[i+1];
            }
            arr[0]= value;
            arr=temp;
        }
        size++;
    }
    
    public void addLast(T value)
    {
        this.add(value);
    }
    
    public void set(int index, T value)
    {
        if ( index <= size || index >=0)
        {
            Object[]temp = new Object[size];
            temp= arr;
            temp[index]= value;
            arr=temp;
        }
        else 
        {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }
    
     public void clear()
    {
        arr = new Object[20];
        size = 0;
    }
    
    public String toString()
    { 
        String x= "";
        for (int i=0; i<size; i++)
        {
           if(i==size-1)
           {
               x=x+this.get(i)+"";
            }
           else
           {
               x= x+this.get(i)+","+"";  
            }
        }
        return ""+x;
    }
    
    public void insert(T value,int index)
    {
        if(index < arr.length && index<=size)
        {
            int i=0;
            Object[]temp= new Object[this.arrLength()];
            while(i<index)
            {
                temp[i]=arr[i];
                i++;
            }
            temp[index]= value; 
            for(i=index+1;i<=size; i++)
            {
                temp[i]=arr[i-1];
            }
            arr[size]=temp[size];
            arr=temp;
            size++;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }
    
    public int indexOf(T value)
    {
        for(int i=0; i<size;i++)
        {
            if(value==this.get(i))
            {
                return i;
            }
 
         }
        return -1;
        }
    
    public void remove()
    { 
        if (this.size() >= 0)
        {
//                 Object[]temp = new Object[size-1];
//                 for (int i=0; i<size; i++)
//                 {
//                     temp[i]= arr[i];
//                 }
//                 arr=temp;
                size--;
        }
        else 
        {
            throw new ArrayIndexOutOfBoundsException();
            
        }
    }
    
    public void removeFirst()
    {
        if (size <= 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else 
        {
            Object[]temp = new Object[size];
            for (int i=0; i<size; i++)
            {
                temp[i]= arr[i+1];
            }
            arr[0]= 0;
            arr=temp;
        }
        size++;
    }
    
     public void removeLast()
    {
        this.remove();
    }
    
    public void delete(int index)
    {
        this.remove();
    }
    
    }
                

    
   
    
        