package Final_java.Core.Infrastructure;

import java.time.LocalDate;

import Final_java.Core.Models.Animal;

public interface ICreateAnimal {

    public Animal createAnimal(String name, String type, LocalDate birthday);

}
