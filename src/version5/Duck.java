package version5;

/**
 * The main difference with this 5th version is that the class
 * provides methods for setting fly and quack behaviors at runtime.
 * Otherwise, everything else is the same.
 * 
 * @author jlombardo
 *
 */
public interface Duck  {
	// Instance variables of interface type
	// Each duck has a reference to something that implements the behaviors
	// via an interface. Hey, isn't this composition the DIP way!!!
	// Only problem is we still have the limitation that all Ducks
	// have fly and quack behaviors, even thought that is not always needed.
//	private FlyBehavior flyBehavior;
//	private QuackBehavior quackBehavior;
	
	//public Duck() {}
	
//	public abstract void setFlyBehavior(FlyBehavior fb);// {
 	//	flyBehavior = fb;
	//}
	
//	public abstract void setQuackBehavior(QuackBehavior qb);
//        {
//		quackBehavior = qb;
//	}
	
	public abstract void display();
	
	/*
	 * Rather than handling the quack behavior itself, the Duck object
	 * delegates that behavior to the object referenced by quackBehavior.
	 * This object is unknown -- that's DIP in action!
	 */
//	public abstract void performQuack();
//{
//		quackBehavior.quack();
//	}
	
//	public abstract void performFly();
//        {
//		flyBehavior.fly();
//	}
//	
	public abstract void swim();
//        {
//		System.out.println("All ducks float, even decoys!");
//	}
//	
	
	// OTHER DUCK-LIKE METHODS
}
