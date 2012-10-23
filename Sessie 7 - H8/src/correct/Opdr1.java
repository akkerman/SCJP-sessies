package correct;

public class Opdr1 {
	public static void main(String[] args) {
		Eten e = new Eten();
		
		e.aardappel.patat();
		e.aardappel.prakken();
		e.aardappel.stampot();
		e.rijst.draai();
		e.rijst.bak();
	}
}

class Aardappel{
	public void patat() {System.out.println("patat aardappel");}
	public void prakken() {System.out.println("prakken aardappel");}
	public void stampot() {System.out.println("stampot aardappel");}
}

class Rijst{
	public void bak() {System.out.println("bak rijst");}
	public void draai() {System.out.println("draai rijst");}
}

class Eten{
	Aardappel aardappel = new Aardappel() {
		public void patat() {System.out.println("anonymous patat aardappel");}
		public void prakken() {System.out.println("anonymous prakken aardappel");}
		public void stampot() {System.out.println("anonymous stampot aardappel");}
	};
	
	Rijst rijst = new Rijst() {
		public void draai() {System.out.println("anonymous draai rijst");}
		public void bak() {System.out.println("anonymous bak rijst");};
	};
}