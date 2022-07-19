
public class GameCharacter {
	protected static String uniqueID;
	protected static String personality;
	

public GameCharacter() {
	uniqueID = "";
	personality = "";
}
public GameCharacter(String uniqueID, String personality) {
	this.uniqueID = uniqueID;
	this.personality = personality;
}
public static String reportStructure() {
	return "============================================" +"\n"
			+ "UniqueID: " + uniqueID + "\n" + 
			"Personality: " + personality + "\n" + 
			"============================================";
}
public String getUniqueID() {
	return uniqueID;
}
public void setUniqueID(String uniqueID) {
	this.uniqueID = uniqueID;
}
public String getPersonality() {
	return personality;
}
public void setPersonality(String personality) {
	this.personality = personality;
}

}