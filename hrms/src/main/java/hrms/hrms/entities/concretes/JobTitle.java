package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="job_titles")
public class JobTitle {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	@Column(name="title")
	String jobTitle;
	
	public JobTitle() {
		
	}
	
	public JobTitle(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
	}
	

	

}
