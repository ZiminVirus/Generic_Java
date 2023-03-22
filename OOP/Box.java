package OOP;
import java.util.ArrayList;
import java.util.List;

import javax.management.ValueExp;

public class Box <T extends Fruit> {
    // int weight;
    // int weightSum;
    List <Fruit> boxFruit = new ArrayList<>();

    public void addFruit (T fruit) {
        
        // // добавляем фрукт в коробку
        boxFruit.add(fruit);

    }

    public int getWeigh() {
        int weightSum = 0;
        for (Fruit fruit : boxFruit) {
            weightSum += fruit.getWeight();
            
         }
    
    return weightSum;

        // throw new UnsupportedOperationException();
    }

    public void moveTo(Box <? super T> target) {
        target.boxFruit.addAll(boxFruit);

        



        // пересыпаем фрукты отсюда в target

    }


}
