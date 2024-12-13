import java.util.*;
  class Treemapforeach
{
    public static void main(String[] args)
    {
      TreeMap<String,String>a=new TreeMap<>();
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        String s=sc.next();
        String s1=sc.next();
        a.put(s,s1);
      }
      for(String s:a.KeySet())
      {
        System.out.println(s+":"+a.get(s));
      }
    }
}
