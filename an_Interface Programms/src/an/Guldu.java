package an;

public class Guldu implements Person
{
	@Override
    public void eat()
    {

		System.out.println("Eating Biryani");
    }
	
	public static void main(String[] args) {
		
		System.out.println(Person.id);
		
		Guldu g = new Guldu();
		
		g.eat();
	}
}
