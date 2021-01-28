package Fast;
class Company{
	private static Company instance = new Company();
	private Company() {
		
	}
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}

public class Com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company);
	}

}
