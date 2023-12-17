package Final_java.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import Final_java.Core.Models.Animal;

public class Repository implements IRepository {

    private List<Animal> animals;

    public Repository() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void add(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void remove(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public Animal getByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    @Override
    public Animal getById(int id) {
        if(id >= 0 && id < animals.size()) {
            return animals.get(id);
        }
        return null;
    }

    @Override
    public int getCount() {
        if(animals != null) {
            return animals.size();
        }
        return 0;
    }

    @Override
    public List<Animal> getAnimalList() {
        if(animals != null) {
            return animals;
        }
        return null;
    }

    @Override
    public void save() {
    }

    @Override
    public void load() {
    }

}
