package xml_onetomany;

import java.util.HashSet;
import java.util.Set;

public class Classes {
private int id;
private String classname;
private Set students = new HashSet();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Set getStudents() {
	return students;
}
public void setStudents(Set students) {
	this.students = students;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}

}
