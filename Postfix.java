public class Postfix<T>
{
    String token; 
    Stack<Double> s = new Stack<Double>();
        public double eval(List<String> input)
        {
            for(int i=0; i<input.size(); i++)
            {
                token=""+input.get(i);
                if(token.equals("+"))
                {
                    double a = s.pop();
                    double b = s.pop();
                    double c = b+a;
                    s.push(c);
                }
                else if(token.equals("-"))
                {
                    double a = s.pop();
                    double b = s.pop();
                    double c = b-a;
                    s.push(c);
                }
                else if(token.equals("*"))
                {
                    double a = s.pop();
                    double b = s.pop();
                    double c = b*a;
                    s.push(c);
                }
                else if(token.equals("/"))
                {
                    double a = s.pop();
                    double b = s.pop();
                    double c = b/a;
                    s.push(c);
                }
                else
                {
                    double value = Double.parseDouble(token);
                    s.push(value);
                }
            }
            return s.pop();
        }
}