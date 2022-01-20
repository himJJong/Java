package ifexample;

public class IfExample1 {

	public static void main(String[] args) {
		int age = 20;
		int charge;
		
		if (age<7) {
			charge=2000;
			System.out.println("어린이 입니다.");
		}
		else if (age<14) {
			charge=4000;
			System.out.println("초등학생 입니다.");
		}
		else {
			charge=6000;
			System.out.println("고등학생 입니다.");
		}
	
		System.out.println("가격은" +charge+"입니다.");
		
		

	}

}
