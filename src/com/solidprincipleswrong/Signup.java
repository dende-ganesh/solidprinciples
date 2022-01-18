package com.solidprincipleswrong;

public class Signup {
    Account newacc=new Account();
    Account createAccountUsingEmail(String email,String password){ //violation of open closed principle
        newacc.setup(email,password);
        return newacc;
    }
}
