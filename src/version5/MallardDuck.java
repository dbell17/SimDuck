package version5;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */	
public class MallardDuck implements FlyAndQuackGroup{
    
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
	
        @Override
	public void display() {
		System.out.println("I'm a Mallard Duck");
	}

    
    @Override
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    
    @Override
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    
    @Override
    public void performFly() {
        this.flyBehavior.fly();
    }

    
    @Override
    public void performQuack() {
        this.quackBehavior.quack();
    }

    @Override
    public void swim() {
        System.out.println("Mallard duck Swimming!!!");
    }

        
	
}
