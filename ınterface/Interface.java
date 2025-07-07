package ınterface;

public class Interface {

	public static void main(String[] args) {
		BilgisayarMuhendisi bilgisayarmuhendisi= 
				new BilgisayarMuhendisi("Enes","Bayram",2,3500,new String[] {"JAVA","PYTHON","JAVASCRİPT"});

		MakineMuhendisi makinemuhendisi = 
				new MakineMuhendisi("Bilal","Çınar",4,4500,new String[] {"C","C++","Ruby"});
	
	
		System.out.println("BİLGİSAYAR MÜHENDİSİ");
		muhendisBilgileriYazdir(bilgisayarmuhendisi);

		System.out.println("*******************");
		System.out.println("MAKİNE MÜHENDİSİ");
		muhendisBilgileriYazdir(makinemuhendisi);
	}
	
	
	
	public static void muhendisBilgileriYazdir(IMuhendis muhendis) {
		muhendis.askerlikYapildiMi(true);
		muhendis.bilgileriYazdir();
	}

}


