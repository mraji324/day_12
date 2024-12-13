import java.util.*;
  class Printlinkedhashset
{
    public static void main(String[] args)
    {
      LinkedHashSet<Integer>a=new LinkedHashSet<>();
      a.add("hello");
      a.add("i am");
      a.add("student");
      a.add("rajesh");
      for(String s:a)
      {
      System.out.println(s+" ");
      }
    }
}