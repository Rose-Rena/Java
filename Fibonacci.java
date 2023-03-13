import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
  private static int calc_fib(int n) {
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(0);
	if(n >= 1) {
	arr.add(1);
	}
	for(int i = 2; i <= n; i++) {
		arr.add(arr.get(i-1)+arr.get(i-2));
	}
    return arr.get(n);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    System.out.print(calc_fib(n));
  }
}