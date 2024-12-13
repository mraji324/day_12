import java.util.*;
  class Treemapmodify
{
    public static void main(String[] args)
    {
      TreeMap<String,String>a=new TreeMap<>();
      a.put("s.no","01");
      a.put("name","hindu");
      a.put("place","Chennai");
      System.out.println(a);
      a.put("s.no","89");
      System.out.println(a);
    }
}