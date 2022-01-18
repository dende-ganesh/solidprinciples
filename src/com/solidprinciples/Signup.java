package com.solidprinciples;

public class Signup implements CreateAccount{
    AccountInfoSetter account;
    Signup(AccountInfoSetter account){
        this.account=account;
    }
    @Override
    public void createaccountUsingEmail(String email, String password){
        account.setup(email,password);
    }
    @Override
    public void createaccountUsingPhone(String phone, String password){
        account.setup(phone,password);
    }
}
