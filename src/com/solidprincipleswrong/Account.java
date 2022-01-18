package com.solidprincipleswrong;

public class Account {
    private String id;
    private String password;

    void setup(String id,String password){
        this.id = id;
        this.password= password;
    }
    String getloginId() {
        return id;
    }
    String getPassword(){
        return password;
    }
    //violation of SRP
    boolean validate(String id, String password){
        return this.id.equals(id) && this.password.equals(password);
    }
    String login(String id, String password){
        if(validate(id,password))
            return "Login Succesfull";
        else
            return "Login Unsuccessfull";
    }
}
