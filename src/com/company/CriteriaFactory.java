package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFactory {
    List<User> users=new ArrayList<User>();
    public Criteria getCriteria(String criteriatype, List<User> users){
        if(criteriatype == null){
            return null;
        }
        if(criteriatype.equalsIgnoreCase("MAN")){
            return new CriteriaMan(users);

        } else if(criteriatype.equalsIgnoreCase("WOMEN")){
            return new CriteriaWomen(users);

        } else if(criteriatype.equalsIgnoreCase("SINGLE")){
            return new CriteriaSingle(users);
        }

        return null;
    }
}
