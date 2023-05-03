package day15;

import java.util.ArrayList;
import java.util.Scanner;

class Member03 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class MainClass03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Member03> list = new ArrayList<>();
		String name;
		int num;

		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 모든내용 출력");
			num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();

				Member03 mem = new Member03();
				mem.setName(name);

				list.add(mem);

				System.out.println("저장 완료");
				break;
			case 2:
				System.out.println("모든 회원 보기");
				if (list.isEmpty()) {
					System.out.println("등록된 회원이 없습니다");
				} else {
					for (Member03 m : list) {
						System.out.println(m.getName());
					}
				}

				break;

			}
		}

	}
}
