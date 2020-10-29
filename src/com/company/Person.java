package com.company;

public class Person {
    public String name;

    private Integer age;

    public Person(String _name) {
        name = _name;
        System.out.println("Person is created");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer _age) {
        // set age to 0 if the _age is invalid ( less than zero and greater than 100)

        if ( _age < 0 || _age > 100) {
            age = 0;
        } else {
            age = _age;
        }
       // Alternative method to simple if/ else  - known as ternary operator
       // age = _age < 0 || _age > 100 ? 0 : age;
    }

}
