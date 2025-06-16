package app.gui.tab;

import javax.swing.*;
import app.gui.Window;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends Window implements ActionListener{
    JButton cadastrarButton, editarButton, excluirButton, listarButton; 

    public Menu() {
        super("Selecione uma opção", 300, 200, false, null);
        GridLayout layout = new GridLayout(3,2);
        getContentPane().setLayout(layout);

        cadastrarButton = new JButton("Cadastrar");
        editarButton = new JButton("Editar");
        excluirButton = new JButton("Excluir");
        listarButton = new JButton("Listar");

        add(cadastrarButton);
        add(editarButton);
        add(excluirButton);
        add(listarButton);

        this.revalidate();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == cadastrarButton) {
            new SignIn();
        } else if (source == editarButton) {

        } else if (source == excluirButton) {

        } else if (source == editarButton) {
            
        }
    }
}
