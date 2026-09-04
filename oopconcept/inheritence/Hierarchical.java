class Animal{
    String color;
    Animal(String color){
        this.color=color;
    }
    void eat(){
        System.out.println("eating meat");
        System.out.println("Color: " + color);
    }
}
class cat extends Animal{
    String sound;
    cat (String sound, String color){
        super(color);
        this.sound=sound;
    }
    void meow(){
        System.out.println("Meowing: " + sound);
    }

}
class dog extends Animal{
    String play;
    dog(String play,String colour){
        super(colour);
        this.play=play;

    }
    void play(){
        System.out.println("Playing: " + play);
        System.out.println("Color: " + color);
    }
}
public class Hierarchical{
    public static void main (String args[]){
        cat c=new cat("meow","black");
        c.eat();
        c.meow();
        dog d=new dog("wag tail","brown");
        d.eat();
        d.play();
    }
}