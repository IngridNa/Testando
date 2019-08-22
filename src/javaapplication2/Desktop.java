/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
/**
 *
 * @author Laboratorio
 */
public class Desktop extends JDesktopPane{
    
    private JInternalFrame JanelaPrincipal;
    
    public void abrirJanelaCLiente(){
         if(JanelaPrincipal==null){
             JanelaPrincipal = new JanelaCliente();
             JanelaPrincipal.setVisible(true);
             this.add(JanelaPrincipal);
      }
   }
    public void fecharJanelaCliente(){
        JanelaPrincipal = null;
    }
}
    
