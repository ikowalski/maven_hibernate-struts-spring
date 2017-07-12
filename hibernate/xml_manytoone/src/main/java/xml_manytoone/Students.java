package xml_manytoone;

public class Students {
private int id;
private String name;
private Classes classes;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Classes getClasses() {
	return classes;
}
public void setClasses(Classes classes) {
	this.classes = classes;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
