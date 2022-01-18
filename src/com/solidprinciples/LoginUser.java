package com.solidprinciples;

public class LoginUser{
    String loginId;
    String password;
    LoginUser(AccountInfoSetter account){
        loginId= account.getloginId();
        password=account.getPassword();
    }
    public boolean validate(String loginId, String password) {
        return this.loginId.equals(loginId) && this.password.equals(password);
    }
}
