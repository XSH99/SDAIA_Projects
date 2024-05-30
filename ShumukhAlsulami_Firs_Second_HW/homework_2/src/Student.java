/*
* Create a class Student with the following private attributes:
1-String name
2-int id
3-Provide public getter methods for each attribute.
4-Provide a constructor to initialize all attributes.
*
*
*
*
* */

public class Student {
    // 1
    private String name;
    //2
    private int id;

    //3
    public String  getName(){
        return name;
    }

    public int getId(){
        return id;
    }
   //4
   public Student (String name, int id){
        this.name = name;
        this.id = id;

    }

}
