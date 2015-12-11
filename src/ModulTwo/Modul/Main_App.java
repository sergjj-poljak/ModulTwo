package ModulTwo.Modul;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Admin on 11.12.2015.
 */
public class Main_App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kanalu kanalu = new Kanalu();
        kanalu.getByCategory("ICTVm");
        kanalu.getByCategory("ICTVtu");
        kanalu.getByCategory("ICTVw");
        kanalu.getByCategory("ICTVth");
        kanalu.getByCategory("ICTVf");
        kanalu.getByCategory("ICTVse");
        kanalu.getByCategory("ICTVsu");

        kanalu.getByCategory("NovuyKm ");
        kanalu.getByCategory("NovuyKtu");
        kanalu.getByCategory("NovuyKw ");
        kanalu.getByCategory("NovuyKth");
        kanalu.getByCategory("NovuyKf ");
        kanalu.getByCategory("NovuyKse");
        kanalu.getByCategory("NovuyKsu");

        kanalu.getByCategory("TETm ");
        kanalu.getByCategory("TETtu");
        kanalu.getByCategory("TETw ");
        kanalu.getByCategory("TETth");
        kanalu.getByCategory("TETf ");
        kanalu.getByCategory("TETse");
        kanalu.getByCategory("TETsu");

        kanalu.getByCategory("K1m ");
        kanalu.getByCategory("K1tu");
        kanalu.getByCategory("K1w ");
        kanalu.getByCategory("K1th");
        kanalu.getByCategory("K1f ");
        kanalu.getByCategory("K1se");
        kanalu.getByCategory("K1su");

        kanalu.getByCategory("CTBm ");
        kanalu.getByCategory("CTBtu");
        kanalu.getByCategory("CTBw ");
        kanalu.getByCategory("CTBth");
        kanalu.getByCategory("CTBf ");
        kanalu.getByCategory("CTBse");
        kanalu.getByCategory("CTBsu");

        System.out.println("Виберiть канал зi списку, телепрограму якого вы б хотiли дiзнатись: \n ICTV \n NovuyK \n TET \n K1 \n CTB");
        String kanal = sc.next();

        System.out.println("Введiть день на який вам потрiбна програма,\n для цього введiть команду:\nПонедiлок - m;\nВiвторок - tu;" +
                "\nСереда - w;\nЧетвер - th;\nПятниця - f;\nСубота - se;\nНедiля - su;");

        String day = sc.next();

        List<Programma> found = kanalu.getByCategory(kanal+day);
        for (Programma programma : found) {
            System.out.println(programma);

        }
    }
}
