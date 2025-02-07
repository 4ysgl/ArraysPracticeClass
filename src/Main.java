//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

         int [] list1={ 1,5,4,5,-5,10,8,6};

        ArraysMetods met=new ArraysMetods();
      /*   met.ListAverage(list1);*/ // dizinin ortalamasını bulma
        /*met.minMaxİndex(list1);*/
        String[][] letter = new String[7][6];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 1 || i==4|| i==3 ) {
                    letter[i][j] = " * ";
                } else if (j == 0  || j==1|| j==4|| j==5 ) {
                    letter[i][j] = " * ";
                }
                else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }


}