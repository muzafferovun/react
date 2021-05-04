package day4homework3fifoobject;


public class CompanyManager {
	public static Company addCompany(Company company,String name) {
		if(company==null||company.getId()==-1) {
			company=new Company(1, name, company);
		}
		else {
			
			company.setCompany(CompanyManager.addCompany(company.getCompany(),name,company.getId()+1));
		}
	
		return company;
	
	}
	public static Company addCompany(Company company,String name,int id) {
		if(company==null||company.getId()==-1) {
			company=new Company(id, name, company);
		}
		else {
			
			company.setCompany(CompanyManager.addCompany(company.getCompany(),name,company.getId()+1));
		}
	
		return company;
	
	}
	public static void showCompanys(Company company) {
		if(company==null) {
		}
		else if(company.getId()==-1) {
			
		}
		else {
			System.out.println(company.getId()+"->"+company.getName());	
			CompanyManager.showCompanys(company.getCompany());
		}
	}
	public static Company deleteById(Company company, int id) {
		if(company!=null) {
			if(company.getId()==id) {
					return company.getCompany();
			}
			else {
				if(company.getCompany()!=null) {
					if(company.getCompany().getId()>-1)	company.setCompany(CompanyManager.deleteById(company.getCompany(),id));
				}
			}
		}
		return company;
	}
	public static Company update(Company company, int id,String name) {
		if(company!=null) {
		
			if(company.getId()==id) {
					company.setName(name);
					return company;
			}
			else {
				if(company.getCompany()!=null) {
					company.setCompany(CompanyManager.update(company.getCompany(),id,name));
				}
			}
		}
		return company;
	}
	public static Company findById(Company company, int id) {
		if(company!=null) {
		
			if(company.getId()==id) {
					return company;
			}
			else {
				if(company.getCompany()!=null) {
					company=CompanyManager.findById(company.getCompany(),id);
				}
			}
		}
		return company;
	}
	

}
