public class W {
    protected String material;
    protected String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public W(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Посуда{" +
                "Материал " + material + '\'' +
                ", Цвет" + color + '\'' +
                '}';
    }
}

