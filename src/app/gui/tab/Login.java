package app.gui.tab;

import javax.swing.*;
import app.gui.Window;
import app.cfg.*;

public class Login extends Window{
	
	public Login() {
		super("Faça login com sua conta", 400, 250, false, null);
		SpringLayout layout = new SpringLayout();
		getContentPane().setLayout(layout);
	}
}
