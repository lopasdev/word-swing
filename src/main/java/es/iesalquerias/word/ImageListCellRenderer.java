/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalquerias.word;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;

/**
 *
 * @author lopas
 */
public class ImageListCellRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList jlist, 
                                                Object value, 
                                                int cellIndex, 
                                                boolean isSelected, 
                                                boolean cellHasFocus)
  {
    if (value instanceof JPanel)
    {
      Component component = (Component) value;
      component.setForeground (Color.white);
      component.setBackground (isSelected ? UIManager
              .getColor("Table.focusCellForeground") : Color.white);
      return component;
    }
    else
    {
      return new JLabel("???");
    }
  }
    
}