class Staff{
	//Ա�����
	private String StaffId;
	//����
	private String name;
	//����
	private int age;
	
	//���췽��
	public Staff(){
		
	}
	public String getStaffId(){
		return StaffId;
	}
	public void setStaffId(String StaffId){
		this.StaffId = StaffId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age= age;
	}
	public void show(){
		System.out.println("Ա���ı���ǣ�" + StaffId + " ������ǣ�" + name +" �����ǣ�" + age);
	}
}

class StaffDemo{
	public static void main(String[] arge){
		Staff st = new Staff();
		
		//����Ա������ֵ
		st.setStaffId("czbk0809");
		st.setName("����ϼ");
		st.setAge(18);
		
		//��ʾ����
		st.show(); 
	}
}