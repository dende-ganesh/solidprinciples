package com.solidprincipleswrong;

public class Share { //violates dependency inversion
    Whatsapp whatsapp;
    Share(Whatsapp whatsapp){
        this.whatsapp=whatsapp;
    }
    void share(){
        whatsapp.share();
    }
}
