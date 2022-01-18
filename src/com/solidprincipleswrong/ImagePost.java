package com.solidprincipleswrong;
public class ImagePost extends Posts {
    void getDuaration() throws Exception{ //violates liskov substitution principle
        throw new Exception("no duaration for image ");
    }
}
