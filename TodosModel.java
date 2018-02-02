/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clement
 */
public class TodosModel extends AbstractTableModel {
    
    ArrayList al = new ArrayList();
    
    public void add(String str){
        al.add(str);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return al.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return al.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        return null ;//To change body of generated methods, choose Tools | Templates.
    }
    
    

    

}
