package ınterface;

public class MakineMuhendisi extends BaseMuhendisi implements IMuhendis{

	
	public MakineMuhendisi() {
		
	}
	public MakineMuhendisi(String isim, String soyisim, int tecrube, double maas, String[] diller){
		setIsim(isim);
		setSoyisim(soyisim);
		setTecrube(tecrube);
		setMaas(maas);
		setDiller(diller);
		
	}
	
	@Override
	public void bilgileriYazdir() {

		System.out.println("İsim:" +getIsim());
		System.out.println("Soy isim: " +getSoyisim());
		System.out.println("Tecrübe: " +getTecrube());
		System.out.println("Maas: " +getMaas());
		System.out.println("Askerlik durumu:" +getAskerlikDurum());
		System.out.println("Diller :");
		for(String dil : getDiller()) {
			System.out.println(dil+ " , ");
		}
		
	}

	@Override
	public void askerlikYapildiMi(boolean deger) {
		if(deger) {
			setAskerlikDurum("Askerlik yapıldı...");
		} else {
			setAskerlikDurum("Askerlik yapılmadı");
		}
		
		
	}
		
}
