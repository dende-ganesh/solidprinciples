package com.solidprinciples;

public class Posts  {
    String postTitle;
    String postDescription;
    public void createPost(String PostTitle,String postDescription){
        this.postTitle=PostTitle;
        this.postDescription=postDescription;
    }

    public void deletePost(String postId){
        //finds post and delete it
    }
    public void editPost(){
    }
}
