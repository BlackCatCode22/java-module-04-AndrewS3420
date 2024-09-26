package andrew.zoo.com;

// AS 9/26/24
//App.java
// Driver File for the zoo midterm program

public class App {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my Zoo Programn!\n");

        andrew.zoo.com.Animal myAnimal = new andrew.zoo.com.Animal();
        myAnimal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        andrew.zoo.com.Animal anotherAnimal = new andrew.zoo.com.Animal("zig");
        System.out.println("\n the name of the secound animal is " + anotherAnimal.getAnimalName());

        // Create a Hyena with a name
        andrew.zoo.com.Hyena aNewHyena = new andrew.zoo.com.Hyena("Kamari");

        System.out.println(" the new Hyena's name is: " + aNewHyena.getAnimalName());


        }
    }
