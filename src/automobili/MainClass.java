package automobili;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	    Automobil a1=new Automobil();
		Automobil a2=new Automobil();
		
		
		Motor m1=new Motor();
		Motor m2=new Motor();
		
		m1.povecajSnagu(100);
		m1.dajMiInformacije(50, 150, "Dizel");
		
		m2.povecajSnagu(50);
		m2.dajMiInformacije(50, 100, "TNG");
		
		
		
		a1.ofarbaj("Crvena");
		a1.registruj(123);
		a1.dajMiInformacije("Mercedes", "A", 2022, m1);
		
		a2.ofarbaj("Bela");
		a2.registruj(321);
		a2.dajMiInformacije("BMW", "C", 2001, m2);
		
		
		
		
		
		
		
	}

}
