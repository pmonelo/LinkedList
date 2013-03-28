public class ShuntingYard<T>
{
   private Stack<String> s;
   private Postfix p;
   private FancyArray<String> f;
   
    public ShuntingYard()
    {
        s = new Stack<String>();
        p= new Postfix();
        f=new FancyArray<String>();
    }
    
    String[] split(String delimiter)
    {
        String[] arr = delimiter.split(" ");
        return arr;
    }
    
    public double infixToPostFix(String infix)
    {
        String[] arr= split(infix);

        for(int i=0; i<arr.length; i++)
        {
            if(prec(arr[i])==0)
            {
                f.add(arr[i]);
            }
            else if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/") || arr[i].equals("^"))
            {
                while(!s.isEmpty()&& prec(arr[i]) <= prec(s.peek()))
                {
                    f.add(s.pop());
                }
                s.push(arr[i]);
            }
            else if(arr[i].equals("("))
            {
                s.push(arr[i]);
            }
            else if(arr[i].equals(")"))
            {
                while(s.peek()!= "(")
                {
                    f.add(s.pop());
                }
                String popcatcher= s.pop(); 
            }
            System.out.println(i+" "+s.peek()+" " + f.size());
        }
        while(!s.isEmpty())
        {
            f.add(s.pop());
        }
        return p.eval(f);
    }
    
    public int prec(String str)
    {
        if(str.equals("(") || str.equals(")"))
        {
            return -1;
        }
        else if(str.equals("^"))
        {
            return 3;
        }
        else if(str.equals("*") || str.equals("/"))
        {
            return 2;
        }
        else if(str.equals("+") || str.equals("-"))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    }
    
