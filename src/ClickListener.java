import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener {
    int numCalled = 0;
    public void actionPerformed(ActionEvent event) {
        numCalled++;
        System.out.println("I was clicked " + numCalled + " times!");
    }
}
