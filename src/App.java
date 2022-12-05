import javax.swing.*;

public class App extends JFrame {

    public App(){
        add(new Board());
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }
}
