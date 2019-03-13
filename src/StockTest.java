import java.util.ArrayList;
public class StackTester {
    public static void main(String[] args) {
        Stock<String> strStock = new Stock<>();
        strStock.push("Соль");
        strStock.push("Сахар");
        strStock.push("Молоко");
        for (String s : strStock) {
            System.out.println(s + ", ");
        }
        ArrayList<Integer> intNumer = new ArrayList<>();
        intNumer.add(1);
        intNumer.add(2);
        intNumer.add(3);
        for (Integer s : intNumer) {
            System.out.println(s + ", ");
        }
    }
}