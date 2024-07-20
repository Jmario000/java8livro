/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap04;

import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class ConfigRegionais {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale locale = Locale.getDefault();
        float valor = 1370.25f;
        if ("BR".equals(locale.getCountry())) {
            df.applyPattern("R$ #,##0.00");
        }
        JOptionPane.showMessageDialog(null, "Config do SO: "
                + "\nsigla: " + locale.getCountry()
                + "\nPaís: " + locale.getDisplayCountry()
                + "\nIdioma: " + locale.getDisplayLanguage()
                + "\nTeclado: " + locale.getDisplayName()
                + "\nValor: " + df.format(valor));
        System.exit(0);
    }
}
