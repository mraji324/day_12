import java.util.*;
  class Hashmapprint
{
    public static void main(String[] args)
    {
      HashMap<String,String>a=new HashMap<>();
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
