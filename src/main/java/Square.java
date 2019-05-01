public class Square {

    private String name;
    private int index;

    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    public String toString(){
        return name;
    }

}
