package s21.lymondka;

import java.util.List;

public class AnimalIterator implements BaseIterator<Animal>{
    private List<Animal> pets;
    private int index;

    AnimalIterator(List<Animal> pets){
        this.pets = pets;
        this.index = 0;
    }
    public Animal next(){
        return pets.get(index++);
    }

    public boolean hasNext(){
        return (index < pets.size()) ? true : false;
    }

    public void reset(){
        index = 0;
    }

}