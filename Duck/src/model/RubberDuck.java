package model;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWings();
	}
	
	@Override
	public void display(){
		System.out.println("一只橡皮鸭出现了");
	}
}
