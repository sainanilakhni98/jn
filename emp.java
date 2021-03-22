class Details{
    int id;
    String name;
    public Details(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class emp {
    public static void main(String[] args) {
        Details d=new Details(90,"Yogesh Sainani");
        System.out.println("Employee id is " + d.getId());
        System.out.println("Employee name is "+d.getName());
    }
}
