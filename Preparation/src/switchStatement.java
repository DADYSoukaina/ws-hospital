
public class switchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();

		switch(s.marks) {
		default: System.out.println("100");
		case 10: System.out.println("10");
		break;
		case 98: System.out.println("98");
		}
	}

}
