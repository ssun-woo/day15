package quiz_arr;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	private String grade;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	int getKor() {
		return kor;
	}

	void setKor(int kor) {
		this.kor = kor;
	}

	int getEng() {
		return eng;
	}

	void setEng(int eng) {
		this.eng = eng;
	}

	int getMath() {
		return math;
	}

	void setMath(int math) {
		this.math = math;
	}

	String getGrade() {
		return grade;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

}

public class MainClass01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		String name, grade;
		int id, kor, eng, math;
		double avg;

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

				System.out.print("학번을 입력하세요 : ");
				id = scan.nextInt();

				System.out.print("이름을 입력하세요 : ");
				name = scan.next();

				System.out.print("국어 점수를 입력하세요 : ");
				kor = scan.nextInt();

				System.out.print("영어 점수를 입력하세요 : ");
				eng = scan.nextInt();

				System.out.print("수학 점수를 입력하세요 : ");
				math = scan.nextInt();
				Student stu = new Student();
				stu.setId(id);
				stu.setName(name);
				stu.setKor(kor);
				stu.setEng(eng);
				stu.setMath(math);

				avg = (kor + eng + math) / 3.0;
				
				if (avg >= 90) {
					grade = "A";
				} else if (avg >= 80) {
					grade = "B";
				} else if (avg >= 70) {
					grade = "C";
				} else {
					grade = "F";
				}
				stu.setGrade(grade);

				list.add(stu);

				System.out.println("등록됐습니다");
				break;
			case 2:
				System.out.println("-------");
				System.out.println("학생검색");
				System.out.println("-------");

				System.out.print("찾을 학생의 학번을 입력하세요 : ");
				int findId = scan.nextInt();

				if (list.isEmpty()) {
					System.out.println("현재 등록된 학생이 없습니다");
				} else {
					for (int i = 0; i < list.size(); i++) {
						if (findId == list.get(i).getId()) {
							System.out.println("학번 : " + list.get(i).getId());
							System.out.println("이름 : " + list.get(i).getName());
							System.out.println("국어 : " + list.get(i).getKor());
							System.out.println("영어 : " + list.get(i).getEng());
							System.out.println("수학 : " + list.get(i).getMath());
							System.out.println("등급 : " + list.get(i).getGrade());
						} else {
							System.out.println("찾는 학생이 없습니다");
						}
					}
				}
				break;
			case 3:
				System.out.println("----------");
				System.out.println("모든 학생보기");
				System.out.println("----------");

				if (list.isEmpty()) {
					System.out.println("현재 등록된 학생이 없습니다");
				} else {
					for (Student s : list) {
						System.out.println("------------------");
						System.out.println("학번 : " + s.getId());
						System.out.println("이름 : " + s.getName());
						System.out.println("국어 : " + s.getKor());
						System.out.println("영어 : " + s.getEng());
						System.out.println("수학 : " + s.getMath());
						System.out.println("등급 : " + s.getGrade());
						System.out.println("------------------");
					}
				}
				break;
			case 4:
				System.out.println("종료합니다");
				System.exit(1);
				break;
			}

		}

	}

}
