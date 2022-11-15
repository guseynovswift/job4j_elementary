package ru.job4j;
import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?")); // переводим в инт значение, строго
        JOptionPane.showMessageDialog(null, "Age "+age);
    }
}
