
public abstract class SportsTeam { 
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;

	public SportsTeam() {
	teamName = "";
	teamMascot = "";
	headCoach = "";
	wins = 0;
	losses = 0;
}
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
	}
	public double getWinPercentage() {
		return (wins)/(wins+losses);
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamMascot() {
		return teamMascot;
	}
	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
	public abstract double[] getStats();
	{
		
	}

}


