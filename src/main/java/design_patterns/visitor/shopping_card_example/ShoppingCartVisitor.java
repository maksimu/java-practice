package design_patterns.visitor.shopping_card_example;

import design_patterns.visitor.shopping_card_example.entity.Book;
import design_patterns.visitor.shopping_card_example.entity.Fruit;

/**
 * Created by maksimustinov on 9/4/14.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);

}
