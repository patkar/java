package Pack2;

public class TestSchool {

	public static void main(String[] args) {
		MySchool s=new MySchool();
		Trainer t=new Trainer();
		LabTrainer lt=new LabTrainer();
		s.nameofTheSchool="mgm";
		s.noOfStudents=100;
		s.city="udupi";
		
		t.age=45;
		t.name="anfal";
		t.salary=10000;
		System.out.println("Properties of school");
		System.out.println(s.city);
		System.out.println(s.nameofTheSchool);
		System.out.println(s.noOfStudents);
		
		System.out.println("Properties of trianer");
		System.out.println(t.age);
		System.out.println(t.name);
		System.out.println(t.salary);
		
		lt.age=55;
				lt.name="arvind";
			
				System.out.println("Propeties of lab trainer");
				System.out.println(lt.age);
				System.out.println(lt.name);
				System.out.println(lt.salary);
	}
	
}
