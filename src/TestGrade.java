
public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grade g=new Grade();
int m1=78,m2=80,m3=80;
g.percent=(m1+m2+m3)/3.0;
System.out.println(g.percent);
System.out.println(g.grade());
System.out.println(g.result(m1, m2, m3));


	}

}
