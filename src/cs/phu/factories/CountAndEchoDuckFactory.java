package cs.phu.factories;

import cs.phu.animals.decorators.QuackCounter;
import cs.phu.animals.decorators.QuackEcho;
import cs.phu.animals.decorators.Quackable;
import cs.phu.animals.DuckCall;
import cs.phu.animals.MallardDuck;
import cs.phu.animals.RedheadDuck;
import cs.phu.animals.RubberDuck;

public class CountAndEchoDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
