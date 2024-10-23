

import java.util.Scanner;
import java.util.Arrays;
import javax.swing.*;
public class Main {
  public static void main(String[] args) {
    System.setProperty("java.awt.headless", "true");

    
    String name=JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null,"Hello "+name);

    int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null,"You are "+age+" years old");
    
  }

 
}