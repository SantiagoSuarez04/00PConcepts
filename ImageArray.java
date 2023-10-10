import javax.swing.*;

public class ImageArray {
    public static void main(String[] args) {
        int[][] flag = {};
        flag = Venezuela(24,40);
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
}
