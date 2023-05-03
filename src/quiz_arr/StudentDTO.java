package quiz_arr;

public class StudentDTO {
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
