public class Vendors implements IceCreamObserver {
    private String name;

    public Vendors(String name) {
        this.name = name;
    }

    @Override
    public void update(String flavor) {
        System.out.println(name + ": New batch of " + flavor + " ice cream is ready!");
    }
}
