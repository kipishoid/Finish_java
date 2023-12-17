package Final_java.Core.MVC.View;

import Final_java.Core.Infrastructure.Repository;
import Final_java.Core.Models.Animal;

public interface IView {
    void showMenu(int menu);
    void refresh();
    void setCurrIndex(int value);
    void printAnimals(Repository animals);
    void printCommands(Animal animal);
    void print(String value);
    String inputText(String text);
}
