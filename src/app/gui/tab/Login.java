package app.gui.tab;

import javax.swing.*;
import app.gui.Window;
import app.cfg.*;
import java.awt.*;

public class Login extends Window {
    private JTextField askEmail;
    private JPasswordField askSenha;
    private JButton loginButton, cancelButton;

    public Login() {
        super("Faça login com sua conta", 400, 200, false, null);
        SpringLayout layout = new SpringLayout();
        getContentPane().setLayout(layout);
        
        JLabel emailLabel = new JLabel("Email:");
        JLabel senhaLabel = new JLabel("Senha:");

        askEmail = new JTextField(20);
        askSenha = new JPasswordField(20);
        
        loginButton = new JButton("Entrar");
        cancelButton = new JButton("Cancelar");

        getContentPane().add(emailLabel);
        getContentPane().add(askEmail);
        getContentPane().add(senhaLabel);
        getContentPane().add(askSenha);
        getContentPane().add(cancelButton);
        getContentPane().add(loginButton);

        layout.putConstraint(SpringLayout.WEST, emailLabel, 20, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, emailLabel, 25, SpringLayout.NORTH, getContentPane());

        layout.putConstraint(SpringLayout.WEST, askEmail, 20, SpringLayout.EAST, emailLabel);
        layout.putConstraint(SpringLayout.NORTH, askEmail, 25, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, askEmail, -20, SpringLayout.EAST, getContentPane());

        layout.putConstraint(SpringLayout.WEST, senhaLabel, 20, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, senhaLabel, 20, SpringLayout.SOUTH, askEmail);

        layout.putConstraint(SpringLayout.WEST, askSenha, 20, SpringLayout.EAST, senhaLabel);
        layout.putConstraint(SpringLayout.NORTH, askSenha, 20, SpringLayout.SOUTH, askEmail);
        layout.putConstraint(SpringLayout.EAST, askSenha, -20, SpringLayout.EAST, getContentPane());

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, loginButton, 50, SpringLayout.HORIZONTAL_CENTER, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, loginButton, 30, SpringLayout.SOUTH, askSenha);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, cancelButton, -50, SpringLayout.HORIZONTAL_CENTER, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, cancelButton, 30, SpringLayout.SOUTH, askSenha);

        this.revalidate();
        this.repaint();
    }
}
