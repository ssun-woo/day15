package day15;

import java.util.ArrayList;

class Member{
	private String name, addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

public class MainClass02 {
	public static void main(String[] args) {
		
		
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member();
		mem1.setName("홍길동");
		mem1.setAddr("산골짜기");
		
		list.add(mem1);
		
		Member mem01 = list.get(0);
		System.out.println(mem01.getAddr());
		System.out.println(mem01.getName());
		
		
		Member mem2 = new Member();
		mem2.setName("22홍길동");
		mem2.setAddr("22산골짜기");
		
		list.add(mem2);
		
		System.out.println("========================");
			
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println(m.getName());
			System.out.println(m.getAddr());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAddr());
			System.out.println("-------------");
			// 변수에 넣어서 사용해도되고 직접 작성해도된다
		}
		
//		ArrayList<String> str = new ArrayList<>();
//		str.add("aaa");
//		str.add("bbb");
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		System.out.println("===================");
		for(Member mem : list) {
			System.out.println(mem.getAddr());
			System.out.println(mem.getName());
			System.out.println("---------------");
		}
		
	}
}









































