package com.solidprinciples;
class Account implements AccountInfoSetter {
    private String id;
    private String password;
    @Override
    public void setup(String id,String password) {
        this.id =id;
        this.password=password;
    }

    @Override
    public String getloginId() {
        return id;
    }
    public String getPassword(){
        return password;
    }


}
