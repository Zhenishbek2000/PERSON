public class Singer extends PERSON{
    private String bandName;
    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}'+super.toString();
    }
}
