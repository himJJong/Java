package classpart;

public class Student {
	
	int age;
	String name;
	String sex;
	String married;
	int child;

	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.age = 40;
		student1.child = 3;
		student1.name = "James";
		student1.sex = "man";
		student1.married = "yes";
		

		Student student2 = new Student();
		student2.age = 28;
		student2.child = 1;
		student2.name = "her";
		student2.sex = "girl";
		student2.married = "yes";
		
		System.out.println("이 사람의 나이는 "+student1.age+ "이고 " + "아이"+student1.child
				+ "이름은 "+ student1.name+"이고 "+ student1.sex+"이며 " +"결혼"+ student1.married);
		
		System.out.println("이 사람의 나이는 "+student2.age+ "이고 " + "아이"+student2.child
				+ "이름은 "+ student2.name+"이고 "+ student2.sex+"이며 " +"결혼"+ student2.married);

	}
	

}
