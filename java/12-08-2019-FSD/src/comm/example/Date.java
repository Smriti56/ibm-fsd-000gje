package comm.example;

public class Date {
private int x;
private int y;
private int z;

public Date() {
	this(10);
}
public Date(int x) {
	this(x,60);
}

public Date(int x, int y) {
	this(x,y,30);
}


public Date(int x, int y, int z) {
	this.x = x;
	this.y = y;
	this.z = z;
	System.out.println(x+y+z);
}


}