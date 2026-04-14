package s21.lymondka;

/*
 * Программа считывает количество питомцев.
 * Программа считывает тип вводимого питомца: dog/cat.
 * Каждый питомец добавляется в общий список pets.
 * Если ввели неправильный тип питомца,
 * ** то программа выводит: «Incorrect input. Unsupported pet type» и переходит к следующему вводу.
 * Если ввели отрицательный или нулевой возраст
 * ** то программа выводит: «Incorrect input. Age <= 0» и переходит к следующему вводу.
 * Программа не завершается с ошибкой при некорректных входных данных
 * ** Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
 * Программа должна вывести информацию о каждом питомце.
 * Программа работает со ссылочными типами данных.
 * */

import java.util.*;

class PetCharact {
    String type;
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("\t enter count pets = ");
        int countPets = readInt(input);
        List<Animal> petList =  new ArrayList<>();
        while (countPets-- > 0) {
            PetCharact pet = readPetCharact(input);
            if (pet != null)
                petList.add(addPet(pet));
        }
        for (var pet : petList) {
            System.out.println(pet.toString());
        }
        input.close();
    }

    public static PetCharact readPetCharact(Scanner input) {
        List<String> petType = List.of("cat", "dog");
        PetCharact pet = new PetCharact();
        pet.type = input.next().toLowerCase();
        if (!petType.contains(pet.type)) {
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
}