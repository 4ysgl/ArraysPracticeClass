public class ArraysMetods
{


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
