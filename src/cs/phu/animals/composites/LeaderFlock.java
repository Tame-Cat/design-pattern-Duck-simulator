package cs.phu.animals.composites;

import cs.phu.animals.decorators.Quackable;


public class LeaderFlock extends Flock {
    @Override
    public void quack() {
        int sizeQuackers = quackers.size();
        for(int i = 0 ; i < sizeQuackers ; i++){
            Quackable quacker = (Quackable)quackers.get(i);
            if(i==0){
                quacker.quack();
                quacker.quack();
                quacker.quack();
                System.out.println("------------leader-------------");
            }else {
                quacker.quack();
            }
        }
    }
}
