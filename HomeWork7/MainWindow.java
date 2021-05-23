package HW7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private int winWidth = 750; // задаем размеры окна по ширине
    private int winHeight = 600; // задаем размеры окна по высоте
    private int winPosX = 200; // задаем точку откуда начинать рисовать окно по x
    private int winPosY = 150; // задаем точку откуда начинать рисовать окно по y

    private int minMapSize = 3; // задаем минимальные размеры поля
    private int maxMapSize = 10; // задаем максимальные размеры поля
    private int minWinLength = 3; // задаем минимальные размеры поля победы

    private String mapSizeSettingsPrefix = "Map size now ";
    private String mapWinLengthPrefix = "Win Length now ";

    private JButton btnStart; // задаем кнопку
    private JButton btnExit; // задаем кнопку
    private JButton btnClearLog; // задаем кнопку

    private JPanel panelSettings; //
    private JPanel panelControl;

    private JTextArea gameLog; // задаем логирование
    private JScrollPane scrollPanel; // задаем бегунов

    private JSlider sliderMapSizeSetup;
    private JLabel labelMapSize;

    private JSlider sliderWinLengthSetup;
    private JLabel labelWinLength;



    MainWindow() {
        prepareAppWindow();
        prepareGameSettings();
        prepareButtons();
        prepareSettingsControls();
        prepareGameLog();

        panelSettings.add(panelControl, BorderLayout.NORTH);
        panelSettings.add(scrollPanel, BorderLayout.SOUTH);

        add(panelSettings, BorderLayout.EAST);


//        add(btnStart, BorderLayout.NORTH); // позиционирование по сторонам света
//        add(btnExit, BorderLayout.EAST); // позиционирование по сторонам света

//        setLayout(new GridLayout(5,10)); // менеджер устанавливает расположение елементов в данном случае 5 строках 10 колоноках
//        add(btnExit);
//        add(btnStart);
//        setLayout(new FlowLayout()); // менеджер расположения по компановке элементов до упора с переносом
//
//        for (int i = 0; i < 100; i++) {
//            add(new JButton("Button #" + i));
//        }

        setVisible(true);
    }

    private void prepareAppWindow() { // метод как сварганить окно
        setDefaultCloseOperation(3); // при нажатии на крестик закончит работать окно поэтому 3
        setSize(winWidth, winHeight); // размеры окна
        setLocation(winPosX, winPosY); // расположение окнаверхн левая точка
        setTitle("Application"); // название окна
        setResizable(false); // условие тру ор фолс можно изменять размеры или нет
    }

    private void prepareGameSettings() { // метод по расположению кнопок
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2, 1));
    }

    private void prepareButtons() { // метод по началу игры, точнее утверждения условий начала игры
        btnStart = new JButton("Start"); // через кнорку старт
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // переопределенный метод в котором нудно бегунками задать условия
                collectGameSetup();
//                putLog(" User choose " + sliderMapSizeSetup.getValue());

            }
        });

        btnExit = new JButton("Exit"); // метод по выходу изи программы через кнопку экзит
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnClearLog = new JButton("Clear log"); // мктод постиранию логов через кнопку клир лог
        btnClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // типа переопределенный метод
                gameLog.setText(""); // стирает в ничего
            }
        });
    }

    private void prepareSettingsControls() {
        panelControl = new JPanel();

        labelMapSize = new JLabel(mapSizeSettingsPrefix + minMapSize);

        sliderMapSizeSetup = new JSlider(minMapSize, maxMapSize, minMapSize);
        sliderMapSizeSetup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSizeValue = sliderMapSizeSetup.getValue();
                labelMapSize.setText(mapSizeSettingsPrefix + currentMapSizeValue);
                sliderWinLengthSetup.setMaximum(currentMapSizeValue);

            }
        });

        labelWinLength = new JLabel(mapWinLengthPrefix + minWinLength);
        sliderWinLengthSetup = new JSlider(minWinLength, minMapSize, minMapSize);
        sliderWinLengthSetup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(mapWinLengthPrefix + sliderWinLengthSetup.getValue());
            }
        });

        panelControl.setLayout(new GridLayout(10,1));
        panelControl.add(labelMapSize);
        panelControl.add(sliderMapSizeSetup);
        panelControl.add(labelWinLength);
        panelControl.add(sliderWinLengthSetup);
        panelControl.add(btnStart);
        panelControl.add(btnExit);
        panelControl.add(btnClearLog);
    }

    private void prepareGameLog() { // метод по созданию окна с логами
        gameLog = new JTextArea(); // позиционирование
        scrollPanel = new JScrollPane(gameLog); // создаем
        gameLog.setEditable(false); // разрешаем или запрещаем редактировать
        gameLog.setLineWrap(true); // разрешаем или запрещаем выходить за границы
    }

    private void putLog(String msg) { // метод  по созданию вывода текста в логи
        gameLog.append(msg + " \n");
    }

    private void collectGameSetup() { // метод который будет выводить в логи размер окна например 3х3 5х5
        int mapSize = sliderMapSizeSetup.getValue(); // ну естественно водя по бегунку
        int winLen = sliderWinLengthSetup.getValue();

        putLog("Map size is " + mapSize + "x" + mapSize + ". Win length is " + winLen);
    }


}
