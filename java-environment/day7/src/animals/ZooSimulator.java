package animals;

public class ZooSimulator {
	public static void main(String[] args) {
//		Animal a = new Animal("Albert", 3, 50.0, new Tag());
//		anim.eat("hamburger");
		
		Platypus p = new Platypus("Perry", 5, 25.0, new Tag());
		Lion larry = new Lion("Larry", 4, 150.0, new Tag(), 25.0f);
		System.out.println(larry.name + " has a mane of: " + larry.maneSizeInInches + "in");
		printAnimalFunFact(p);
		printAnimalFunFact(larry);
		
		Animal anim = new Platypus("Patrick", 6, 20.0, new Tag());
		
		/*
		 * Primitive variable - Type of primitive, value
		 * Reference variable - Type of reference, memory address
		 */
		/*
		 * Covariance / Covariant typing : allows you to look
		 * at the child/super class information and vice versa
		 * when you have certain objects that reside wihtin a
		 * heirarchy
		 */
		((Platypus)anim).envenmon(); // look at the child info from parent
		
		Duck d = new Duck("Donald", 7, 5.6, new Tag());
		tryToSwim(d);
	}
	
	// look at parent info from any child
	public static void printAnimalFunFact(Animal anim) {
		anim.funFact();
		if (anim instanceof Platypus) {
			((Platypus)anim).envenmon();
		} else if (anim instanceof Lion) {
			System.out.println("Lion has a mane of :" + ((Lion)anim).maneSizeInInches);
		}
	}
	
	public static void tryToSwim(Swimmable swimmer) {
		swimmer.swim();
	}
}
