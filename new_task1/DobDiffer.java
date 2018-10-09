
package newTask1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class DobDiffer {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date in mm-dd-yyyy format");
		String s2 = s.next();
		String[] dobDate = s2.split("-");
		LocalDate CurDate = LocalDate.now();
		LocalDate birthday = LocalDate.of(Integer.parseInt(dobDate[2]), Integer.parseInt(dobDate[1]),
		Integer.parseInt(dobDate[0]));
		Period p = Period.between(birthday, CurDate);
		System.out.println(p.getYears() + " years "+p.getMonths() + " months "+p.getDays()+ " days");

	}
}
