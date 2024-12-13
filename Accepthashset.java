import java.util.*;
  class Accepthashset
{
    public static void main(String[] args)
    {
      HashSet<String>a=new HashSet<>();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        String s=sc.next();
        a.add(s);
      }
      System.out.println(a);
    }
}