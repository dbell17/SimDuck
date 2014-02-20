package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            
//                DuckService service = new DuckService();
//		Duck mallard = new MallardDuck();
            
            QuackOnlyGroup duck1 = new RubberDuck(new Squeak());
            FlyAndQuackGroup mallard1 = new MallardDuck(new Quack(), new FlyWithWings());
            
            
                
                
//                service.fly(mallard);
//                service.quack(mallard);
                
//		mallard.display();
//		mallard.performQuack();
//		mallard.performFly();
//                mallard.setFlyBehavior(new FlyRocketPowered());
//                mallard.setQuackBehavior(new Squeak());

//		Duck model = new ModelDuck();
		mallard1.display();
		mallard1.performFly();
                mallard1.performQuack();
		mallard1.setFlyBehavior( new FlyRocketPowered() );
		mallard1.performFly();
                mallard1.setQuackBehavior(new Squeak());
                mallard1.performQuack();
	}

}
