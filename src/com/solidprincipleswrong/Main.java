package com.solidprincipleswrong;

public class Main {

    public static void main(String[] args) throws Exception{
        Account newacc=new Signup().createAccountUsingEmail("temp@gmail.com","1234");
        String loginMessage=newacc.login("temp@gmail.com","1234");
        System.out.println(loginMessage);
        System.out.println("Creating Image post");
        ImagePost img=new ImagePost();
        img.createPost("new image","chilling");
        img.viewPost();
        System.out.println("List of friends");
        Friends f=new Friends();
        f.addFriend(new Friend("2345","ganesh"));
        f.addFriend(new Friend("4567","rahul"));
        f.deleteFriend("4567");
        f.viewFriends();
        Share newshare=new Share(new Whatsapp());
        newshare.share();


    }
}
