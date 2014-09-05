package design_patterns.visitor.shopping_card_example;

/**
 * Created by maksimustinov on 9/4/14.
 */
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
