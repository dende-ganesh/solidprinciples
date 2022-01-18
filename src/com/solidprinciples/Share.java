package com.solidprinciples;

public class Share {
    Ishare ishare;
    Share(Ishare ishare){
        this.ishare=ishare;
    }
    void share(){
        ishare.share();
    }
}
