//����ֵ����

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
		System.out.println("��ʦ��ѧ������Java��������ϼ");
	}
}

class TeacherTest2{
	public static void main(String[] args){
		LoveDemo l = new LoveDemo();
		Love ll = l.getLove();
		ll.love();
	}
}