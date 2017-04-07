//返回值类型

interface Love{
	public abstract void love();
}

class LoveDemo{
	public Love getLove(){
		return new Teacher();
	}
}

class Teacher implements Love{
	public void love(){
		System.out.println("老师爱学生，爱Java，爱林青霞");
	}
}

class TeacherTest2{
	public static void main(String[] args){
		LoveDemo l = new LoveDemo();
		Love ll = l.getLove();
		ll.love();
	}
}