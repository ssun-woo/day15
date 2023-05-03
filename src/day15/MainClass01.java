package day15;

import java.util.ArrayList;

/*
 wrapper class
  - 일반 8대 기본 자료형을 클래스 타입으로 변경한 것
  - int, char, double...
  - Integer, Character, Double...
  - 어떤 클래스를 만들었을때 가변적으로 사용할 때가 있는데 그 때 사용하기 위함
 */

class A01<E> {
	// <E>를 추가해서 원하는 변수형을 넣을 수 있음
	public void sumFunc(E n1, E n2) {
		System.out.println(n1 + "," + n2);
	}
	
//	public void sumFunc(String n1, String n2) {
//		System.out.println(n1 + "," + n2);
//	}
	// 메소드 오버로딩(같은 메소드 이름이지만 매개변수의 타입이 다름)
	
	public void test(int k, String b) {
		
	}
	
	// 객체를 받을때 제네릭으로 받으면 어떠한 타입을 받아도된다
}

public class MainClass01 {
	public static void main(String[] args) {
		
		// ArrayList<int> arr;   // <>안에는 클래스 타입이 들어가야한다
		ArrayList<Integer> arr;
		
		// ArrayList<E>
		// 자동완성에 E가 들어오는 것들은 클래스 타입을 써야하며
		// T가 들어오는건 type으로 int같은것들이 들어올 수 있다
		
		A01<Integer> a = new A01<>();
		a.sumFunc(10, 20);
		// a.sumFunc("aaa", "bbb");
		
		A01<String> a1 = new A01<>();
		a1.sumFunc("aaa", "bbb");
		
		
	}
}























