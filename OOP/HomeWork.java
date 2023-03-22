package OOP;


import java.util.Collections;
import java.util.Objects;

public class HomeWork {

public static void main(String[] args) {
        // Есть классы: GoldenApple -> Apple -> Fruit
        //                             Orange -> Fruit
        // Есть класс Box. Нужно:
        // 1. Организовать его так, чтобы он мог хранить только фрукты какого-то типа
        // 2. Реализовать методы добавления фрукта, пересыпания в другую коробку, получение сумарного веса
        // Ограничения:
        // В коробку с апельсинами нельзя добавить яблоки
        // В коробку с золотыми яблоками нельзя добавить апельсины и яблоки
        // Пересыпать из коробки с золотыми яблоками в коробку с яблоками можно!
        // 3.* Реализовать итерируемость по коробке

        // Box<String> stringBox = new Box(); // не должно работать
        Box<Apple> appleBox = new Box(); // работает
        Box<Orange> orangeBox = new Box(); // работает
        Box<GoldenApple> goldenAppleBox = new Box(); // работает

        appleBox.addFruit(new Apple(1)); // работает
        appleBox.addFruit(new Apple(1)); // работает
        appleBox.addFruit(new Apple(1)); // работает
        // appleBox.addFruit(new Orange(1)); // не работает
        orangeBox.addFruit(new Orange(1));
        appleBox.addFruit(new GoldenApple(4)); // работает
        appleBox.addFruit(new GoldenApple(5)); // работает

        System.out.println(appleBox.getWeigh()); // 

        // goldenAppleBox.addFruit(new Apple(2)); // не работает
        goldenAppleBox.addFruit(new GoldenApple(2)); // работает
        goldenAppleBox.addFruit(new GoldenApple(3)); // работает

        System.out.println(goldenAppleBox.getWeigh()); // 

        goldenAppleBox.moveTo(appleBox); // работает

        System.out.println(goldenAppleBox.getWeigh()); // 0
        System.out.println(appleBox.getWeigh()); // 

    }

}
