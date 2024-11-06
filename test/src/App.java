import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, List<Integer>> dict_num = new HashMap<>();
        for (int i=1; i<5001;i++){
            int number = i;
            int sum = i;
            while(number>0){
                sum+=number%10;
                number/=10;
                
            }
            dict_num.computeIfAbsent(sum, k->new ArrayList<>()).add(i);
        }
        int sum_total = 0;
        for (int i=1; i<5000;i++){
            if (dict_num.containsKey(i)){
                continue;
                
            }
            else{
                sum_total+=i;
            }
        }
        System.out.println("Hasil penjumlahan kelompok self-numbers dari rentang bilangan 1 sampai dengan 5000 adalah "+sum_total);

    }
}
