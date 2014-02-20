package version5;

public class RubberDuck implements QuackOnlyGroup {

    
        private QuackBehavior quackBehavior;
    
        @Override
        public void display() {
		System.out.println("I'm a Rubber Duck");
        }
        @Override
        public void swim(){
                System.out.println("I Float");
        }
        @Override
        public void performQuack() {
        this.quackBehavior.quack();
    }

    public RubberDuck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
