package com.solidprincipleswrong;
import java.util.ArrayList;

public class Friends {
    ArrayList<Friend> friends= new ArrayList<Friend>();
    void viewFriends(){
        for (Friend friend:friends ){
            System.out.print(friend.id+" "+friend.name);
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

