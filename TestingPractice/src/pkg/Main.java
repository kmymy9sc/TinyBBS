package pkg;

public class Main {
	public static void main(String[] args) {
		Robot r1 = new Robot();
		Robot r2 = new Robot();

		r1.replace(5,  4);
		System.out.println("r1:"+r1.getLocationString());

		r2.replace(3, 1);
		System.out.println("r2:"+r2.getLocationString());

		r1.move(2,  -1);
		System.out.println("r1:"+r1.getLocationString());


	}
}
