package s21.lymondka;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class PetCharact {
    static ArrayList<String> typeList = new ArrayList<String>(List.of("dog", "cat"));
    String type;
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int countPets = readInt(input);
        List<Animal> petList =
        IntStream.range(0, countPets).mapToObj(i->addPet(readPetCharact(input))).filter(Objects::nonNull).toList();
        petList.stream().forEach(p->System.out.println(p));
        input.close();
    }

    public static int readInt(Scanner input) {
        int n = 0;
        while (input.hasNext()) {
            try {
                n = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Couldn't parse a number. Please, try again");
                input.next(); //очищаем буффер ввода
            }
        }
        return n;
    }

    public static Animal addPet(PetCharact pet) {
        if (pet == null) return null;
        return switch (pet.type) {
            case "dog" -> new Dog(pet.name, pet.age);
            case "cat" -> new Cat(pet.name, pet.age);
            default -> new Cat("-999", -999);
        };
    }

    public static PetCharact readPetCharact(Scanner input) {
        PetCharact pet = new PetCharact();
        pet.type = input.next().toLowerCase();
        if (!PetCharact.typeList.contains(pet.type)) {
            System.out.println("Incorrect input. Unsupported pet type");
            pet = null;
        } else {
            pet.name = input.next();
            pet.age = readInt(input);
            if (pet.age <= 0) {
                System.out.println("Incorrect input. Age <= 0");
                pet = null;
            }
        }
        return pet;
    }
}

