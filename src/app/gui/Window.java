package app.gui;

import java.awt.*;
import javax.swing.*;
import app.cfg.*;

public abstract class Window extends JFrame{
	private SwitchState vision = SwitchState.ON;
	
    public Window(String titulo, int largura, int altura, boolean resizable, Image icone) {
        this.setTitle(titulo);
        this.setSize(largura, altura);
        this.setResizable(resizable);
        
        this.setIconImage(icone);
        if (Config.modoEscuro.getSwitch()) {
            this.setForeground(Color.darkGray);
        } else {
            this.setForeground(Color.white);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(vision.getSwitch());
    }
    
    public void toggleWindow() {
    	this.setVisible(vision.toggleSwitch().getSwitch());
    }
}
