package basicConcept;

public class newSwitch {
	public static void main (String[] args) {
		String day = "mon";
		
		switch (day) {
			case "sun" -> System.out.println("6AM");
			case "mon" -> System.out.println("5AM");
			default -> System.out.println("8AM");
		}
	}
}
