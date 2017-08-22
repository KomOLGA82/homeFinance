package ru.komolga.finHome.client.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MainFrame extends JFrame {
    private static MainFrame instance;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private static String[] MAIN_ITEMS = {"В", "Л", "П", "Р", "С"};
    private final Comparator<JMenuItem> menuItemComparator = new Comparator<JMenuItem>()
    {
        @Override
        public int compare(JMenuItem o1, JMenuItem o2)
        {
            return o1.getText().compareTo(o2.getText());
        }
    };

    protected MainFrame() throws HeadlessException {
        this.setTitle("Домашние финансы");
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu root = new JMenu("Выбрать подсистему");
        menuBar.add(root);

        this.setLayout(new BorderLayout());
        this.setIconImage(getToolkit().createImage(this.getClass().getResource("/icons/hammer.png")));
        this.add(tabbedPane, BorderLayout.CENTER);
        //tabbedPane.addTab("Цепочки", new ImageIcon("/icons/script.png"), chainManagementPane = new ChainManagementPane());
//        tabbedPane.addTab("Формы", new ImageIcon("/icons/application.png"), formManagementPane = new FormManagementPane());
//        tabbedPane.addTab("Панели", new ImageIcon("/icons/application_form.png"), panelManagementPane = new PanelManagementPane());
//        tabbedPane.addTab("Процедуры", new ImageIcon("/icons/box.png"), procedureManagementPane = new ProcedureManagementPane());
//        tabbedPane.addTab("Меню", new ImageIcon("/icons/box.png"), new MenuTreeManagementPane());

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }



    public static MainFrame getInstance() {
        if (instance == null) instance = new MainFrame();
        return instance;
    }



}
