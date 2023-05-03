package quiz_arr;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentServiceImpl ss = new StudentServiceImpl();

		while (true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 검색");
			System.out.println("3. 모든학생보기");
			System.out.println("4. 종료");
			System.out.print(">>>>>");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-------");
				System.out.println("학생등록");
				System.out.println("-------");
				ss.inputStudent();
				break;
			case 2:
				System.out.println("-------");
				System.out.println("학생검색");
				System.out.println("-------");
				ss.searchStudent();
				break;
			case 3:
				System.out.println("----------");
				System.out.println("모든 학생보기");
				System.out.println("----------");
				ss.allStudent();
				break;
			case 4:
				System.out.println("종료합니다");
				System.exit(1);
				break;
			}

		}
	}
}