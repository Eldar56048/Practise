package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMan implements Criteria{

    @Override
    public List<User> meetcriteria(List<User> users) {
        List<User> MenUsers=new ArrayList<User>();
        for(User user:users){
            if(user.getGender().equalsIgnoreCase("MAN")){
                MenUsers.add(user);
            }
        }
        System.out.println("In man criteria method");
        return MenUsers;

    }

}
