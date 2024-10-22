package ak_doublecolonoperator;

interface Interff{
	
	public Sample get(String s);
}

class Sample{
	
    String s;
	Sample(String s){
		this.s=s;
		System.out.println("Constructed Executed: "+s);
	}
}
public class Test2 {
	
	public static void main(String[] args) {
		
		Interff f =s->new Sample(s);
		f.get("From lamda expression");
		
		Interff f1 = Sample::new;
		f1.get("From Constructor reference");
	}
}
