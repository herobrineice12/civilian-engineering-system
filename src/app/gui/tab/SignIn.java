package app.gui.tab;

import app.gui.Window;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends Window implements ActionListener{
    private JLabel nomeLabel, emailLabel, senhaLabel;
    private JTextField askNome, askEmail;
    private JPasswordField askSenha;
    private JButton signInButton, cancelarButton;

    public SignIn() {
        super("Cadastre-se como usuário", 400, 235, false, null);
        SpringLayout layout = new SpringLayout();
        getContentPane().setLayout(layout);

        nomeLabel = new JLabel("Nome:");
        emailLabel = new JLabel("Email:");
        senhaLabel = new JLabel("Senha:");
        
        askNome = new JTextField(20);
        askEmail = new JTextField(20);
        askSenha = new JPasswordField(20);

        signInButton = new JButton("Cadastrar");
        signInButton.addActionListener(this);
        cancelarButton = new JButton("Cancelar");
        cancelarButton.addActionListener(this);

        getContentPane().add(nomeLabel);
        getContentPane().add(askNome);
        getContentPane().add(emailLabel);
        getContentPane().add(askEmail);
        getContentPane().add(senhaLabel);
        getContentPane().add(askSenha);
        getContentPane().add(signInButton);
        getContentPane().add(cancelarButton);

        layout.putConstraint(SpringLayout.WEST, nomeLabel, 20, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, nomeLabel, 25, SpringLayout.NORTH, getContentPane());

        layout.putConstraint(SpringLayout.WEST, askNome, 20, SpringLayout.EAST, nomeLabel);
        layout.putConstraint(SpringLayout.NORTH, askNome, 25, SpringLayout.NORTH, getContentPane());
        layout.putConstraint(SpringLayout.EAST, askNome, -20, SpringLayout.EAST, getContentPane());

        layout.putConstraint(SpringLayout.WEST, emailLabel, 20, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, emailLabel, 20, SpringLayout.SOUTH, askNome);

        layout.putConstraint(SpringLayout.WEST, askEmail, 20, SpringLayout.EAST, emailLabel);
        layout.putConstraint(SpringLayout.NORTH, askEmail, 20, SpringLayout.SOUTH, askNome);
        layout.putConstraint(SpringLayout.EAST, askEmail, -20, SpringLayout.EAST, getContentPane());

        layout.putConstraint(SpringLayout.WEST, senhaLabel, 20, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, senhaLabel, 20, SpringLayout.SOUTH, askEmail);

        layout.putConstraint(SpringLayout.WEST, askSenha, 20, SpringLayout.EAST, senhaLabel);
        layout.putConstraint(SpringLayout.NORTH, askSenha, 20, SpringLayout.SOUTH, askEmail);
        layout.putConstraint(SpringLayout.EAST, askSenha, -20, SpringLayout.EAST, getContentPane());
        
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, cancelarButton, -60, SpringLayout.HORIZONTAL_CENTER, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, cancelarButton, 30, SpringLayout.SOUTH, askSenha);

        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, signInButton, 60, SpringLayout.HORIZONTAL_CENTER, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, signInButton, 30, SpringLayout.SOUTH, askSenha);

        this.revalidate();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == signInButton) {
            String nome = askNome.getText();
        
            JOptionPane.showMessageDialog(this, "Novo usuario de nome " + nome + " cadastrado");
        } else if (source == cancelarButton){
            dispose();
        }
    }
}
