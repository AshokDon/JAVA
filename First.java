//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Calculator{
    int a; // properties

    public int add(int n1, int n2){ // methods // behaviour 
        int res = n1 + n2;
        return res;
    }
}
public class Main {
    public static void main(String[] args) {

        //java is an object oriented programming language
        //what do we mean by object
        //in real world every thing is an object like example pan , book , mouse ...
        //now evey things has two things in fact every object has two things
        //1. an object knows something 2.an object does something
        //simply like properties (knows something) and behaviour(do something)
        //now in java we treat every thing as an object
        //example:
        //add two numbers
        //now how do we create an objet -> to create an object we have to first create a class
        int num1 = 5;
        int num2 = 4;

        Calculator cal = new Calculator(); // creating an object

        int res = cal.add(num1,num2);
        System.out.println(res);

    }
}
