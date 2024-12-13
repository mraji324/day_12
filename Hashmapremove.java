import java.util.*;
  class Hashmapremove
{
    public static void main(String[] args)
    {
      HashMap<String,String>a=new HashMap<>();
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
