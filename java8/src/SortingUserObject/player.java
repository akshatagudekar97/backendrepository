package SortingUserObject;

public class player {

	int pid;
	String name;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public player(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

}
