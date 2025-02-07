
import java.util.Arrays;

public class ArraysMetods
{

    void minMaxİndex(int[] list)
    {   int min=list[0];
        int max=list[0];
        int minIndex=0;
        int maxIndex=0;

        // dizi içerisindeki min ve max degerleri bulma
      /*  for (int i:list)
        {   // forech ile
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;
            }
        }*/
for (int i=1;i<list.length;i++)
{
    if (list[i]<min){
        min=list[i];
        minIndex=i;

    }
    if (list[i]>max)
    {
        max=list[i];
        maxIndex=i;
    }
}
        System.out.println(min+" EN KÜÇÜK VE İNDEX  "+minIndex);
        System.out.print(max+" EN BUYUK VE İNDEX  "+maxIndex);
    }









    // Dizideki Elemanların Ortalamasını Hesaplayan method 
    void ListAverage(int[] list)
    { int sum=0;
for (int i=0;i<list.length;i++)
        {
           sum+=list[i];
        }
int average=sum/list.length;
        System.out.println("DİZİNİN ORTALAMASI  : "+average);
    }


}
