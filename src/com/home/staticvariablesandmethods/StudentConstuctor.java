class StudentConstuctor {
    private String name;
    private char gender;
    
    public StudentConstuctor(){
        name = "Unknown";
        gender = 'u';
    }
    
    public StudentConstuctor(String name){
        this.name = name;
        this.gender = 'u';
    }
    
    public StudentConstuctor(char gender)
    {
        this.name = "Unknown";
        this.gender = gender;
    }
    
    public StudentConstuctor(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    
    public void display(){
        System.out.println("Name: " + name);
        if (gender == 'm') System.out.println("Gender: Male");
        if (gender == 'f') System.out.println("Gender: Female");
        if (gender == 'u') System.out.println("Gender: Unknown");
    }
}