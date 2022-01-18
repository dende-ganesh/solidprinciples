package com.solidprinciples;
import java.util.ArrayList;

public class Friends {
    ArrayList<Friend> friends= new ArrayList<Friend>();
    void viewFriends(){
        for (Friend friend:friends ){
            System.out.print(friend.getId() +" "+ friend.getName());
            System.out.println();
        }
    }
    void deleteFriend(String Id){
        friends.removeIf(friend -> Id.equals(friend.getId()));
    }
    void addFriend(Friend newfriend){
        friends.add(newfriend);
    }
}

