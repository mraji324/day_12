import java.util.*;
  class Hashmapforeach
{
    public static void main(String[] args)
    {
      HashMap<String,String>a=new HashMap<>();
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
