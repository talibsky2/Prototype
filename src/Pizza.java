public class Pizza implements CopyPaste {
    String name;
    int diameter;
    public Pizza (String name, int diameter){
        this.name = name;
        this.diameter = diameter;
    }
    public String toString(){
        return "Pizza " + name + ", diameter " + diameter + "cm";
    }
    @Override
    public Object copy() {
        return new Pizza(name,diameter);
    }

}
