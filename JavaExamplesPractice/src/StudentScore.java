import java.util.ArrayList;
import java.util.Scanner;

class Student { //클래스 멤버 변수 : 이름, 국어, 영어, 수학, 평균, 학점
	String name, grade;
	int kor, eng, mat;
	double avg;

	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public double getAvg() {
		return (kor + eng + mat) / (double)3;
	}
	
	public String getGrade() {
		if (getAvg() >= 90)
			return "A";
		else if (getAvg() >= 80)
			return "B";
		else if (getAvg() >= 70)
			return "C";
		else if (getAvg() >= 60)
			return "D";
		else
			return "F";
	}

	@Override
	public String toString() {
		return name + " / " + getAvg() + " / " + getGrade() + "학점";
	}
}

public class StudentScore {
	public static void main(String[] args) {
		ArrayList <Student> p = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("===" + i + "번 학생 정보===");
			System.out.print("이름 : ");
			String name = scanner.next();
			System.out.print("국어 점수 : ");
			int kor = scanner.nextInt();
			System.out.print("영어 점수 : ");
			int eng = scanner.nextInt();
			System.out.print("수학 점수 : ");
			int mat = scanner.nextInt();
			
			p.add(new Student(name, kor, eng, mat));
		}
		System.out.println("===결과===");
		for(Student list : p) {
			System.out.println(list);
		}
	}
}
