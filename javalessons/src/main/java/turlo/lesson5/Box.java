package turlo.lesson5;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> product = new ArrayList<>();

    public Box() {
    }

    public double getWeight() {
        double sumWeightProducts = 0.0f;
        for (Fruit e : product) {
            sumWeightProducts += e.getWeight();
        }
        return sumWeightProducts;
    }

    public ArrayList<Fruit> getProduct() {
        return product;
    }

    public void add(Fruit fruit) {
        if (product.size() > 1) {
            if (isProductsComparable(fruit)) {
                throw new Сomparison("Смешивать товары запрещено, не совместимые товары!");
            }
        }
        product.add(0, fruit);
    }

    public boolean compare(Box other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }

    public void shiftSingleItem(Box box2) throws Сomparison {
        if (isProductsComparable(box2)) {
            throw new Сomparison("Смешивать товары запрещено, не совместимые товары!");
        }
        for (int i = product.size() - 1; i >= 0; i--) {
            box2.getProduct().add(product.get(i));
            product.remove(i);
        }
    }

    public boolean isProductsComparable(Box otherBox) {
        return product.get(0).getClass() != otherBox.getProduct().get(0).getClass();
    }

    public boolean isProductsComparable(Fruit fruit) {
        return product.get(0).getClass() != fruit.getClass();
    }
}