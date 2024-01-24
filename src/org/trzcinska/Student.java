package org.trzcinska;
public class Student implements Comparable<Student>{
    private int age;
    private int height;
    private String name;
    private String lastName;
    public void setAge(int newAge){
        age = newAge;
    }
    public void setHeight(int newHeight){
        height = newHeight;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student o) {
        //compare by LastName
        int lastNameCheck = this.lastName.compareTo(o.lastName);
        if (lastNameCheck != 0) {
            return lastNameCheck;
        }
        //compare by age
        return Integer.valueOf(this.age).compareTo(Integer.valueOf(o.age));
    }
}
