
public class Calculator {
	
	int calculationCounter = 0;
		
	public int add(int a, int b){
		setCalculationCountNumber();
		return a + b;
	}
	
	public void setCalculationCountNumber(){
		int calculationCounter = calculationCounter + 1;
	}
	
	public int getCalculationCountNumber(){
		return calculationCounter;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();		
		System.out.println(calc.add(1, 1));
		System.out.println(calc.getCalculationCountNumber());
	}
}
