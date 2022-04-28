class Circle {
	int radius;
	
	public Circle(int radius) { //radius 변수를 가진 생성자
		this.radius = radius;
	}
	public double getArea() { //면적을 구하는 함수
		return 3.14 * radius * radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle [] c; //Circle 배열에 대한 레퍼런스 변수 c
		c = new Circle[5]; //5개의 레퍼런스 배열 생성
		
		for(int i = 0; i < c.length; i++) //배열의 개수 만큼
			c[i] = new Circle(i); //i 번째 원소 객체 생성
		
		for(int i = 0; i < c.length; i++) //배열의 모든 Circle 객체 면젹 출력
			System.out.print((int)(c[i].getArea()) + " ");
	}

}