package model;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWings();
	}
	
	@Override
	public void display(){
		System.out.println("һֻ��ͷѼ������");
	}
}