public class NYRestaurant extends Restaurant {
    @Override
    public Apple getApple(String kind) {
        Apple apple = null;
        if (kind.equals("koru")) apple = new Busa();
        else if (kind.equals("crispy")) apple = new Hongok();
        else if (kind.equals("pinklady")) apple = new Pinklady();
        return apple;
    }
}
