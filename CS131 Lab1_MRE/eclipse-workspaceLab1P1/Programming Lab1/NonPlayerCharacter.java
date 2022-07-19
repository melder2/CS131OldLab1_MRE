import java.util.Random;
public class NonPlayerCharacter extends GameCharacter {

	private static boolean active;
	private static String intelligenceType;
	
	public NonPlayerCharacter() {
		super();
		active = false;
		intelligenceType = "";
	}
	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType) {
		super.uniqueID = uniqueID;
		super.personality = personality;
		this.active = active;
		this.intelligenceType = intelligenceType;	
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getIntelligenceType() {
		return intelligenceType;
	}
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	public static String reportStructure()
	{
		return "Active: " + active + "\n" + "intelligenceType: " + intelligenceType + "\n" + 
				"============================================";
	}
	public String introduce() {
		return "Hello, my UniqueID is "+uniqueID + "\n" + "============================================";
	}
	public static String exclaim() {
		String [] arrayList = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"}; 
		Random r = new Random();
		int random = r.nextInt(4);
		return arrayList[random];
	}
	
}

