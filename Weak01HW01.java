import java.util.Calendar;
import java.util.Scanner;

public class Weak01HW01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		String name, si, gu, dong, university, department;
		int year, month, nyear, thismonth, thisyear, grade, age;
		thisyear = cal.get(Calendar.YEAR);
		thismonth = cal.get(Calendar.MONTH);
		
		System.out.print("�̸� : ");
		name = in.next();
		System.out.print("���� : ");
		year = in.nextInt();
		System.out.print("���� : ");
		month = in.nextInt();
		System.out.print("�ּ�\n");
		System.out.print(" �� : ");
		si = in.next();
		System.out.print(" �� : ");
		gu = in.next();
		System.out.print(" �� : ");
		dong = in.next();
		System.out.print("���б� : ");
		university = in.next();
		System.out.print("�а� : ");
		department = in.next();
		System.out.print("���г⵵ : ");
		nyear = in.nextInt();
		
		grade = thisyear - nyear + 1;
		
		if (thismonth >= month) age = thisyear - year - 2;
		else age = thisyear - year - 1;
		
		System.out.printf("%s(��,%d��) �л��� %s %s�� %d�г����� �������̴�.\n", name, age, university, department, grade);
		System.out.printf("\"" + si + gu + dong + "\"" + "�� ���� ���̴�.");
	}

}
