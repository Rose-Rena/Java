import java.util.*;

//use long division
public class LCM {
  private static long lcm_naive(int a, int b) {
    long lcm = 1;
    for (long m = 1; m <= a && m <= b; m++){
      if (a % m == 0 && b % m == 0){
          lcm *= m;
          a/=m;
          b/=m;
          m = 1;
        //   System.out.println("current a = " + a + "\ncurrent b = " + b);
        }
    }
    // System.out.println("a:" + a);
    // System.out.println("b:" + b);
    return lcm*a*b;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
