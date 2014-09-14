package design_patterns.builder;

/**
 * Created by maksimustinov on 9/14/14.
 */
public class Window {

    boolean visible;
    boolean modal;
    boolean dialog;

    public Window(boolean v, boolean m, boolean d){
        this.visible = v;
        this.modal = m;
        this.dialog = d;
    }
}
