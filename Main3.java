import java.util.*;
public class Main3
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int a, b, c, d;
      System.out.print ("Enter four numbers\t");
      a = sc.nextInt ();
      b = sc.nextInt ();
      c = sc.nextInt ();
      d = sc.nextInt ();
    int t1, t2, lar;
      t1 = (a > b ? a : b);
      t2 = (c > d ? c : d);
      lar = (t1 > t2 ? t1 : t2);
      System.out.println ("Highest of four numbers =" + lar);
  }
}


OUTPUT:
Enter four numbers      66 99 56 45
Highest of four numbers =99