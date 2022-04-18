package View;
import javax.swing.*;

public class Window {

	public Window() {}
	
	public int readInt(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		return  Integer.parseInt(aux);
	}
	
	public double readDouble(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		return Double.parseDouble(aux);
	}
	
	public String readString(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	
	public void showInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void errorMessage(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Algo esta mal, revisa", JOptionPane.ERROR_MESSAGE);
	}
	
	public void warningMessage(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Peligroooo", JOptionPane.WARNING_MESSAGE);
	}
}
