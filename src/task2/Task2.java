package task2;

public class Task2 {
    public static void main(String[] args) {
        User user = new User();
        user.setLogin("buyer");
        user.setPassword("d_5Wld");

        String[]goods1 = {"potato","onion","cucumber"};
        String[]goods2 = {"apple","orange","mandarin"};

        Catergory catergory = new Catergory();
        Catergory catergory2 = new Catergory();
        catergory.setName("vegetables");
        catergory2.setName("fruit");
        catergory.setGoods(goods1);
        catergory2.setGoods(goods2);

        Basket cart = new Basket();
        String[]purchasedGoods = {"apple","potato","cucumber"};
        cart.setPurchasedGoods(purchasedGoods);
        user.setBasket(cart);

        System.out.println(user.getLogin());
        System.out.println(user.getPassword());

        for(int i=0;i< user.getBasket().getPurchasedGoods().length;i++){
            System.out.println(user.getBasket().getPurchasedGoods()[i]);
        }
    }
}
