package Curs8;

public class Developer implements Angajat{
	
		String name;
		String email;
		
		@Override
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public void setEmail(String email) {
			this.email =  email;		
		}

		@Override
		public String getEmail() {
			return email;
		}
		@Override
		public void departament() {
			System.out.println("DEV");
		};
		
	}

