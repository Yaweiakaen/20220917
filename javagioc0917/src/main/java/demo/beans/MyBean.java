package demo.beans;

public class MyBean {
	private String name="NA";		
	
	public MyBean(String name) {		
		this.name = name;
	}
	public MyBean() {		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}	
}
