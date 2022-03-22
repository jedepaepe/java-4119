package eu.epfc.demo;

import eu.epfc.geometry.Point;
import eu.epfc.pcomponent.AbstractUIComponent;
import eu.epfc.pcomponent.UIButton;
import eu.epfc.pcomponent.UIInput;
import eu.epfc.pcomponent.UIText;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class PalindromeApp extends PApplet {
    private List<AbstractUIComponent> components = new ArrayList<>();
    private UIButton button;
    private UIInput uiInput;
    private UIText result;

    public PalindromeApp() {
        UIText label = new UIText(this, new Point(20, 50), new Point(100, 100));
        label.setText("Tapez un mot");
        uiInput = new UIInput(this, new Point(120, 50), new Point(200, 100));
        button = new UIButton(this, new Point(80, 120), new Point(120, 160));
        button.setText("Vérifie");
        result = new UIText(this, new Point(20, 200), new Point(200, 250));
        components.add(label);
        components.add(uiInput);
        components.add(button);
        components.add(result);
    }

    @Override
    public void settings() {
        size(220, 270);
    }

    @Override
    public void draw() {
        background(0);
        fill(255);
        for(AbstractUIComponent c : components) {
            c.draw();
        }
    }

    @Override
    public void mousePressed() {
        for(AbstractUIComponent c: components) {
            c.mousePressed();
        }

        if (button.contains(new Point(mouseX, mouseY))) {
            String text = uiInput.getText();
            String reverse = new StringBuilder(text).reverse().toString();
            boolean isPalindrome = text.equals(reverse);
            if (isPalindrome) {
                result.setText(text + " est un palindrome");
            } else {
                result.setText(text + " n'est pas un palindrome");
            }
        }
    }

    @Override
    public void keyPressed() {
        for(AbstractUIComponent c: components) {
            c.keyPressed();
        }
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[]{"hello"}, new PalindromeApp());
    }
}
