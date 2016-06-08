package model;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWings();
	}
	
	@Override
	public void display(){
		System.out.println("一只红头鸭出现了");
	}
}