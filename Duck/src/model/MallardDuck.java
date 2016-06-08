package model;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWings();
	}
	
	@Override
	public void display(){
		System.out.println("一只绿头鸭出现了");
	}

}
