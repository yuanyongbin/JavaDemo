class Staff{
	//员工编号
	private String StaffId;
	//姓名
	private String name;
	//年龄
	private int age;
	
	//构造方法
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
		System.out.println("员工的编号是：" + StaffId + " 这个人是：" + name +" 年龄是：" + age);
	}
}

class StaffDemo{
	public static void main(String[] arge){
		Staff st = new Staff();
		
		//给成员变量赋值
		st.setStaffId("czbk0809");
		st.setName("林青霞");
		st.setAge(18);
		
		//显示数据
		st.show(); 
	}
}