
public class Application {

	public static void main(String[] args) {
		System.out.println("Dog example");
		Dog d1 = new Dog("Pluto", "White");
		
		System.out.println("Vitality of "+d1.getName()+": " +d1.getVitality());
		
		d1.move();
		
		System.out.println("Vitality of "+d1.getName()+": " +d1.getVitality());
		
		d1.makeNoise();
		d1.move();
		
		System.out.println("Vitality of "+d1.getName()+": " +d1.getVitality());
		
		d1.eat();
		d1.cuddling();
		d1.sleep();
		
		System.out.println("Vitality of "+d1.getName()+": " +d1.getVitality());
		
		d1.move();
		d1.move();
		d1.move();
		d1.sleep();
		
		
		System.out.println("\nHorse Example");
		Horse h1 = new Horse("Black");
		h1.ride();
		h1.getOff();
		System.out.println(h1.isAlive());
		
		h1.move();
		h1.makeNoise();
		h1.move();
		System.out.println(h1.isAlive());
		
		h1.move();
		h1.move();
		System.out.println(h1.isAlive());
		
		

	}

}
