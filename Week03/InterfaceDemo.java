/*
	�ӿ��ص㣺
		�ӿ��ùؼ���interface��ʾ
			interface �ӿ���{}
		��ʵ�ֽӿ��� implements ��ʾ
			class ���� implements �ӿ���{}
		�ӿڲ���ʵ����
			��ô���ӿ���ôʵ�����أ�
			����̬�ķ�����ʵ����
		�ӿڵ�����
			�����ǳ����ࡣ�����岻��
			�����Ǿ����࣬����Ҫ��д�ӿ����е����г��󷽷����Ƽ�������
	
	�ɴ˿ɼ���
		�������̬���������ã�
		�������̬�����ã�
		�ӿڶ�̬����ã�
		
*/

//���嶯����ѵ�ӿ�
interface AnimalTrain{
	public abstract void jump();
}

//������ʵ�ֽӿ�
abstract class  Dog implements AnimalTrain{
	
}

class Cat implements AnimalTrain{
	public void jump(){
		System.out.println("è����������");
	}
}

class InterfaceDemo{
	public static void main(String[] args){
		//AnimalTrain at = new AnimalTrain(); //InterfaceDemo.java:29: ����: AnimalTrain�ǳ����; �޷�ʵ����
		//at.jump();
		AnimalTrain cart = new Cat();
		cat.jump();
		
	}
}