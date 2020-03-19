package Activity_52;

public class Journal extends Document{
    private String numberRelease;
    private String monthRelease;

    public Journal(String id, String nxb, String number, String numberRelease, String monthRelease) {
        super(id, nxb, number);
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }

    public String getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(String numberRelease) {
        this.numberRelease = numberRelease;
    }

    public String getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(String monthRelease) {
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Journal{" +
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\''+
                "numberRelease='" + numberRelease + '\'' +
                ", monthRelease='" + monthRelease + '\'' +
                '}';
    }
}
