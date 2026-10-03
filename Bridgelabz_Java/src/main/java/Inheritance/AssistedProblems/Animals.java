import java.util.*;

class Animal{
    protected String name;
    protected int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal Makes sound");
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Dog extends Animal{
    
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " is Barking");
    }
}
class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println(name + "Says : Meoww");
    }
}
class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);
    }

    @Override 
    public void makeSound(){
        System.out.println(name + " Makes Sound");
    }
}
public class Animals {
    public static void main(String[] args){
        Dog dog = new Dog("Bruno" , 10);
        Cat cat = new Cat("Milo",15);
        Bird bird = new Bird("tweety",1);

        dog.display();
        dog.makeSound();

        System.out.println();

        cat.display();
        cat.makeSound();

        System.out.println();

        bird.display();
        bird.makeSound();
    }
}
