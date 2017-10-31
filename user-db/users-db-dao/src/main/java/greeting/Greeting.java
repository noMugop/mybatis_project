package greeting;

public class Greeting {
	private int id;
	private String greeting;

	public Greeting(int id, String greeting) {
		super();
		this.id = id;
		this.greeting = greeting;
	}

	public Greeting() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Id = ").append(id).append(" - ");
		sb.append("Greeting = ").append(greeting).append(" - ");
		return sb.toString();
	}
}
