package model;

public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void swim() {
		// 游泳
		System.out.println("鸭子在游泳");
	}

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}
	
	public void setFlyBehavior(FlyBehavior behavior){
		this.flyBehavior = behavior;
	}

}
