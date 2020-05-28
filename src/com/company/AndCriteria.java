package com.company;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }


    @Override
    public List<User> meetcriteria(List<User> users) {
        List<User> firstcriteriaUsers=criteria.meetcriteria(users);
        System.out.println("In and criteria method");
        return otherCriteria.meetcriteria(firstcriteriaUsers);

    }
}
