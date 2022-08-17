package cs.phu.animals.decorators;

public class QuackEcho implements Quackable {
    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        int numEcho = 2;
        for(int i = 0 ; i < numEcho ; i++){
            if(i > 0) {
                System.out.printf("Echo: ");
            }
            duck.quack();
        }
    }
}
