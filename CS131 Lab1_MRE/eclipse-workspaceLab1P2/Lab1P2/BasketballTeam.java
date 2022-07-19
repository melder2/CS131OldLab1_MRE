
public class BasketballTeam extends SportsTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}
	public BasketballTeam(String teamName, String teamMascot, String headCoach, int wins, int losses, int fieldGoals, 
							int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) 
	{
		super.teamName = teamName;
		super.teamMascot = teamMascot;
		super.headCoach = headCoach;
		super.wins = wins;
		super.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
		
	}
	public double fieldGoalPercentage() {
		return (fieldGoals/fieldGoalsAttempted);
	}
	public double freeThrowPercentage() {
		return (freeThrows/freeThrowsAttempted);
	}
	public String toString() {
		return "BasketballTeam" + "\n" + "Team Name: "+ teamName + "\n" + "TeamMascot: " + teamMascot + "\n" + "Head Coach: " + headCoach + "\n" + 
				"Wins: " + wins + "\n" + "Losses: "+ losses + "\n"  + "Field Goals Made: " + fieldGoals + "\n" + "Field Goals Attempted: " + fieldGoalsAttempted
				+  "\n" + "Field Goal Percentage: " + (fieldGoals/fieldGoalsAttempted) + "\n" + "Free Throws Made: " + freeThrows + "\n" 
				+ "freeThrowsAttempted:" + freeThrowsAttempted + "\n" + "Free Throw Percentage: " + (freeThrows/freeThrowsAttempted);
	}
	public double[] getStats() {
		return null;
	}
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) 
	{
		
	}
	public int getFieldGoals() {
		return fieldGoals;
	}
	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}
	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}
	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}
	public int getFreeThrows() {
		return freeThrows;
	}
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}
	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
}

