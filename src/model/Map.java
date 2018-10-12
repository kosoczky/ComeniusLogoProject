package model;

public class Map {
    protected char[][] turtleMap;
    private int height;
    private int width;


    public Map (int height, int width) {
        this.height = height;
        this.width = width;
        this.turtleMap = new char[height][width];
    }

    // generating the map
    public void generate(int n, int m){
        for(int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                turtleMap[y][x] = '\u2591';
            }
        }

        // draw the turtle on the map
        turtleMap[m][n] =Teknoc.turtleUp;
    }

    public void print(){
        for(int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                System.out.print(turtleMap[y][x]);
            }
            System.out.println(); //sortores
        }
    }

    public char[][] getTurtleMap() {
        return turtleMap;
    }

    public void setTurtleMap(char[][] turtleMap) {
        this.turtleMap = turtleMap;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
