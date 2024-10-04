package Person;

import java.util.Date;

public class TestMainforPerson {

	public static void main(String[] args) {
		PersonBasicMethods pm1 = new PersonBasicMethods("Shreyas","5432454677",new Date());
		PersonBasicMethods pm2 = new PersonBasicMethods("Shreya","1234567890",new Date());
		System.out.println(pm1);
		System.out.println(pm2);
	}

}
