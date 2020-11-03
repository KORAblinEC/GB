package lesson2;

public class MainClass {
    public static void main(String[] args) {
        int x=4;
        int y=4;
        int result=0;

        String [][] array = new String[x][y];
        array[0][0] = "1";
        array[0][1] = "0";
        array[0][2] = "3";
        array[0][3] = "0";
        array[1][0] = "0";
        array[1][1] = "0";
        array[1][2] = "0";
        array[1][3] = "0";
        array[2][0] = "0";
        array[2][1] = "0";
        array[2][2] = "0";
        array[2][3] = "0";
        array[3][0] = "0";
        array[3][1] = "0";
        array[3][2] = "0";
        array[3][3] = "0";

        try {
            result = analyze(array);
            System.out.println("Результат суммирования элементов массива равна " + result);
        } catch(lesson2.MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(lesson2.MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {

            System.out.println("=======================");
        }

        System.out.println("Работа программы завершена");
    }

    public static int analyze(String[][] array) throws lesson2.MyArraySizeException, lesson2.MyArrayDataException {

        int summ = 0;
        int value = 0;

        if(array.length != 4 || array[0].length != 4 || array[1].length != 4) {
            throw new lesson2.MyArraySizeException();
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                try{
                    value = Integer.parseInt(array[i][j]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = "в "+ i +" ряду, "+ j +" ячейке";
                    throw new lesson2.MyArrayDataException(message);
                }
            }
        }
        return summ;
    }
}

