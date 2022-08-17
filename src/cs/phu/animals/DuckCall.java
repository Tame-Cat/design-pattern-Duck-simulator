package cs.phu.animals;

import cs.phu.animals.decorators.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
