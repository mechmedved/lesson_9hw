package task2;

public class Task2 {
    public static void main(String[] args) {
        User user = new User();
        user.setLogin("buyer");
        user.setPassword("d_5Wld");

        Product product1 = new Product("potato","10",5);
        Product product2 = new Product("onion","2",5);
        Product product3 = new Product("cucumber","3",5);
        Product product4 = new Product("apple","5",5);
        Product product5 = new Product("orange","6",5);
        Product product6 = new Product("mandarin","7",5);

        Product [] goods1 = {product1,product2,product3};
        Product [] goods2 = {product4,product5,product6};

        Catergory catergory1 = new Catergory("vegetables",goods1);
        Catergory catergory2 = new Catergory("fruit",goods2);

        Basket cart = new Basket();
        Product[]purchasedGoods = {product1,product3,product5};
        cart.setPurchasedGoods(purchasedGoods);
        user.setBasket(cart);

        System.out.println(user.getLogin());
        System.out.println(user.getPassword());

        for(int i=0;i< user.getBasket().getPurchasedGoods().length;i++){
            System.out.println(user.getBasket().getPurchasedGoods()[i].toString());
        }
    }
}
