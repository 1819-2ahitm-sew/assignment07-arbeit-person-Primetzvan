class Person {

    private String vorname;
    private String nachname;


    public Person(String vorname, String nachname) {
        this.setVorname(vorname);
        this.setNachname(nachname);
    }

    public Person() {
        this.setVorname("");
        this.setNachname("");
    }

    public String toString(){
        return this.getVorname() + " " + this.getNachname();
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