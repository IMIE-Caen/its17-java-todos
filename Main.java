/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todos;

/**
 *
 * @author clement
 */
public class Main {
    public static void main(String[] args){
        
        TodosModel todos = new TodosModel();
   
        new TodosInterface(todos).setVisible(true);
        
    }
}
