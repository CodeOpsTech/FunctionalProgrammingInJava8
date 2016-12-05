import java.util.Arrays;

public class FunctionUse {
	public static void main(String []args) {
	 	Arrays.stream("4, -9, 16".split(", "))
			.map(Integer::parseInt)
			.map(intValue -> (intValue < 0) ? -intValue: intValue)
			.forEach(System.out::println);
	
	/* String integers = "4, -9, 16";
	String []intStrings = integers.split(", "); 
	for(String anInteger: intStrings) {
		int intValue = Integer.parseInt(anInteger); 
		int absIntValue = (intValue < 0) ? -intValue : intValue; 
		System.out.println(absIntValue); 
	}*/
	}  
}

