import java.util.ArrayList;

public class MainEntryPoint {
    //Almost every program will need a main method, and everything in java exists inside a class.
    //Here's our main method, note that the signature will almost always be exactly this:
    public static void main(String[] args) {
        //public because it must be accessible from outside this file
        //static because we aren't yet instantiating objects, so it must be associated with the class itself
        //void because the main method never returns anything
        //String[] in the parameter list, this is where command line args go

        //This loop iterates through the string array of command line args and prints them.
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        if(args.length >= 2 && args[0].equals("dog")) {
            Dog myDogSasha = new Dog(args[1]);//Here we are creating and using a string object.
            myDogSasha.makeSound();
        }


        for(int x = 0; x < 10; x++) {
            System.out.println(x);
        }


        //Runtime Polymorphism - We can have a reference to Animal that points to a dog.
        Animal myPetJimmy = new Dog("Jimmy");//Here we are simply using what's called a "string literal"

        //We can then change this object later, this is polymorphism.
        //(This is a very basic example that frankly serves no purpose.
        myPetJimmy = new Cat("Jimmy");




        myPetJimmy.makeSound();

        StaticExample objA = new StaticExample();
        StaticExample objB = new StaticExample();

        System.out.println("Non-static members: " + objA.getNonStaticInt() + ", " + objB.getNonStaticInt());
        System.out.println("Static member: " + objA.getStaticInt() + ", " + objB.getStaticInt());


        objA.setNonStaticInt(6);
        objB.setNonStaticInt(7);
        objB.setStaticInt(20);
        objA.setStaticInt(10);


        System.out.println("Non-static members: " + objA.getNonStaticInt() + ", " + objB.getNonStaticInt());
        System.out.println("Static member: " + objA.getStaticInt() + ", " + objB.getStaticInt());


        //primitives, wrappers, and boxing
        int i = 5;
        Integer myInteger = i;

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(i);
        myArrayList.add(5);
        myArrayList.add(myInteger);









    }
}
