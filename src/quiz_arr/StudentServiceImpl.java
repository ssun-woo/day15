package quiz_arr;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

	Scanner scan = new Scanner(System.in);
	String name, grade;
	int id, kor, eng, math;
	double avg;
	ArrayList<Student> list = new ArrayList<>();

	@Override
	public void inputStudent() {

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
	}

	@Override
	public void searchStudent() {
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
					break;
				}
			}
		}
	}

	@Override
	public void allStudent() {
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

	}

	public ArrayList<Student> getList() {
		return list;
	}

}
