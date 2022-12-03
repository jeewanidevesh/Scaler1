package lldhw1.lldhw1;

import lldhw1.FlyingBehaviour;

public class Sparrow extends Bird implements Flyable{
    FlyingBehaviour fb;

    Sparrow(FlyingBehaviour fb){
        this.fb=fb;
    }
}
