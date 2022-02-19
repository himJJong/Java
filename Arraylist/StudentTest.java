package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어",100);
		studentLee.addSubject("수학 ",50);
		
		Student studentKim = new Student(1002,"Kim");
		studentKim.addSubject("국어",10);
		studentKim.addSubject("수학 ",5);
		studentKim.addSubject("과학",80);
		
		studentLee.showStudentInfo();
		System.out.println("=================");
		studentKim.showStudentInfo();

	}
}
