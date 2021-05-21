package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.JobTitle;


public interface JobTitleService {
	List<JobTitle> getAll();
}
