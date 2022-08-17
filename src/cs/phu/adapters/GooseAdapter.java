package cs.phu.adapters;

import cs.phu.animals.decorators.Quackable;
import cs.phu.animals.Goose;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
