package Final_java.Core.Models.Types;

import java.time.LocalDate;
import java.util.ArrayList;

import Final_java.Core.Models.Command;
import Final_java.Core.Models.Behavior.IRunable;
import Final_java.Core.Models.Behavior.IVoiceble;
import Final_java.Core.Models.Classes.AnClass;
import Final_java.Core.Models.Classes.PackAnimal;

public class Donkey extends PackAnimal implements IRunable, IVoiceble {
    public Donkey(String name, LocalDate birthday) {
        super.name = name;
        super.birthday = birthday;
        super.anClass = AnClass.PACKANIMAL;
        super.commands = new ArrayList<>();
        voice();
        run();
        carryLoad();
    }

    @Override
    public void voice() {
        super.addCommand(new Command("Голос","Иии-ааа"));
    }

    @Override
    public void run() {
        super.addCommand(new Command("Бежать/идти","Еле идет с неохотой"));
    }
}
