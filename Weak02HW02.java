import java.util.Scanner;

public class Weak02HW02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int max, mid, min, tmp;
		
		while(in.hasNext()) {
			min = in.nextInt();
			mid = in.nextInt();
			max = in.nextInt();
			
			if (min > mid) {
				tmp = min;
				min = mid;
				mid = tmp;
			}
			if (mid > max) {
				tmp = mid;
				mid = max;
				max = tmp;
			}
			if (min > mid) {
				tmp = min;
				min = mid;
				mid = tmp;
			} 			
			if (min < mid && mid < max) System.out.printf("%d < %d < %d\n", min, mid, max);
			else if (min < mid && mid == max) System.out.printf("%d < %d = %d\n", min, mid, max);
			else if (min == mid && mid < max) System.out.printf("%d = %d < %d\n", min, mid, max);
			else System.out.printf("%d = %d = %d\n", min, mid, max);
		}
		
		
	}

}
