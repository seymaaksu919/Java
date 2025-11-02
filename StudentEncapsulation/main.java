package Main;

public class main {

	public static void main(String[] args) {
		Student st = new Student("Ali",95);
		
		System.out.println("Öğrencinin ismi:" +st.getName());
		System.out.println("Öğrencinin notu:" +st.getGrade());
		
		
		st.setGrade(120); //Sayı geçersiz olduğu için değer değişmedi.
		System.out.println("Öğrencinin güncellenen notu:" +st.getGrade());
		
		

		

	}

}
