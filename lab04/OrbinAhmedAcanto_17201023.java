package 17201023;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class lab04 
{
    
    public static String constructor = "";
    
    public static void main(String[] args) throws FileNotFoundException 
    {
       
       File text = new File("E:/Acanto/input.txt");
       Scanner sc = new Scanner(text);
       
       Stack<String> stack = new Stack<String>();
       
       while(sc.hasNext())
       {
            String method = "";
            String retrn = "";
            String stext = sc.next();
            stack.push(stext);
           
            if(stext.equals("class"))
            {
                constructor = stack.push(sc.next());
                stack.push(sc.next());
            }
            else 
            {
                if(stack.peek().equals("{"))
                {
                    stack.pop();
                    String s = stack.pop();
                    method = " " + s + method;
                    while(!checkMethod(s) && !s.contains(constructor))
                    {
                        s = stack.pop();
                        method = " " + s + method;
                    }
                    retrn = stack.pop();

                    System.out.println(" Method:"+method + "\n Return Type: " + retrn + "\n");
                }
            }
       }
    }
    public static boolean checkMethod(String stext)
    {
        for(int i=0; i<stext.length(); i++)
        {
            if(stext.charAt(i) == '(')
            {
                return true;
            }
        }
        return false;
    }
    
}