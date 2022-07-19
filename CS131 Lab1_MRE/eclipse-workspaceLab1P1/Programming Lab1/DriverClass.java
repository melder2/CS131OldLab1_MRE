
public class DriverClass{
	
	public static void main(String args[]) {
	NonPlayerCharacter num1 = new NonPlayerCharacter("487", "Neutral", false, "AVERAGE");
	System.out.println(GameCharacter.reportStructure());
	System.out.println(NonPlayerCharacter.reportStructure());
	System.out.println(num1.introduce());
	System.out.println("Random String: " + NonPlayerCharacter.exclaim());
	
}
}
