package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
	
		bookArray1[0] = new Book("태백산","조정");
		bookArray1[1] = new Book("종석","하이");
		bookArray1[2] = new Book("석바","멍충");
		System.arraycopy(bookArray1,0,bookArray2,0,3);
		
		for (int i=0; i < bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
	}
}
