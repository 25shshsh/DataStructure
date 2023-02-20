package java_sort;


import java.util.Arrays;
// Comparable<>
public class Fruit implements Comparable<Fruit>{ // 중요

    public String name;
    public int quantity;
    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

/*    public int compareTo(Fruit other) { // 중요 -1 0 1로 크기비교.
        return name.compareTo(other.name);
    }*/
    public int compareTo(Fruit other) { // 하나만 사용가능
        //return quantity - other.quantity; // -1 0 1로 크기비교. 크기 오름차순
        return other.quantity - quantity; // -1 0 1로 크기비교. 크기 내림차순
    }
    // 2가지 이상 정렬은 Comparator 인터페이스를 사용해야함.

    public String getFruitName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Fruit [] fruits = new Fruit[4];
        fruits[0] = new Fruit("Pineapple",70);
        fruits[1] = new Fruit("Apple",50);
        fruits[2] = new Fruit("Banana",100);
        fruits[3] = new Fruit("Orange",80);

        Arrays.sort(fruits);

        for(int i = 0 ; i < fruits.length; i++) {
            System.out.println(fruits[i].getFruitName()+", "+fruits[i].getQuantity());
        }
    }

}
