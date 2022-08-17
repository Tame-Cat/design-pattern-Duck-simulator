package cs.phu.factories;

import cs.phu.animals.decorators.QuackCounter;
import cs.phu.animals.decorators.Quackable;
import cs.phu.animals.DuckCall;
import cs.phu.animals.MallardDuck;
import cs.phu.animals.RedheadDuck;
import cs.phu.animals.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
