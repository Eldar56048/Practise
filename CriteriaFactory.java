package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFactory {
    List<User> users=new ArrayList<User>();
    public List<User> getCriteria(String criteriatype, List<User> users){
        if(criteriatype == null){
            return null;
        }
        if(criteriatype.equalsIgnoreCase("MAN")){
            CriteriaMan criteriaMan=new CriteriaMan();
             return  criteriaMan.meetcriteria(users);

        } else if(criteriatype.equalsIgnoreCase("WOMEN")){
            CriteriaWomen criteriaWomen=new CriteriaWomen();
            return  criteriaWomen.meetcriteria(users);


        } else if(criteriatype.equalsIgnoreCase("SINGLE")){
            CriteriaSingle criteriaSingle=new CriteriaSingle();
            return  criteriaSingle.meetcriteria(users);
        }

        return null;
    }
}
