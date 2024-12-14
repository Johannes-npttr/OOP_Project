import javax.swing.*;
import java.io.OutputStream;
import java.io.PrintStream;

public class TestFenster {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konsolen-Ausgabe");
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        PrintStream printStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                textArea.append(String.valueOf((char) b));
                textArea.setCaretPosition(textArea.getDocument().getLength());
            }
        });

        System.setOut(printStream);
        System.setErr(printStream);

        // Beispielausgaben
        System.out.println("Hallo, Welt!");
        System.out.println("Dies ist eine Konsolenausgabe im Fenster.");
    }
}