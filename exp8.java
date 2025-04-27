import java.awt.*;  
import java.awt.event.*;  

public class exp8 extends Frame implements ActionListener {  
    Label label;
    Button button;

    public exp8() {  
        label = new Label("Click the button!");
        button = new Button("Click Me");

        setLayout(new FlowLayout());
        add(label);
        add(button);
        button.addActionListener(this);

        setSize(250, 150);
        setTitle("Java AWT");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }  

    // Handle button click
    public void actionPerformed(ActionEvent e) {  
        label.setText("Button Clicked!");
    }  

    // Main method
    public static void main(String[] args) {  
        new exp8();  
    }  
}
