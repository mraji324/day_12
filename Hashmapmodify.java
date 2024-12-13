import java.util.*;
  class Hashmapmodify
{
    public static void main(String[] args)
    {
      HashMap<String,String>a=new HashMap<>();
      a.put("s.no","01");
      a.put("name","hindu");
      a.put("place","Chennai");
      System.out.println(a);
      a.put("s.no","89");
      System.out.println(a);
    }
}
