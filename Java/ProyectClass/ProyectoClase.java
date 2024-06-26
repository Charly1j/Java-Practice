public class ProyectoClase {
    private String name;
    private String description;
    private double initialCost;

    public  ProyectoClase() { }

    public  ProyectoClase(String name) {
        this.name = name;
    }

    public  ProyectoClase(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return name + " (" + initialCost + "): " + description;
    }
    
}