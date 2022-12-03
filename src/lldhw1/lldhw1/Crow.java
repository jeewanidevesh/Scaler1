package lldhw1.lldhw1;

import lldhw1.Eater;
import lldhw1.Flyable;
import lldhw1.FlyingBehaviour;

public class Crow extends Bird implements Flyable, Eater {
    FlyingBehaviour fb;

    Crow(FlyingBehaviour fb){
        this.fb=fb;
    }

}
