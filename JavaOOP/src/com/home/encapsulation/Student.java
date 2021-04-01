package com.home.encapsulation;

class Student{
    private int id, age, score;
    private String name, address; // id, name, age, address, score attributes describe the ID, name, age, address and score respectively of a student
    
    public Student(){ // Student() is the no-arg constructor
        
    }
    
    public Student(int id, String name, int age, String address, int score){ // constructor parameter is used to initialize values to the following attributes id, name, age, address, score
        this.id = id;                       
        this.name = name;
        this.age = age;
        this.address = address;
        this.setScore(score);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setScore(int score){ // the score is guaranteed to be greater than 0 and less than or equal to 10 (if score < 0, assign 0 to score, if score > 10, assign 10 to score)
        if (score < 0) score = 0;
        if (score > 10 ) score = 10;
        this.score  = score;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getScore(){
        return score;
    }
}
