package andrew.zoo.com;

public class Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfAnimals = 0;

    //Create a constructor for our new Animal object
    public Animal() {
        numOfAnimals++;
    }
    

    // Create a constructor that will accept all fields as arguments
    public Animal(String sex, int age, int weight, String animalName, String animalID, String animalBirthdate, String animalColor,
                  String animalOrigin){
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthDate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;

        // origin will be a string like: "from Friguia Park, Tunisia"

    }

    // Create a few attributes (fields)
    // Sex will be 'male' or 'female'
    private String sex = "";
    // age will be years
   private int age = 0;
    // weight will be pounds
   private int weight = 0;
   // name will be a String;
    private static String animalName;
   // animalID
   private String animalID;
   // animalBirthDate is a String
    private String animalBirthDate;
   //animalColor is a string
    private String animalColor;
    // animalOrigin is a string
    private String animalOrigin;



    // Create getters and setters
    public String getAnimalOrigin(){
        return animalOrigin;
    }
    public String getAnimalColor(){
        return animalColor;
    }
    public String getAnimalBirthDate(){
        return animalBirthDate;
    }
    public String getAnimalID(){
        return animalID;
    }

    public static String getAnimalName() {
    return animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
