package com.liuyi_02;

import com.liuyi.Jump;
/**
 * 这是具体的狗类
 * @author gzz
 * @version v1.0
 * 
 */
public class Dog extends Animal implements Jump {

	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("我是狗，我会跳");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("开始吃饭了");
	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("大家睡吧");
	}

}
