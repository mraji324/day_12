
import java.util.*;
class Difference
{
    public static void main(String[] args)
    {
        int arr1[]={34,65,89,36,7};
        int arr2[]={3,43,89,67,90};
        Set<Integer>a=new Integer<>();
        Set<Integer>b=new Integer<>();
        for(int s:arr1)
        a.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer>d=new HashSet<>(a);
        d.removeAll(b);
        System.out.println(d);
    }
}