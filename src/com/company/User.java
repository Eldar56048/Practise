package com.company;

public class User {
    private String Name;
    private String gender;
    private String status;

    public User(String Name,String gender, String status){
        this.Name=Name;
        this.gender=gender;
        this.status=status;
    }

    public String getName(){
        return Name;
    }

    public String getGender(){
        return gender;
    }

    public String getStatus(){
        return status;
    }


}
