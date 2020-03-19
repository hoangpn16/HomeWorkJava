package Activity_52;

public class Newspaper extends Document {
    private String dateRelease;

    public Newspaper(String id, String nxb, String number, String dateRelease) {
        super(id, nxb, number);
        this.dateRelease = dateRelease;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                ", id='" + getId() + '\'' +
                ", nxb='" + getNxb() + '\'' +
                ", number='" + getNumber() + '\''+
                "dateRelease='" + dateRelease + '\'' +
                '}';
    }
}
