public class Ball {
    private String name;
    private int size;

    public Ball(String n, int s) {
        name = n;
        size = s;
    }

    public Ball(String n) {
        name = n;
        size = 0;
    }

    public void setSize (int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return this.name + ", Size " + this.size;
    }

    public void intoSize() {
        System.out.println("A " + name + " ball have a Size " + size);
    }
}
