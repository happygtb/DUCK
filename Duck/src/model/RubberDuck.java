package model;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWings();
	}
	
	@Override
	public void display(){
		System.out.println("һֻ��ƤѼ������");
	}
}
