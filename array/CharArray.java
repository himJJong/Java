package array;

public class CharArray {

	public static void main(String[] args) {
		char[] Alphabets = new char[26];
		char ch ='A';
		
		for(int i=0; i<Alphabets.length; i++,ch++) {
			Alphabets[i]=ch;
		}
		for(int i=0; i<Alphabets.length; i++) {
			System.out.println(Alphabets[i]+","+ (int)Alphabets[i]);
		}

	}

}
