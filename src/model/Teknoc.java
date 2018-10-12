package model;

public class Teknoc {
    public static final char turtleUp = '\u25B3';
    public static final char turtleDown = '\u25BD';
    public static final char turtleRight = '\u25B7';
    public static final char turtleLeft = '\u25C1';
    public static final char penDraw = '\u2593';

    private int x;
    private int y;
    private int direction; // 1=up, 2=right, 3=down, 4=left
    private boolean isPenDown;
    private char previousChar;

    public Map map;

    public Teknoc(int direction, int height, int width) {
        this.x = (width / 2);
        this.y = (height / 2);
        this.direction = direction;
        this.isPenDown = false;
        this.previousChar = '\u2591';

        map = new Map(height, width);
        map.generate(x, y);

    }

    public void goForward(int distance) {
        map.turtleMap[y][x] = (isPenDown ? penDraw : previousChar);
        switch (direction) {
            case 1:
                if (y - distance < 0) {
                    y = 0;
                } else if (y - distance >= map.getHeight()) {
                    y = map.getHeight() - 1;
                } else {
                    y -= distance;
                }
                previousChar = map.turtleMap[y][x];
                map.turtleMap[y][x] = turtleUp;
                break;
            case 2:
                if (x + distance >= map.getWidth()) {
                    x = map.getWidth() - 1;
                } else if (x + distance < 0) {
                    x = 0;
                } else {
                    x += distance;
                }
                previousChar = map.turtleMap[y][x];
                map.turtleMap[y][x] = turtleRight;
                break;
            case 3:
                if (y + distance >= map.getHeight()) {
                    y = map.getHeight() - 1;
                } else if (y + distance < 0) {
                    y = 0;
                } else {
                    y += distance;
                }
                previousChar = map.turtleMap[y][x];
                map.turtleMap[y][x] = turtleDown;
                break;
            case 4:
                if (x - distance < 0) {
                    x = 0;
                } else if (x - distance >= map.getWidth()) {
                    x = map.getWidth() - 1;
                } else {
                    x -= distance;
                }
                previousChar = map.turtleMap[y][x];
                map.turtleMap[y][x] = turtleLeft;
                break;
        }

    }

    public void drawTurtle() {
        switch (direction) {
            case 1:
                map.turtleMap[y][x] = turtleUp;
                break;
            case 2:
                map.turtleMap[y][x] = turtleRight;
                break;
            case 3:
                map.turtleMap[y][x] = turtleDown;
                break;
            case 4:
                map.turtleMap[y][x] = turtleLeft;
                break;
        }
    }

    public void rotateRight() {
        if (direction < 4) {
            direction++;
        } else {
            direction = 1;
        }
        drawTurtle();
    }


    public void rotateLeft() {
        if (direction > 1) {
            direction--;
        } else {
            direction = 4;
        }
        drawTurtle();
    }
    public void penDown() {
        this.isPenDown = true;
    }
    public void penUp() {
        this.isPenDown = false;
    }


    }
