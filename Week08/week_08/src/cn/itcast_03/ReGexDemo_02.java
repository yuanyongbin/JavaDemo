package cn.itcast_03;

import java.util.Scanner;

/*
 * �ָ�ܣ�
 * 		public String[] split(String regex)���ݸ���������ʽ��ƥ���ִ��ַ�����
 */
public class ReGexDemo_02 {
	public static void main(String[] args) {
		//����һ������������Χ��
		String ages = "18-24";
		
		//�������
		String reges = "-";
		//���÷�����
		String[] ageArray = ages.split(reges);
		
		for(int x = 0;x < ageArray.length;x++){
			System.out.println(ageArray[x]);
		}
		//�ַ���ת����
		int stratAge = Integer.parseInt(ageArray[0]);
		int endAge = Integer.parseInt(ageArray[1]);
		Scanner sc = new Scanner(System.in);
		boolean yes = false;
		do{
			
			System.out.println("�����������ҵĶ�������䣺");
			int age = sc.nextInt();
			if(age >= stratAge && age <= endAge){
				System.out.println("hello ���Ҹ���");
			}else{
				System.out.println("ʲô���� gun");
			}
			while(true){
				Scanner sc1 = new Scanner(System.in);
				System.out.println("����Y/N ��������(Y�������ҡ�N�˳�����)");
				String Y = sc1.nextLine();
				char[] chs = Y.toCharArray();
				char ch1 = chs[0];
				if(ch1 == 'Y' || ch1 == 'y'){
					yes = true;
					break;
				}else if(ch1 == 'N'|| ch1 == 'n'){
					yes = false;
					break;
				}else{
					System.out.println("���������������룺");
				}
			}
					
		}while(yes);
	System.out.println("��ӭ�´ι���");	
	}

}
