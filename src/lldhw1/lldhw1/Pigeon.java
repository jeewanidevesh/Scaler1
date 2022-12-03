package lldhw1.lldhw1;

import lldhw1.Flyable;
import lldhw1.FlyingBehaviour;

public class Pigeon extends Bird implements Flyable {
    FlyingBehaviour fb;

    Pigeon(FlyingBehaviour fb){
        this.fb=fb;
    }
}
