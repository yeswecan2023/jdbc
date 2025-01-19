package basicConcept;

public class newSwitch {
	public static void main (String[] args) {
		String day = "mon";
		
		switch (day) {
			case "sun" -> System.out.println("6AM");
			case "mon" -> System.out.println("5AM");
			default -> System.out.println("8AM");
		}
		
		// expression
		
		String swit = "";
		
		switch(day) {
		case "mon" -> swit = "6AM";
		default -> swit = "4AM";
		}
		
		System.out.println(swit);
	}
}
