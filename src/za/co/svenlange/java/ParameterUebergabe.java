package za.co.svenlange.java;

public class ParameterUebergabe extends Oberklasse {
    public static void main(String[] args) {
        new ParameterUebergabe().say(3);
        new ParameterUebergabe().say("3");
    }
}

class Oberklasse {
    <T> void say(T a) {
        System.out.println("1");
    }

    void say(String a) {
        System.out.println("2");
    }
}