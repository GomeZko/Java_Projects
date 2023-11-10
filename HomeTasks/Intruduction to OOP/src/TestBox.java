public class TestBox {
    public static void main(String[] args) {

        Box b1 = new Box(5.5, 2.4, 3.0, "Red", "Plastic", true);
        Box b2 = new Box(6.5, 3.4, 6.2, "Green", "Metall", false);

        System.out.println("First box volume " + b1.calculateVolume());
        System.out.println("Second box volume: " + b2.calculateVolume());

        Box[] boxes = new Box[2];
        boxes[0] = b1;
        boxes[1] = b2;

        for(Box box : boxes){
            System.out.println("\nInformation: " + box);
            System.out.println("Volume: " + box.calculateVolume());
        }

    }
}
