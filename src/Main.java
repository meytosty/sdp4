public class Main {
    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();

        IceCreamObserver vendorA = new Vendors("Vendor A");
        IceCreamObserver vendorB = new Vendors("Vendor B");

        IceCreamProducer producer = new IceCreamProducer();
        producer.addObserver(vendorA);
        producer.addObserver(vendorB);

        IceCream chocolateIceCream = factory.produceIceCream("Chocolate");
        producer.produceIceCream(chocolateIceCream.getFlavor());

        IceCream vanillaIceCream = factory.produceIceCream("Vanilla");
        producer.produceIceCream(vanillaIceCream.getFlavor());

        producer.removeObserver(vendorA);

        IceCream strawberryIceCream = factory.produceIceCream("Strawberry");
        producer.produceIceCream(strawberryIceCream.getFlavor());
    }
}
