public class Dancer extends PERSON{
    private String groupName;

    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}'+super.toString();
    }
}
