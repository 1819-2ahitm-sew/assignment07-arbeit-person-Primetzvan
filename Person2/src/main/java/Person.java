abstract class Person {

    private String vorname;
    private String nachname;

    public String toString() {
        return "Schüler: " +  this.getVorname() + " " + this.getNachname();
    }

    public Person(String vorname, String nachname) {
        setVorname(vorname);
        setNachname(nachname);
    }

    public Person() {
        this.setVorname("");
        this.setNachname("");
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
class Student extends Person {
    public Student(String vorname, String nachname) {
        super(vorname,nachname);
        String universitaet;
        int matrikelNr;
        String studienfach;
    }

    @Override
    public String toString() {
        return "Student: " + this.getVorname() + " " + this.getNachname();
    }

}


class Schueler extends Person {
    public Schueler(String vorname, String nachname) {
        super(vorname,nachname);
        String schuele;
        String klasse;
        int katalogNr;
    }


}