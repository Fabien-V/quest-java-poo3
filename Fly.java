public interface Fly{

    public void TakeOff();

    public int ascend(int meters);

    public int descend(int meters);

    public void land();

    public default void glide() {
        System.out.println("It glides into the air");
    }
}






