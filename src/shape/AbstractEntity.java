package shape;

public abstract class AbstractEntity {
    private static int counter = 0;
    public static int Id;

    public static int getId() {
        Id = counter++;
        return Id;
    }
}

