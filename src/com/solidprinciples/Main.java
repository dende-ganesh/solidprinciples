package com.solidprinciples;

public class Main {

    public static void main(String[] args) {
        AccountInfoSetter acc = new Account();
        CreateAccount account = new Signup(acc);
        account.createaccountUsingEmail("temp@mail.com", "12345");
        System.out.println("Account created");
        LoginUser login = new LoginUser(acc);
        boolean validte = login.validate("temp@mail.com", "12345");
        if (validte) {
            System.out.println("login succesfull");
            ImagePost newimage=new ImagePost();
            newimage.createPost("Nature","coorg");
            VideoPost newvideo=new VideoPost(3.3f);
            newvideo.createPost("new video","chilling");
            Friends f = new Friends();
            f.addFriend(new Friend("12345","ganesh"));
            f.addFriend(new Friend("45678","rahulkl"));
            System.out.println("following userids are friends : ");
           f.viewFriends();
           Share s=new Share(new Whatsapp());
           s.share();
        } else {
            System.out.println("Login failed");
        }
    }
}
