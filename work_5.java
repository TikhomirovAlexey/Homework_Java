// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”


public class work_5 {
    public static void main(String[] args) {
        String str = "cba";
        int[] index = new int[] {3,2,1};
        String result = get_replace_str(str, index);
        System.out.println(result);
    }

    static String get_replace_str(String s, int[] ind){
        String[] res_list = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res_list[ind[i] - 1] = Character.toString(s.charAt(i));
        }
        String tmp_res = String.join("", res_list);
        return tmp_res;
    }
}
