package Person;

import java.time.LocalDate;

public class TestMainforPerson {

	public static void main(String[] args) {
		PersonBasicMethods pm1 = new PersonBasicMethods("Shreyas","5432454677",LocalDate.of(2000,11,14));
		PersonBasicMethods pm2 = new PersonBasicMethods("Shreya","1234567890",LocalDate.of(1987,8,30));
		System.out.println(pm1);
		System.out.println(pm2);
	}

}
