class Main {
    public static void main(String[] args) {
        Box box = new Box(10, 10, 10);
        
        System.out.println("Box volume: " + box.volume());
        
        box.addItem("Item 1");
        box.addItem("Item 2");
        box.addItem("Item 3");
        box.printItems();
        
        box.removeItem("Item 2");
        box.printItems();
        
        box.addItem("Item 4");
        box.addItem("Item 5");
        box.addItem("Item 6");
        box.addItem("Item 7");
        box.addItem("Item 8");
        box.addItem("Item 9");
        box.addItem("Item 10");
        box.addItem("Item 11"); // should print "The box is full!!!"
        
        box.printItems();
    }
}
