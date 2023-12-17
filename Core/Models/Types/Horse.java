package Final_java.Core.Models.Types;

import java.time.LocalDate;
import java.util.ArrayList;

import Final_java.Core.Models.Command;
import Final_java.Core.Models.Behavior.ILearnable;
import Final_java.Core.Models.Behavior.IRunable;
import Final_java.Core.Models.Behavior.IVoiceble;
import Final_java.Core.Models.Classes.AnClass;
import Final_java.Core.Models.Classes.PackAnimal;

public class Horse extends PackAnimal implements ILearnable, IRunable, IVoiceble {
    public Horse(String name, LocalDate birthday) {
        super.name = name;
        super.birthday = birthday;
        super.anClass = AnClass.PACKANIMAL;
        super.commands = new ArrayList<>();
        learn();
        voice();
        run();
        carryLoad();
    }

    @Override
    public void voice() {
        super.addCommand(new Command("Голос","Иго-го"));
    }

    @Override
    public void run() {
        super.addCommand(new Command("Бежать/идти","Бежит рысцой"));
    }

    @Override
    public void learn() {
        super.addCommand(new Command("Запомнить команду","Я могу запомнить новую команду"));
    }
}
