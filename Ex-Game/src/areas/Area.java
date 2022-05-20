package areas;

public class Area {
    // class to instantiate an area of children
    private String name;
    private int numberOfSubAreas;
    private String description;
    private Area[] subAreas; // array of sub areas

    public Area(String name, int numberOfSubAreas, String description) {
        this.name = name;
        this.numberOfSubAreas = numberOfSubAreas;
        this.description = description;
        subAreas = new Area[numberOfSubAreas];
    }

    public Area() {}

    public String getName() {
        return name;
    }

    public int getNumberOfSubAreas() {
        return numberOfSubAreas;
    }

    public String getDescription() {
        return description;
    }

    public void setSubArea(int index, Area subArea) {
        subAreas[index] = subArea;
    }

    public Area[] getSubAreas() {
        return subAreas;
    }

    public String toString() {
        return name + ": " + description;
    }
}

