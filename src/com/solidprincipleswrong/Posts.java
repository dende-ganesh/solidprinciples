package com.solidprincipleswrong;

public class Posts {
    String postTitle;
    String postDescription;

    void createPost(String PostTitle,String postDescription){
        this.postTitle=PostTitle;
        this.postDescription=postDescription;
    }
    void viewPost(){
        System.out.println(postTitle+" "+postDescription);
    }
    void deletePost(){

    }
    void editPost(){

    }
    void getDuartion(){}
}
