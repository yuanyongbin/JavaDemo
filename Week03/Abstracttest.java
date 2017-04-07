class Animal{
    private String name;
    private int age;
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Cat extends Animal{
	public Cat(String name,int age){
		super(name,age);
	}
    public void voice(){
        System.out.println(super.getName() + " ß÷");
    }
    public void eat(){
        System.out.println(super.getName() + " fish");
    }
}

class Dog extends Animal{
	public Dog(String name,int age){
		super(name,age);
	}
    public void voice(){
        System.out.println(super.getName() + " Íô");
    }
    public void eat(){
        System.out.println(super.getName() + " Bone");
    }
}

class app{
    public static void main(String[] args){

    }
}