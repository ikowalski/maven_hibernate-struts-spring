package xml_Doublemanytomany;

import java.util.HashSet;
import java.util.Set;

public class Courses {
private int id;
private String course_name;
private Set students = new HashSet();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public Set getStudents() {
	return students;
}
public void setStudents(Set students) {
	this.students = students;
}

}
