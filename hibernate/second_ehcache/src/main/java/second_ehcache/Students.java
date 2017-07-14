package second_ehcache;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Generated;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
//region说明该类引用ehcache.xml配置中的哪个缓存策略
public class Students {
private int id;
private String student_name;
@Id
@GeneratedValue
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}

}
