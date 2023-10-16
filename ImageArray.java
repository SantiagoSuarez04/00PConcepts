import javax.swing.*;

public class ImageArray {
    public static void main(String[] args) {
        int[][] flag = {};
        flag = Findlandia(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

    }
    public static int [][] createColFlag(int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = Main.color_amarillo;
            }}
            rowIni=(int)(heigth*0.50);
            rowEnd=(int)(heigth*0.75);
            for (int row=rowIni;row<rowEnd;row++){
                for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]= Main.color_azul;
                }}
            rowIni=(int)(heigth*0.75);
            rowEnd= (int)(heigth);
            for (int row=rowIni;row<rowEnd;row++){
                for (int cell=0;cell<flag[row].length;cell++){
                    flag[row][cell]= Main.color_rojo;
                }
            }
        return flag;
    }
    public static int [][] Venezuela (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.33);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = Main.color_amarillo;
            }}
        rowIni=(int)(heigth*0.33);
        rowEnd=(int)(heigth*0.67);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]= Main.color_azul;
            }}
        rowIni=(int)(heigth*0.67);
        rowEnd= (int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]= Main.color_rojo;
            }
        }
        return flag;
    }
    public static int [][] Polonia (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        rowIni=(int)(heigth*0.50);
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
        return flag;
    }
    public static int [][] Panama (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=12;
        for(int row=rowIni;row<rowEnd;row++){
            for(int cell=0;cell<20;cell++){
                flag[row][cell]=Main.color_blanco;
            }
        }
        rowIni=0;
        rowEnd=12;
        for(int row=rowIni;row<rowEnd;row++){
            for(int cell=20;cell<40;cell++){
                flag[row][cell]=Main.color_rojo;
            }
        }
        rowIni=12;
        rowEnd=24;
        for(int row=rowIni;row<rowEnd;row++){
            for(int cell=0;cell<20;cell++){
                flag[row][cell]=Main.color_azul;
            }
        }
        rowIni=12;
        rowEnd=24;
        for(int row=rowIni;row<rowEnd;row++){
            for(int cell=20;cell<40;cell++){
                flag[row][cell]=Main.color_blanco;
            }
        }
        return flag;
    }
    public static int [][] Chile (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<13;cell++) {
                flag[row][cell] = Main.color_azul;
            }}
            rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        rowIni=(int)(heigth*0.50);
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<flag[row].length;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
        return flag;
    }
    public static int [][] EU (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<13;cell++) {
                flag[row][cell] = Main.color_azul;
            }}
        rowIni=0;
        rowEnd=2;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=2;
        rowEnd=4;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
            rowIni=4;
        rowEnd=6;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=6;
        rowEnd=8;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
            rowIni=8;
        rowEnd=10;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=10;
        rowEnd=12;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        rowIni=12;
        rowEnd=14;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=14;
        rowEnd=16;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
            rowIni=16;
        rowEnd=18;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=18;
        rowEnd=20;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
            rowIni=20;
        rowEnd=22;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=22;
        rowEnd=24;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        return flag;
    }
    public static int [][] R_checa (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<flag[row].length;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        rowIni=(int)(heigth*0.50);
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<flag[row].length;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
            rowIni=0;
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<13;cell++){
                flag[row][cell]= Main.color_azul;
            }}
            rowIni=0;
        rowEnd=2;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=2;cell<13;cell++){
                flag[row][cell]= Main.color_blanco;
            }}
            rowIni=2;
        rowEnd=4;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=4;cell<13;cell++){
                flag[row][cell]= Main.color_blanco;
            }}
            rowIni=4;
        rowEnd=6;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=6;cell<13;cell++){
                flag[row][cell]= Main.color_blanco;
            }}
            rowIni=6;
        rowEnd=8;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=8;cell<13;cell++){
                flag[row][cell]= Main.color_blanco;
            }}
            rowIni=8;
        rowEnd=10;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=10;cell<13;cell++){
                flag[row][cell]= Main.color_blanco;
            }}
            rowIni=13;
        rowEnd=15;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=10;cell<13;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
             rowIni=15;
        rowEnd=17;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=8;cell<13;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
             rowIni=17;
        rowEnd=19;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=6;cell<13;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
            rowIni=19;
        rowEnd=21;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=4;cell<13;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
            rowIni=21;
        rowEnd=24;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=2;cell<13;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
        return flag;
    }
    public static int [][] Dinamarca (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<10;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
        rowIni=0;
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=10;cell<13;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        rowIni=(int)(heigth*0.50);
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<10;cell++){
                flag[row][cell]= Main.color_rojo;
            }}
        rowIni=0;
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_rojo;
            }}
            rowIni=10;
        rowEnd=13;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        return flag;
    }
    public static int [][] Findlandia (int heigth, int width){
        int [][] flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd= 0;
        rowIni=0;
        rowEnd=(int)(heigth*0.50);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<10;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
        rowIni=0;
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=10;cell<13;cell++) {
                flag[row][cell] = Main.color_azul;
            }}
        rowIni=(int)(heigth*0.50);
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<10;cell++){
                flag[row][cell]= Main.color_blanco;
            }}
        rowIni=0;
        rowEnd=(int)(heigth);
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=13;cell<40;cell++) {
                flag[row][cell] = Main.color_blanco;
            }}
            rowIni=10;
        rowEnd=13;
        for (int row=rowIni;row<rowEnd;row++){
            for (int cell=0;cell<40;cell++) {
                flag[row][cell] = Main.color_azul;
            }}
        return flag;
    }
}
