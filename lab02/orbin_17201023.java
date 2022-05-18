import java.util.Scanner;
public class orbin_17201023 
{
  public static boolean website=true;
  public static boolean email=true;
  public static void main(String[] args){
    System.out.println("Please give me a number: ");
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
      String st=sc.next();
      if(checkValid(st))
      {
        if(checkType(st))
        {
          if(website)
          {
            System.out.println("Web, "+i);
          }
          else if(email)
          {
            System.out.println("Email, "+i);
          }
        }
        else
        {
          System.out.println("Invalid Address");
        }
      }
      else
      {
        System.out.println("Invalid Address");
      }
      website=true;
      email=true;
    }
  }
  public static boolean checkValid(String st)
  {
    if(((int)st.charAt(0)>= 65 && (int)st.charAt(0)<= 90) || ((int)st.charAt(0)>= 97 && (int)st.charAt(0)<= 122))
    {
      return true;
    }
    return false;
  }
  public static boolean checkType(String st)
  {
    for(int c=1; c<st.length(); c++)
    {
      if(st.charAt(c)=='.')
      {
        email=false;
        if(((int)st.charAt(c+1)>= 65 && (int)st.charAt(c+1)<= 90) || ((int)st.charAt(c+1)>= 97 && (int)st.charAt(c+1)<= 122))
        {
          
        }
        else
        {
          return false;
        }
        for(int c2=c+2; c2<st.length(); c2++)
        {
          if(st.charAt(c2)=='.')
          {
            for(int c3=c2+1; c3<st.length(); c3++)
            {
              if(((int)st.charAt(c3)>= 65 && (int)st.charAt(c3)<= 90) || ((int)st.charAt(c3)>= 97 && (int)st.charAt(c3)<= 122))
              {
                
              }
              else
              {
                return false;
              }
            }
          }
        }
        return true;
      }
      else if(st.charAt(c)=='@')
      {
        website=false;
        for(int c2=c+1; c2<st.length(); c2++)
        {
          if(((int)st.charAt(c2)>= 65 && (int)st.charAt(c2)<= 90) || ((int)st.charAt(c2)>= 97 && (int)st.charAt(c2)<= 122) || st.charAt(c2)=='.')
          {
            
          }
          else
          {
            return false;
          }
          if(st.charAt(c2)=='.')
          {
            for(int c3=c2+1; c3<st.length(); c3++)
            {
              if(((int)st.charAt(c3)>= 65 && (int)st.charAt(c3)<= 90) || ((int)st.charAt(c3)>= 97 && (int)st.charAt(c3)<= 122))
              {
                
              }
              else
              {
                return false;
              }
            }
            break;
          }
        }
        return true;
      }
    }
    return false;
  }
}