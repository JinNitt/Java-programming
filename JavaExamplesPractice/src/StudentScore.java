import java.util.ArrayList;
import java.util.Scanner;

class Student { //Ŭ���� ��� ���� : �̸�, ����, ����, ����, ���, ����
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
		return name + " / " + getAvg() + " / " + getGrade() + "����";
	}
}

public class StudentScore {
	public static void main(String[] args) {
		ArrayList <Student> p = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("===" + i + "�� �л� ����===");
			System.out.print("�̸� : ");
			String name = scanner.next();
			System.out.print("���� ���� : ");
			int kor = scanner.nextInt();
			System.out.print("���� ���� : ");
			int eng = scanner.nextInt();
			System.out.print("���� ���� : ");
			int mat = scanner.nextInt();
			
			p.add(new Student(name, kor, eng, mat));
		}
		System.out.println("===���===");
		for(Student list : p) {
			System.out.println(list);
		}
	}
}
