package design_patterns.visitor.shopping_card_example.entity;

import design_patterns.visitor.shopping_card_example.ItemElement;
import design_patterns.visitor.shopping_card_example.ShoppingCartVisitor;

/**
 * Created by maksimustinov on 9/4/14.
 */
public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }


    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
