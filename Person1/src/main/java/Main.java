import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String FILENAME ="personen.csv";

        int lines = countLines(FILENAME) - 1;
        Person [] personen = new Person[lines];

        readFile(FILENAME, personen);

        for (int i = 0; i < personen.length; i++) {
            System.out.println(personen[i].toString());
        }

    }

    private static int countLines(String Filename) {
        int lines = 0;
        try (Scanner scanner = new Scanner(new FileReader(Filename) )) {
            while (scanner.hasNextLine()){
                lines++;
                String line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lines;
    }

    private static void readFile(String filename, Person[] liste) {


        try (Scanner scanner = new Scanner(new FileReader(filename) )) {
            scanner.nextLine();
            for (int j = 0; j < liste.length; j++) {

                String line = scanner.nextLine();
                String [] elements = line.split(";");
                Person p = new Person(elements[0],elements[1]);
                liste[j] = p;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
