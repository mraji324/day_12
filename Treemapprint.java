import java.util.*;
  class Treemapprint
{
    public static void main(String[] args)
    {
      TreeMap<String,String>a=new TreeMap<>();
      a.put("s.no","01");
      a.put("name","hindu");
      a.put("place","Chennai");
      System.out.println(a);
      if(a.containskey("name"))
      {
        String d=a.get("name");
        System.out.println(d);
      }
    }
}
