public class Event {
    private String name;
	private String detail;
	private String type;
	private String organiser;
	private Integer attendeesCount;
	private Double projectedExpense;
	
	public Event(){}
	
	public Event(String name,String detail, String type, String organiser,Integer attendeesCount, Double projectedExpense) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
		this.attendeesCount = attendeesCount;
		this.projectedExpense = projectedExpense;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	public Integer getAttendeesCount() {
		return attendeesCount;
	}

	public void setAttendeesCount(Integer attendeesCount) {
		this.attendeesCount = attendeesCount;
	}

	public Double getProjectedExpense() {
		return projectedExpense;
	}

	public void setProjectedExpense(Double projectedExpense) {
		this.projectedExpense = projectedExpense;
	}
	
	public String toString()
	{
		return "Name: "+this.name+"\nDetails: "+this.detail+"\nType: "+this.type+"\nOrganiser: "+this.organiser+"\nAttendees count: "+this.attendeesCount+"\nProjected Expense: "+this.projectedExpense;
	}
}
