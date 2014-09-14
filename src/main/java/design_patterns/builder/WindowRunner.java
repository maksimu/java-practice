package design_patterns.builder;

/**
 * Created by maksimustinov on 9/14/14.
 */
public class WindowRunner {

    public static void main(String... args){

        Window w = new WindowBuilder().setDialog(true).setModal(true).setVisible(true).build();



    }
}
