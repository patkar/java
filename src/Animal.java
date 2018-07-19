
public class Animal {

	public void speak() {
		System.out.println("Nothing to sound");
	}
}

class cat extends Animal {
	public void speak() {
		System.out.println("Meow");
	}
}

class dog extends Animal {
	public void speak() {
		System.out.println("bow bow");
	}
}

class horse extends Animal {
	public void speak() {
		System.out.println("neigh");
	}
}

class TestAnimal {
	public static void main(String[] args) {
		String animalName = "cat";
		invokeAnimalSound(animalName);
	}

	private static void invokeAnimalSound(String animalName) {
		// TODO Auto-generated method stub
		Animal a = null;
		if (animalName.equals("dog"))
			a = new dog();
		else if (animalName.equals("cat"))
			a = new cat();
		else if (animalName.equals("cat"))
			a = new cat();
		else if (animalName.equals("horse"))
			a = new cat();
		callSound(a);
	}

	public static void callSound(Animal a) {
		a.speak();
	}
}