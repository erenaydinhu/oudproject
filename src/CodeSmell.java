
public class CodeSmell {
	
	
	
	private static final String Cars = "Renault, peugeot, mercedes";
	private static final String Animals = "Dog, cat, cow";
	
	//introduce factory method
	
	public static CodeSmell createCodeSmell(String name, String className, int codeLine) {
		return new CodeSmell(name, className, codeLine);
	}

	public static CodeSmell createPremadeCodeSmell() {
		return new CodeSmell();
	}

	public static CodeSmell createBestellingCodeSmell(String name, int codeLine) {
		return new CodeSmell(name, codeLine);
	}

	private String name;
	private String className;
	private int codeLine;
	
	public CodeSmell(String name, String className, int codeLine){
		this.name = name;
		this.className = className;
		this.codeLine = codeLine;
		
	}
	
	public CodeSmell(){
		this.name = "Extract Interface";
		this.className = "Opslag";
		this.codeLine = 9;
	}
	
	public CodeSmell(String name, int codeLine){
		this.name = name;
		this.className = "Bestelling";
		this.codeLine = codeLine;
	}
		
	//extract constant/field/variable
	
	public void postMessage(){
		System.out.println(Animals);
		System.out.println(Cars);
	}

	// change method signature
	public void doAction(String firstLine, String secondLine) {
		System.out.println("First we write this word: " + firstLine);
		followUpAction(firstLine);
	}

	public void followUpAction(String secondLine) {
		System.out.println("Then we write this word: " + secondLine);
	}

	// extract method
	public void doTwoThings() {
		System.out.println("Write away");
		int c = Calculate();
		System.out.println(c);

	}

	private int Calculate() {
		int a = 5;
		int b = 2;
		int c = a + b;
		return c;
	}
	
	//inline method
	
	public double getCircumference(double radius){
	return Math.PI + Math.pow(radius, 2);
		
	}
	
	private double piValue(){
		return Math.PI;
	}
}
