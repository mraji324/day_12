import java.util.*;
  class Iterator
{
    public static void main(String[] args)
    {
      LinkedHashSet<Integer>a=new LinkedHashSet<>();
      a.add("hello");
      a.add("i am");
      a.add("student");
      a.add("rajesh");
      Iterator itr=a.iterator();
      while(itr.hasnext())
      {
      System.out.print(itr.next()+" ");
      }
    }
}