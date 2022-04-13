package robot1;

public class FormatSpecfire {
	
	public static void main(String[] args) {
		
		double number = 4555.666666;
		System.out.printf("%.2f\n",number);
		System.out.printf("This is a number value : %.2f\n",number);
		
		double number1 = 76454.666666;
		double number2 = 75555.666666;
		System.out.printf("%.2f",number1);
		System.out.println("This is a number value :"+ String.format("%.2f",number1));
		System.out.println("This is a number value :"+ String.format("%.2f",number2));
		
		
		
		
				
		
		
	}

}
