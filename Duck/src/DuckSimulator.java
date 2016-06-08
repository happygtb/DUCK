import model.*;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.setQuackBehavior(new Squeak());
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.performFly();
		
		System.out.println("----------------");
		
		Duck redhead=new RedheadDuck();
		redhead.display();
		redhead.swim();
		redhead.setQuackBehavior(new Quack());
		redhead.performQuack();
		redhead.setFlyBehavior(new FlyWithWings());
		redhead.performFly();
		
		System.out.println("----------------");
		
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.swim();
		rubber.setQuackBehavior(new MuteQuack());
		rubber.performQuack();
		rubber.setFlyBehavior(new FlyWithNoWings());
		rubber.performFly();
		rubber.setFlyBehavior(new FlyWithRocket());
		rubber.performFly();
			
	}

}
