package Demo1;

public class B {
 private A m;
 private String name;
 
 public A getM() {
	return m;
}
public void setM(A m) {
	this.m = m;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "B [m=" + m + ", name=" + name + "]";
}
public B(A m, String name) {
	super();
	this.m = m;
	this.name = name;
}
public B() {
	super();
}
}