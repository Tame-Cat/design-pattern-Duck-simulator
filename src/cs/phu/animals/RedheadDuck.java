package cs.phu.animals;

import cs.phu.animals.decorators.Quackable;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
