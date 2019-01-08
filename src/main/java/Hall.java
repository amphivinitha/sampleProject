public class Hall {
    private String name;
	private String contact;
	private Double costPerDay;
	private String owner;
	public Hall(){}
	public Hall(String name, String contact, Double costPerDay, String owner) {
		this.name = name;
		this.contact = contact;
		this.costPerDay = costPerDay;
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String toString()
	{
		return "Name: "+this.name+"\nContact: "+this.contact+"\nCost per Day: "+this.costPerDay+"\nOwner: "+this.owner;
	}
}