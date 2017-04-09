package cn.itcast_animal;

import com.liuyi_02.Animal;
import com.liuyi_02.Cat;
import com.liuyi_02.Dog;



public class AnimalDemo {
	public static void main(String[] args){
		Animal a = new Cat();
		a.eat();
		a.sleep();
		System.out.println("----------------");
		Animal a2 = new Dog();
		a2.eat();
		a2.sleep();
		System.out.println("------------------");
		Dog d = (Dog)a2;
		d.eat();
		d.sleep();
		d.jump();
		
	}
}
