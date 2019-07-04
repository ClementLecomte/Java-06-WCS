package fr.java06;

public class Wilder {

    private String firstName;
    private boolean aware;


    protected Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    private String getFirstName() {
        return firstName;
    }

    private boolean isAware() {
        return aware;
    }

    protected String whoami() {
        if (this.isAware() ) {
            return "Je m'appelle " + this.getFirstName()  + " et je suis aware ";

        } else {
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
        }
    }
}