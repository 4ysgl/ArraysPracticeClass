//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean isFind(int[]arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args)
    {

         int [] list={ 1,5,4,5,2,4,4,10,8,6};

        ArraysMetods met=new ArraysMetods();
      /*   met.ListAverage(list1);*/ // dizinin ortalamasını bulma
        /*met.minMaxİndex(list1);*/ // dizinin min max bulma



                int[] tekrar=new int[list.length];
                int startIndex=0;
                for (int i=0;i<list.length;i++)
                {
                    for (int j=0;j <list.length;j++)
                    {
                        if ((i!=j)&& (list[i]==list[j]))
                        {
                            if (!isFind(tekrar,list[i]))
                            {
                                tekrar[startIndex++]=list[i];
                            }
                            break;
                        }

                    }
                }

            for (int value:tekrar)
            {
                if (value!=0){
                    System.out.println(value);
                }
            }
            }







    /*    String[][] letter = new String[8][6];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 1 || i==4|| i==3 ) {
                    letter[i][j] = " * ";
                } else if (j == 0  || j==1|| j==5 || j==4) {
                    letter[i][j] = " * ";
                } else {
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
*/

}