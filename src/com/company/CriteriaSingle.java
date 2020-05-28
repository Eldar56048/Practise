package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    List<User> SingleUsers=new ArrayList<User>();
    public CriteriaSingle(){

    }
    public CriteriaSingle(List<User> users){
        meetcriteria(users);
    }
    @Override
    public List<User> meetcriteria(List<User> users) {
        List<User> singleUsers=new ArrayList<User>();

        for(User user:users){
            if(user.getStatus().equalsIgnoreCase("SINGLE")){
                singleUsers.add(user);
            }
        }
        System.out.println("In Single criteria method");
        return singleUsers;
    }
}
