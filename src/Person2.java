
abstract class Person3 {
	abstract void whatDoYouDo();

	public boolean doYouSpeak() {
		System.out.println("Yes, i speak ");
		return true;
	}
}

	class Trainer1 extends Person3 {
		@Override
		void whatDoYouDo() {
			System.out.println("Train people");
		}
	}

	class Doctor extends Person3 {
		@Override
		void whatDoYouDo() {
			System.out.println("Cure People");
		}
	}

	class Pilot extends Person3 {
		@Override
		void whatDoYouDo() {
			System.out.println("fly plane");
		}
	}

class Person2 {
	public static void main(String[] args) {
		Trainer1 t = new Trainer1();
		Doctor d=new Doctor();
		Pilot p=new Pilot();
		
		System.out.println("Speak"+t.doYouSpeak());
		System.out.println("what do you do");
		t.whatDoYouDo();
		
		
		System.out.println("Speak"+d.doYouSpeak());
		System.out.println("what do you do");
		d.whatDoYouDo();
		
		System.out.println("Speak"+p.doYouSpeak());
		System.out.println("what do you do");
		p.whatDoYouDo();
	}
}
