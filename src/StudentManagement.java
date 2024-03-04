
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author puru
 */
public enum StudentManagement {

    
    CONDITION_ONE {
        @Override
        public void showMessage() {
            JOptionPane.showMessageDialog(null, "One Or More Empty Field");
        }
    },
    CONDITION_TWO {
        @Override
        public void showMessage() {
            JOptionPane.showMessageDialog(null, "No Student From The Futur Are Allowed");
        }
    },
    CONDITION_ELSE {
        @Override
        public void showMessage() {
            //someMethod("elseParameter");
        }
    };

   public abstract void showMessage();


}
