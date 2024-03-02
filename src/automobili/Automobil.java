package automobili;

public class Automobil  extends Motor{
	
	String marka;
	String model;
	int godiste;
	int regTablica;
	int brojVrata;
	String boja;
	Object motor;

	
public Automobil() {
	
	
}
	
	
public Automobil(String marka,String model,int godiste,int regTablica,int brojVrata,String boja,Object motor) {
	
	this.marka=marka;
	this.model=model;
	this.godiste=godiste;
	this.regTablica=regTablica;
	this.brojVrata=brojVrata;
	this.boja=boja;
	this.motor=motor;
	
	

}

public void ofarbaj(String boja) {
	
	this.boja=boja;
	
	System.out.println("Boja Automobila je "+this.boja);
}
	
public void registruj(int regTablica) {
	
	this.regTablica=regTablica;
	
	System.out.println("Registarska tablica Automobila je "+this.regTablica);
	
		
}
	
public void dajMiInformacije(String marka,String model,int godiste,Motor motor) {
	
	this.marka=marka;
	this.model=model;
	this.godiste=godiste;
	this.motor=motor;
	
	
	System.out.println("Marka automobila je "+this.marka+"i model "+this.model+"godista, "+this.godiste+"vrste motora "+this.motor);
	
}


}
	


   
   

	
	
	

