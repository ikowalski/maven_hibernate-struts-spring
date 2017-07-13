package annonation_onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Classes {
private int id;
private String classname;
private Set<Students>students = new HashSet<Students>();
@Id
@GeneratedValue
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}

@OneToMany(mappedBy="classes")
//如果配置mappedBy属性就是双向的了，该数值为一方中多方类的引用名，这时有多方维持关系
public Set<Students> getStudents() {
	return students;
}
public void setStudents(Set<Students> students) {
	this.students = students;
}
}
