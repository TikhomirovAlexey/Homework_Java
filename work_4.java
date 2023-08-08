// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

public class work_4 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(get_count_jewels(jewels, stones));
    }

    static String get_count_jewels(String jw, String st){
        int [] count_jw = new int [jw.length()];
        for (int i = 0; i < jw.length(); i++) {
            for (int j = 0; j < st.length(); j++) {
                if(st.charAt(j) == jw.charAt(i)){
                    count_jw[i]++;
                }  
            }
        }
        String res = "";
        for (int i = 0; i < jw.length(); i++) {
            res += jw.charAt(i) + Integer.toString(count_jw[i]);
        }
        return res;
    }
}
