import java.util.Scanner;

public class Weak02HW01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, i = 0, max, min, sum = 0;
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		while(in.hasNext()) {		
			num = in.nextInt();
			sum += num;
			if (max < num) max = num;
			if (min > num) min = num;
			i++;
		}
		System.out.printf("�� �Է� ���� : %d\n", i);
		System.out.printf("���� : %d, ��� : %.3f\n", sum, (float)sum/i);
		System.out.printf("���� ū �� : %d\n", max);
		System.out.printf("���� ���� �� : %d\n", min);
	}

}
