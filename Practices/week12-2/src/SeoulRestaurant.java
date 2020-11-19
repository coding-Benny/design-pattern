public class SeoulRestaurant extends Restaurant {
    @Override
    public Apple getApple(String kind) {
        Apple apple = null;
        if (kind.equals("busa")) apple = new Busa();
        else if (kind.equals("hongok")) apple = new Hongok();
        else if (kind.equals("hongro")) apple = new Hongro();
        return apple;
    }
}
