package design_patterns.builder;

/**
 * Created by maksimustinov on 9/14/14.
 */
public class WindowBuilder {

    boolean visible = false;
    boolean modal = false;
    boolean dialog = false;

    public WindowBuilder(){}

    public WindowBuilder setVisible(boolean isVisible){
        this.visible = isVisible;
        return this;
    }

    public WindowBuilder setModal(boolean isModal){
        this.modal = isModal;
        return this;
    }

    public WindowBuilder setDialog(boolean isDialog){
        this.dialog = isDialog;
        return this;
    }


    public Window build(){
        return new Window(visible, modal, dialog);
    }
}
