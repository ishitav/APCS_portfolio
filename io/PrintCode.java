package io;
import javax.swing.JOptionPane;

import miniLabs.MethodCode;

public class PrintCode {
    public static void temporarycode(String method) {
        String code = MethodCode.getMethodCode(method);
        JOptionPane.showMessageDialog(null, code, method, JOptionPane.INFORMATION_MESSAGE);       
    }
}