public class Stack<T> 
{
    private List<T> stack;
    public Stack()
    {
        stack = new FancyArray<T>();
    }
    
    public T pop()
    {
        T t=stack.get(0);
        stack.remove();
        return t;
    }
    
    public void push( T value)
    {
        stack.add(value);
    }
    
    public T peek()
    {
            return stack.get(0);
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