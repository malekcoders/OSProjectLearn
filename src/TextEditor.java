import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor extends JFrame {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu;
    private JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem, copyMenuItem, pasteMenuItem, cutMenuItem;
    private JFileChooser fileChooser;
    private Action action;

    public TextEditor() {
        setTitle("Java Swing Text Editor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize JTextArea and JScrollPane
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Create menu bar and menus
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Create menu items and action listener for each menu item
        action = new SimpleAction("new", "Create New File", KeyEvent.VK_N);
        newMenuItem = new JMenuItem(action);
        fileMenu.add(newMenuItem);

        action = new SimpleAction("open", "Open File", KeyEvent.VK_O);
        openMenuItem = new JMenuItem(action);
        fileMenu.add(openMenuItem);

        action = new SimpleAction("save", "Save File", KeyEvent.VK_S);
        saveMenuItem = new JMenuItem(action);
        fileMenu.add(saveMenuItem);

        fileMenu.addSeparator();

        action = new SimpleAction("exit", "Exit", KeyEvent.VK_X);
        exitMenuItem = new JMenuItem(action);
        fileMenu.add(exitMenuItem);

        action = new SimpleAction("copy", "Copy", KeyEvent.VK_C);
        copyMenuItem = new JMenuItem(action);
        editMenu.add(copyMenuItem);

        action = new SimpleAction("paste", "Paste", KeyEvent.VK_P);
        pasteMenuItem = new JMenuItem(action);
        editMenu.add(pasteMenuItem);

        action = new SimpleAction("cut", "Cut", KeyEvent.VK_T);
        cutMenuItem = new JMenuItem(action);
        editMenu.add(cutMenuItem);

        // Initialize JFileChooser
        fileChooser = new JFileChooser();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setVisible(true);
    }

    class SimpleAction extends AbstractAction {
        public SimpleAction(String text, String desc, int mnemonic) {
            super(text);
            putValue(SHORT_DESCRIPTION, desc);
            putValue(MNEMONIC_KEY, mnemonic);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("new")) {
                textArea.setText("");
            } else if (e.getActionCommand().equals("open")) {
                if (fileChooser.showOpenDialog(TextEditor.this) == JFileChooser.APPROVE_OPTION) {
                    try {
                        textArea.read(new FileReader(fileChooser.getSelectedFile()), null);
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            } else if (e.getActionCommand().equals("save")) {
                if (fileChooser.showSaveDialog(TextEditor.this) == JFileChooser.APPROVE_OPTION) {
                    try {
                        textArea.write(new FileWriter(fileChooser.getSelectedFile()));
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            } else if (e.getActionCommand().equals("exit")) {
                System.exit(0);
            } else if (e.getActionCommand().equals("copy")) {
                textArea.copy();
            } else if (e.getActionCommand().equals("paste")) {
                textArea.paste();
            } else if (e.getActionCommand().equals("cut")) {
                textArea.cut();
            }
        }
    }
}