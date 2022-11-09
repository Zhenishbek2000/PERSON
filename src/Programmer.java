public class Programmer extends PERSON {
    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}'+super.toString();
    }
}

