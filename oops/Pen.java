class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing with a " + type + " pen from " + color);
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
