/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


/**
 *
 * @author clement
 */
public class TodosInterface extends JFrame {
    
    TodosModel todos ;
    JTextField champText = new JTextField(20);
    
    
    public TodosInterface(TodosModel todos){
        super("Todo List");
        this.todos = todos;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(300, 150);
        
        // container intermédiaire pour stocker le champ text et le bouton
        Container cont = new Container();
        cont.setLayout(new FlowLayout());
       
        JButton bouton = new JButton("Ajouter");

        // J'ajoute les composants au container intermédiaire
        cont.add(champText);
        cont.add(bouton);
        
        setLayout(new BorderLayout());
        // J'ajoute le container intermédiaire à la fenetre
        add(cont, BorderLayout.NORTH);
        
        // Je crée un élément graphique qui rend 
        //                            compte de notre source de données
        JTable table = new JTable(todos) ;
        table.setTableHeader(null);
        table.setEnabled(false);
        JScrollPane scrollable = new JScrollPane(table);
        
        // J'ajoute le composant dans la fenetre
        add(scrollable, BorderLayout.CENTER);
        
        
        // Je mets en place les écouteurs d'événement
        // On appuie sur entrée dans le le textfield
        champText.addActionListener((e) -> {
            newTodo(champText.getText());
        });
        // On clique sur le le bouton
        bouton.addActionListener((event) -> {
           newTodo(champText.getText());
        });        
    }
    public void newTodo(String str){
        todos.add(str);
        champText.setText("");
        champText.requestFocus();
    }
}
