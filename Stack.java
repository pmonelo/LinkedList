public class Stack<T> 
{
    private List<T> stack;
    public Stack()
    {
        stack = new FancyArray<T>();
    }
    
    public T pop()
    {
        if(!isEmpty())
        {
            T t=stack.get(0);
            stack.remove();
            return t;
        }
        else
        {
            throw new java.util.EmptyStackException();
        }
    }
    
    public void push( T value)
    {
        stack.add(value);
    }
    
    public T peek()
    {
        if(!isEmpty())
        {
            return stack.get(0);
        }
        else
        {
            throw new java.util.EmptyStackException();
        }
    }
    
    public boolean isEmpty()
    {
        if(stack.size()==0)
        {
            return true;
        }
        else
    
        {
            return false;
        }
    }
    
}