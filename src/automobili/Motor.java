package automobili;

public  class Motor {
	
	
	int zapremina;
	int jacina;
	String tipGoriva;
	
	
public Motor() {
	
	
}
	
	
public Motor(int zapremina,int jacina,String tipGoriva) {
	
	this.zapremina=zapremina;
	this.jacina=jacina;
	this.tipGoriva=tipGoriva;
	
			
}

public void povecajSnagu(int jacina) {
	
	this.jacina=jacina;
	
	int snagaAutomobila=70;
	
	snagaAutomobila=snagaAutomobila+this.jacina;
	
	System.out.println("Snaga Automobila je "+snagaAutomobila);
			
}

public void dajMiInformacije(int zapremina,int jacina,String tipGoriva) {
	
	this.zapremina=zapremina;
	this.jacina=jacina;
	this.tipGoriva=tipGoriva;
	
	
System.out.println("Zapremina motora je "+this.zapremina+" koji poseduje jacinu od "+this.jacina+" tipa goriva "+this.tipGoriva);
	
	
}
}

