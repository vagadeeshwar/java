package package1;

public class HostelDetails implements School {

	public String name;
	public int blockNum, numRooms;

	public HostelDetails(String name, int blockNum, int numRooms) {
		this.name = name;
		this.blockNum = blockNum;
		this.numRooms = numRooms;
	}

	public void display() {
		System.out.println(name + " " + blockNum + " " + numRooms);
	}
}
