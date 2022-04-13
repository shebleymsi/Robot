package robot1;

public class LearnNestedClass {
	
	int age = 44;
	static String firstName = "James";

	public static class Computer {

		String computerName = "Windows";
		static int ram = 16;

		public static void main(String[] args) {

			System.out.println("This is child class");
			
			Computer myComputer = new Computer();
			System.out.println(myComputer.computerName);
			
			System.out.println(Computer.ram);
			
			myComputer.computerDisplay();
			
			LearnNestedClass learn = new LearnNestedClass();
			System.out.println(learn.age);
			
		}

		public void computerDisplay() {

			System.out.println("This is computer Display");

		}

	}

	public static void main(String[] args) {

		System.out.println("This is Parent class");

		Computer myCom = new Computer();
		System.out.println(myCom.computerName);
		System.out.println(Computer.ram);
	}

}
