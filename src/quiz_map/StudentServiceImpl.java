package quiz_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
	HashMap<Integer, Student> map = new HashMap<>();
	Collection<Student> col = map.values();
	Scanner scan = new Scanner(System.in);
	String name, grade;
	int id, kor, eng, math;
	double avg;

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
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		if (map.containsKey(id)) {
			System.out.println("이미 등록된 학생입니다");
		} else {
			stu.setId(id);
			stu.setName(name);
			stu.setKor(kor);
			stu.setEng(eng);
			stu.setMath(math);
			avg = (kor + eng + math) / 3.0;
			stu.setGrade(grade);
			map.put(id, stu);
		}
	}

	@Override
	public void searchStudent() {

		System.out.print("찾을 학생의 학번을 입력하세요 : ");
		int findId = scan.nextInt();

		if (map.isEmpty()) {
			System.out.println("현재 등록된 학생이 없습니다");
		} else {
			for (int i = 0; i < map.size(); i++) {
				if (map.containsKey(findId)) {
					System.out.println("-----------------------------");
					System.out.println("학번 : " + map.get(findId).getId());
					System.out.println("이름 : " + map.get(findId).getName());
					System.out.println("국어 : " + map.get(findId).getKor());
					System.out.println("영어 : " + map.get(findId).getEng());
					System.out.println("수학 : " + map.get(findId).getMath());
					System.out.println("등급 : " + map.get(findId).getGrade());
					System.out.println("-----------------------------");
					break;
				} else {
					System.out.println("찾는 학생이 없습니다");
					break;
				}

			}
		}
	}

	@Override
	public void allStudent() {

		if (map.isEmpty()) {
			System.out.println("현재 등록된 학생이 없습니다");
		} else {
			for (Student s : col) {
				System.out.println("----------------------");
				System.out.println("학번 : " + s.getId());
				System.out.println("이름 : " + s.getName());
				System.out.println("국어 : " + s.getKor());
				System.out.println("영어 : " + s.getEng());
				System.out.println("수학 : " + s.getMath());
				System.out.println("등급 : " + s.getGrade());
				System.out.println("----------------------");
			}

		}

	}

	public HashMap<Integer, Student> getMap() {
		return map;
	}

}
