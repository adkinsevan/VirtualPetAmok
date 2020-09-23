package PetShelter;

import java.util.Collection;
import java.util.Scanner;

public class PetShelterApp {
    public static void main(String[] args) {
        System.out.println("Thank you for volunteering with Barely Used Pets");
        System.out.println();

        PetShelter myShelter = new PetShelter();
        Scanner input = new Scanner(System.in);

        myShelter.addPet("Maya", new Dog("Maya","The little dog with big attitude",2));
        myShelter.addPet("Elena", new Dog("Elena", "She's here, she's a dog, she's relaxed, and she loves everyone",2));
        myShelter.addPet("Singer", new Cat("Singer", "The vocal cat who will not stop asking you for food"));
        myShelter.addPet("Tyson", new RoboCat("Tyson", "He's been rebuilt. A robot cat that want to destroy. He has the same attitude, but is even heavier"));
        myShelter.addPet("Q", new RoboDog("Q", "Very mysterious robot dog, he doesn't bark just grunts"));

        System.out.println("Here are the pets we have:");
        System.out.println();
        Collection<PetShelterAnimals> pets = myShelter.getAllAnimals();
        for (PetShelterAnimals pet : pets){
            System.out.println((pet.getName()) + ": " + pet.getDescription() + "\n");
        }
        System.out.println("Would you like to send a pet out for adoption, or take in a new pet? (Y/N)");
        String adoptionOption = input.nextLine();

        while (adoptionOption.equalsIgnoreCase("Y")){
            System.out.println("What would you like to do?");
            System.out.println("1: Send out a pet for adoption");
            System.out.println("2: Take in a new pet");
            System.out.println("3: Continue without adopting");
            String subAdopt = input.nextLine();
            while (!subAdopt.equals("3")){
                if (subAdopt.equals("1")){
                    System.out.println("Who is ready for adoption?");
                    System.out.println();
                    for (PetShelterAnimals pet : pets){
                        System.out.println((pet.getName()) + "\n");
                    }
                    String petOption = input.nextLine();
                    myShelter.getAllAnimals();
                    myShelter.remove(petOption);
                }
                else if (subAdopt.equals("2")){
                    System.out.println("Which type of pet do you wish to take in?");
                    System.out.println();
                    System.out.println("1: Cat");
                    System.out.println("2: Dog");
                    System.out.println("3: Robot Cat");
                    System.out.println("4: Robot Dog");
                    System.out.println("5: Go Back");
                    String petType = input.nextLine();
                    System.out.println("What would you like to name our new rescue?");
                    String petName = input.nextLine();
                    System.out.println("Please give our rescue a short description");
                    String petDescription = input.nextLine();
                    if (petType.equals("1")){
                        myShelter.addPet(petName, new Cat(petName,petDescription));
                    }
                    else if (petType.equals("2")){
                        myShelter.addPet(petName, new Dog(petName,petDescription,2));
                    }
                    else if (petType.equals("3")){
                        myShelter.addPet(petName, new RoboCat(petName,petDescription));
                    }
                    else if (petType.equals("4")){
                        myShelter.addPet(petName, new RoboDog(petName,petDescription));
                    }
                    else if (petType.equals("5")){
                        System.out.println("What would you like to do?");
                        System.out.println("1: Send out a pet for adoption");
                        System.out.println("2: Take in a new pet");
                        System.out.println("3: Continue without adopting");
                        subAdopt = input.nextLine();
                    }
                    else{
                        System.out.println("Which type of pet do you wish to take in?");
                        System.out.println();
                        System.out.println("1: Cat");
                        System.out.println("2: Dog");
                        System.out.println("3: Robot Cat");
                        System.out.println("4: Robot Dog");
                        System.out.println("5: Go Back");
                        petType = input.nextLine();
                        System.out.println("What would you like to name our new rescue?");
                        petName = input.nextLine();
                        System.out.println("Please give our rescue a short description");
                        petDescription = input.nextLine();
                        if (petType.equals("1")){
                            myShelter.addPet(petName, new Cat(petName,petDescription));
                        }
                        else if (petType.equals("2")){
                            myShelter.addPet(petName, new Dog(petName,petDescription,2));
                        }
                        else if (petType.equals("3")){
                            myShelter.addPet(petName, new RoboCat(petName,petDescription));
                        }
                        else if (petType.equals("4")){
                            myShelter.addPet(petName, new RoboDog(petName,petDescription));
                        }
                    }
                    System.out.println("What would you like to work on next?");
                    System.out.println();
                    System.out.println("1: Give the organic pets some water");
                    System.out.println("2: Play with the Cats or Dogs");
                    System.out.println("3: Oil and Maintain the Robotic Pets");
                    System.out.println("4: Feed the organic pets");
                    System.out.println("5: Help a pet get adopted");
                    System.out.println("6: Take in new pets");
                    System.out.println("7: Go home for today");

                }
            }
        }


    }
}
