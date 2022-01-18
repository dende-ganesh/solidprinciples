package com.solidprinciples;

public class Friend {
    String id;
    String name;
    Friend(String id, String name){
        this.id=id;
        this.name=name;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
