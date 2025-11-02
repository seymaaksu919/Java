package ınterface;

public class BilgisayarMuhendisi extends BaseMuhendisi implements IMuhendis {
	

	private String isim;
	
	private String soyisim;
	
	private int tecrube;
	
	private double maas;
	
	private String[] diller;
	
	private String askerlikDurum;
	
	public String getAskerlikDurum() {
		return askerlikDurum;
	}

	public void setAskerlikDurum(String askerlikDurum) {
		this.askerlikDurum = askerlikDurum;
	}

	public BilgisayarMuhendisi() {
		
		
	}
	


	public BilgisayarMuhendisi(String isim, String soyisim, int tecrube, double maas, String[] diller){
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
		System.out.println("Askerlik durumu:" +getAskerlikDurum());
		System.out.println("Maas: " +getMaas());
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
