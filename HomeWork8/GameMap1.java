package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GameMap1 extends JPanel { // создаем в гэймапу из свинга типа наследуемся 

    private int mapSizeX;
    private int mapSizeY;
    private int winLength;
    private int[][] map;

    private int human = 1;
    private int ai = 2;
    private int emptyField = 0;

    private int cellWidth;
    private int cellHeight;
    
    private boolean gameOver;
    private boolean isMapExist;

    private final String MSG_HUMAN_WIN = "Human win!";
    private final String MSG_AI_WIN = "AI win!";
    private final String MSG_DRAW = "DRAW!";


    private final int STATE_HUMAN_WIN = 0;
    private final int STATE_AI_WIN = 1;
    private final int STATE_DRAW = 2;
//    private  int stateGameOver;


    private Random random = new Random();
    private MainWindow1 mainWindow1;



    GameMap1(MainWindow1 mainWindow1) {
        this.mainWindow1 = mainWindow1;
        setBackground(Color.black);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseObject) {
                super.mouseReleased(mouseObject);
                update(mouseObject);
            }
        });
        isMapExist = false;

    }

    void startGame(int mapSizeX, int mapSizeY, int winLength) {
        this.mapSizeX = mapSizeX;
        this.mapSizeY = mapSizeY;
        this.winLength = winLength;
//        System.out.println("Map size is " + mapSizeX + "x" + mapSizeY + ". Win length is " + winLength);
//        mainWindow1.putLog("Game Start");
        this.map = new int[mapSizeX][mapSizeY];
        this.gameOver = false;
        this.isMapExist = true;
        setBackground(Color.BLACK);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void update(MouseEvent mouseObject) {
        if (!isMapExist) return;
        if (gameOver) return;

        int cellX = mouseObject.getX() / cellWidth;
        int cellY = mouseObject.getY() / cellHeight;

        if ((!isValidCell(cellX, cellY) || !isEmptyCell(cellX, cellY))) {
            return;
        }

        map[cellY][cellX] = human;
        mainWindow1.putLog("Player > [" + (cellX + 1) + ":" + (cellY + 1) + "]");
        
        if (checkWin(human)) { // одна из концовок игры
            setGameOver(STATE_HUMAN_WIN);
//            System.out.println("human win");
//            gameOver = true;
            return;
        }

        if (isFullMap()) { // еще одна из концовок игры
            setGameOver(STATE_DRAW);
//            System.out.println("draw");
//            gameOver = true;
            return;
        }

        aiTurn();
        repaint();

        if (checkWin(ai)) { // и еще одна из концовок игры
            setGameOver(STATE_AI_WIN);
//            System.out.println("ai win");
//            gameOver = true;
            return;
        }

        if (isFullMap()) { // ничья
            setGameOver(STATE_DRAW);
//            System.out.println("draw");
//            gameOver = true;
            return;
        }

//        System.out.println(cellX + " " + cellY);
//        System.out.println(x + " > " + y);
    }

    private void setGameOver(int stateGameOver) { // завершение игры
        repaint(); // обновление по отрисовке
        this.gameOver = true;
//        this.stateGameOver = stateGameOver;
        showGameOverMessage(stateGameOver);
//        mainWindow1.putLog("?");
    }

    private void render(Graphics g) { // отрисовка поля
        if (!isMapExist) return;
        createMap(g);

        for (int y = 0; y < mapSizeY; y++) { //расположение в ячейке по y
            for (int x = 0; x < mapSizeX; x++) { //расположение в ячейке по x
                if (isEmptyCell(x, y)) {
                    continue;
                }
                if (map[y][x] == human) { // ход человечины
                    g.setColor(Color.green); // например зеленый цвет
                    g.fillOval(x * cellWidth + 10, y * cellHeight + 10, cellWidth - 20, cellHeight - 20); // отрисовка из по расположению в ячейке круга
                }
                if (map[y][x] == ai) { // ход дройда
                    g.setColor(Color.red); // например красный цвет
                    g.fillRect(x * cellWidth + 10, y * cellHeight + 10, cellWidth - 20, cellHeight - 20); // отрисовка из по расположению в ячейке квадрата
                }
            }
        }
        if (gameOver) {
            return;
//            showGameOverMessage();
        }

    }

    private void showGameOverMessage(int stateGameOver) { // метод по выводу победителя
        switch (stateGameOver) {
            case STATE_HUMAN_WIN:
                JOptionPane.showMessageDialog(this, MSG_HUMAN_WIN);
                mainWindow1.putLog(MSG_HUMAN_WIN); // прописывает в лог, что человечина хорош
                break;
            case STATE_AI_WIN:
                JOptionPane.showMessageDialog(this, MSG_AI_WIN);
                mainWindow1.putLog(MSG_AI_WIN); // прописывает в лог, что человечина хорош
                break;
            case STATE_DRAW:
                JOptionPane.showMessageDialog(this, MSG_DRAW);
                mainWindow1.putLog(MSG_DRAW); // прописывает в лог, что оба два
                break;
        }
    }

    private void createMap(Graphics g) { // метод по созданию карты
        int width = getWidth();
        int height = getHeight();

        cellWidth = width / mapSizeX;
        cellHeight = height / mapSizeY;

        g.setColor(Color.white);

        for (int i = 0; i <= mapSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, width, y);
        }

        for (int i = 0; i < mapSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, height);
        }
    }

    private void aiTurn() { // ход дройда чтоб вумным был
        if (turnAIWinCell()) {
            return;
        }
        if (turnHumanWinCell()) {
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        map[y][x] = ai;
        mainWindow1.putLog("AI > [" + (x + 1) + ":" + (y + 1) + "]");
    }

    private boolean turnAIWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = ai;    // поставим нолик в каждую клетку поля по очереди
                    if (checkWin(ai)) {
                        return true;    // если мы выиграли, вернём истину, оставив нолик в выигрышной позиции
                    }
                    map[i][j] = emptyField;    // если нет - вернём обратно пустоту в клетку и пойдём дальше
                }
            }
        }
        return false;
    }

    private boolean turnHumanWinCell() {   // Проверка, выиграет-ли игрок своим следующим ходом
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = human;     // поставим крестик в каждую клетку по очереди
                    if (checkWin(human)) {    // если игрок победит
                        map[i][j] = ai;    // поставить на то место нолик
                        return true;
                    }
                    map[i][j] = emptyField;    // в противном случае вернуть на место пустоту
                }
            }
        }
        return false;
    }

    // проверка на победу
    private boolean checkWin(int player) {
        for (int i = 0; i < mapSizeX; i++) {     // ползём по всему полю
            for (int j = 0; j < mapSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, player)) {
                    return true;    // проверим линию по х
                }
                if (checkLine(i, j, 1, 1, winLength, player)) {
                    return true;    // проверим по диагонали х у
                }
                if (checkLine(i, j, 0, 1, winLength, player)) {
                    return true;    // проверим линию по у
                }
                if (checkLine(i, j, 1, -1, winLength, player)) {
                    return true;    // проверим по диагонали х -у
                }
            }
        }
        return false;
    }

        private boolean checkLine(int x, int y, int vx, int vy, int len, int player) { // проверка линии
        final int farX = x + (len - 1) * vx;    // посчитаем конец проверяемой линии
        final int farY = y + (len - 1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;    // проверим не выйдет-ли проверяемая линия за пределы поля
        }
        for (int i = 0; i < len; i++) {    // ползём по проверяемой линии
            if (map[y + i * vy][x + i * vx] != player) {
                return false;    // проверим одинаковые-ли символы в ячейках
            }
        }
        return true;
    }

    private boolean isFullMap() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (map[i][j] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidCell(int x, int y) { // метод по проверке поля
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    private boolean isEmptyCell(int x, int y) { // метод по проверке поля типа занято али нет
        return map[y][x] == emptyField;
    }

}
