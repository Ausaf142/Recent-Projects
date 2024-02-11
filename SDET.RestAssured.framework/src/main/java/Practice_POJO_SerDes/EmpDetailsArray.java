package Practice_POJO_SerDes;

public class EmpDetailsArray {
	

		int id;
		String name;
		int[] phno;
		String address;

		public EmpDetailsArray(int id, String name, int[] phno, String address) {

			this.id = id;
			this.name = name;
			this.phno = phno;
			this.address = address;
		}
		


		public EmpDetailsArray() {
			
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int[] getPhno() {
			return phno;
		}

		public void setPhno(int[] phno) {
			this.phno = phno;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}





	
}
