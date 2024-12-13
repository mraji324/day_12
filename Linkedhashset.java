import java.util.*;
  class Linkedhashset
{
    public static void main(String[] args)
    {
      LinkedHashSet<Integer>a=new LinkedHashSet<>();
      a.add("hello");
      a.add("i am");
      a.add("student");
      a.add("rajesh");
      System.out.println(a);
      a.remove("rajesh");
      System.out.println(a);
      a.clear();
      System.out.println(a);

    }
}