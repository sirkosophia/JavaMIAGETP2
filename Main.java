package fr.dauphine.javaavance.td2;


import java.io.IOException;

class Main {
	
	public static void main(String[] args) {

		Expr val = new Value(1337.0);
		
		System.out.println(val.eval()); //affiche 1337.0
		
		System.out.println(val);
		
		Expr add = new Add(new Value(327.0), val);
		
		System.out.println(add.eval()); //affiche 1664.0
		
		System.out.println(add);
		
		Expr e = new Add(new Value(350.0), add);
		
		System.out.println(e.eval()); //affiche 2014.0
		
		System.out.println(e);
		
		Expr sq = new Sqrt(e);
		
		System.out.println(sq);
		
		System.out.println(sq.eval());
		
		Expr mult = new Multiply(e, sq.eval());
		
		System.out.println(mult);
		
		System.out.println(mult.eval());
	}
}

/*
class Mere {
	
	public void a() {System.out.println("Mere_a"); }
	
	void b(Fille fille) {System.out.println("Mere_b(Fille)"); }

	void c() {System.out.println("Mere_c");}
	
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); } //surcharge 

	static void d() {System.out.println("static Mere_d");}

	protected void e() {System.out.println("Mere_e");}
	
	private void f() {System.out.println("Mere_f");}
	
	public void printF() { f(); }

	Object g() {System.out.println("Mere_g"); return 2;}
	
	int h() {System.out.println("Mere_h"); return 2;}
	
	void i() {System.out.println("Mere_i");}

	void j() throws Exception {System.out.println("Mere_j"); }
	
	void k() throws IOException {System.out.println("Mere_k"); }
	
	void l() throws Exception {System.out.println("Mere_l"); }
	
	void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m"); }
}

class Fille extends Mere{
	void miage() {System.out.println("Miage");}

	public void a() {System.out.println("Fille_a"); } //redefinition

	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");} //redefinition

	public void c(Mere mere) {System.out.println("Fille_c(Mere)");} //redefinition
	
	void c(Fille b) {System.out.println("Fille_c(Fille)"); } //surcharge

	static void d() {System.out.println("static Fille_d");} //redefinition
	
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");} //surcharge
	
	protected void f() {System.out.println("Fille_f");} //redefinition

	String g() {System.out.println("Fille_g"); return "c";} //redefinition

	void j() throws IOException {System.out.println("Fille_j"); } //redefinition

	void l() {System.out.println("Fille_l");} //redefinition
	
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); } //redefinition
}

public class Main {
	public static void main(String[] args) throws Exception {
	Mere mere=new Mere();
	Mere mereFille=new Fille();
	Fille fille=new Fille();

	fille.miage();
	((Fille)mereFille).miage();
	
	mere.a();
	mereFille.a();
	fille.a();
	((Mere)mereFille).a();
	mereFille.b(null);
	
	mereFille.c();
	mereFille.c(mere);
	mereFille.c(mereFille);
	mereFille.c(fille);
	fille.c(fille);
	
	mere.d();
	mereFille.d();
	mere.printF();
	mereFille.printF();
	
	mereFille.j();
	mereFille.k();
	mereFille.l();
	mereFille.m();
	}
}

*/

/*
class Mere {
	
	protected static int meth() {
		return 42;
	}
	
	public void printMeth() {
		System.out.println(meth());
	}
}

class Fille extends Mere {
	public static int meth() {
		//System.out.println("test: " + super.meth());
		return 24;
	}
}

class Main {
	public static void main(String[] args) {
		
		Mere mere = new Mere();
		System.out.println(mere.meth());
		mere.printMeth();
		
		Fille fille = new Fille();
		System.out.println(fille.meth());
		fille.printMeth();
		
		Mere mereFille = new Fille();
		System.out.println(mereFille.meth());
		mereFille.printMeth();
		
		
	}
}
*/


/*
class Mere {
	protected int meth = 42;
	
	public void printMeth() {
		System.out.println(meth);
	}
}

class Fille extends Mere {
	public int meth = 24;
}

class Main {
	public static void main(String[] args) {
		Mere mere = new Mere();
		System.out.println(mere.meth);
		mere.printMeth();
		
		Fille fille = new Fille();
		System.out.println(fille.meth);
		fille.printMeth();
		
		Mere mereFille = new Fille();
		System.out.println(mereFille.meth);
		mereFille.printMeth();
	}
}	
*/