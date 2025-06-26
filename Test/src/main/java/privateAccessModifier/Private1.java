package privateAccessModifier;

public class Private1 {
	private int x=10;
			private void list() {
		
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private1 p=new Private1();
		
		p.list();
		System.out.println(p.x);

	}

}
