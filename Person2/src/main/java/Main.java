import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int eingabe;
        String vorname;
        String nachname;
        Scanner sc = new Scanner(System.in);
        String allpersons[] = new String[100];
        String allschueler[] = new String[100];
        String allstudents[] = new String[100];
        Person person;
        int i = 0;
        int x = 0;
        int y = 0;


        System.out.println("1 - Eingabe eines Schülers");
        System.out.println("2 - Eingabe eines Studenten");
        System.out.println("3 - Ausgabe der Liste am Bildschirm");
        System.out.println("4 - Ausgabe aller Schueler am Bildschirm");
        System.out.println("5 - Ausgabe aller Studenten am Bildschirm");
        System.out.println("6 - Beenden");

        System.out.printf("\nGeben sie nun eine Zahl ein:");
        eingabe = sc.nextInt();

        while(eingabe != 6){

        switch (eingabe) {
            case 1:
                System.out.print("Vorname: ");
                vorname = sc.next();
                System.out.print("Nachname: ");
                nachname = sc.next();
                person = new Schueler(vorname, nachname);
                allpersons[i] = person.toString();
                allschueler[x] = person.toString();
                x++;
                break;
            case 2:
                System.out.print("Vorname: ");
                vorname = sc.next();
                System.out.print("Nachname: ");
                nachname = sc.next();
                person = new Student(vorname, nachname);
                allpersons[i] = person.toString();
                allstudents[y] = person.toString();
                y++;
                break;
            case 3:
                for (int j = 0; j < i; j++) {
                    System.out.println(allpersons[j]);
                }
                break;
            case 4:
                for (int e = 0; e < x; e++) {
                    System.out.println(allschueler[e]);
                }
                break;
            case 5:
                for (int f = 0; f < y; f++) {
                    System.out.println(allstudents[f]);
                }
                break;
            default:
                System.out.println("Falsche Eingabe!");

        }

            i++;
            System.out.printf("\nGeben sie nun eine Zahl ein:");
            eingabe = sc.nextInt();

        }



        }

    }

