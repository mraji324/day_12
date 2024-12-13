import java.util.*;
  class Treemapremove
{
    public static void main(String[] args)
    {
      TreeMap<String,String>a=new TreeMap<>();
      a.put("s.no","01");
      a.put("name","hindu");
      a.put("place","Chennai");
      System.out.println(a);
      a.remove("name");
      System.out.println(a);
      a.clear();
      System.out.println(a);
    }
}