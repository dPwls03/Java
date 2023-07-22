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
		
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("생년 : ");
		year = in.nextInt();
		System.out.print("생월 : ");
		month = in.nextInt();
		System.out.print("주소\n");
		System.out.print(" 시 : ");
		si = in.next();
		System.out.print(" 구 : ");
		gu = in.next();
		System.out.print(" 동 : ");
		dong = in.next();
		System.out.print("대학교 : ");
		university = in.next();
		System.out.print("학과 : ");
		department = in.next();
		System.out.print("입학년도 : ");
		nyear = in.nextInt();
		
		grade = thisyear - nyear + 1;
		
		if (thismonth >= month) age = thisyear - year - 2;
		else age = thisyear - year - 1;
		
		System.out.printf("%s(만,%d세) 학생은 %s %s에 %d학년으로 재학중이다.\n", name, age, university, department, grade);
		System.out.printf("\"" + si + gu + dong + "\"" + "에 거주 중이다.");
	}

}
