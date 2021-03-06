package model.world;

public class Spell {
	
	private String titel;
	private String precondition;
	private String text;
	private String cost;
	private String duration;
	private String power;
	

	public Spell(String titel, String precondition, String text, String cost, String duration, String power) {
		super();
		this.titel = titel;
		this.precondition = precondition;
		this.text = text;
		this.cost = cost;
		this.duration = duration;
		this.power = power;
	}
	
	public String toString() {
		String s = "titel:"+titel +"\n" +"precondition: "+precondition+"\n" +"text: "+text +"\n" +"cost: "+cost+"\n" +"duration: "+duration+"\n" +"power: "+power;
		return s;
	}
	
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getPrecondition() {
		return precondition;
	}
	public void setPrecondition(String precondition) {
		this.precondition = precondition;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	
	
}
