import java.util.regex.Pattern;

public class RegularExpresionDemo {
    public static void main(String[] args) {
        // so Khơps 2 chuỗi biêu thức chính quy (regex và chuỗi đầu vào(input)
        String regex = "(09|03|05) \\d{8}";
        String input1 = "0912345678";
        System.out.println("Kết quả so khớp của regex và input1:" + Pattern.matches(regex, input1));
        String input2 = "087654dd5768";
        System.out.println("Kết quả so khop của regex và input2:" + Pattern.matches(regex, input2));
        String input3 = "0855914029";
        System.out.println("Kết quả so khop của regex và input3:" + Pattern.matches(regex, input3));
        System.out.println("X đại diện cho 1 ký tự x, . đại diện ký tự bất kì:" + Pattern.matches("KS2.B", "KS23B"));
        System.out.println("[abc] là ký tự hoặc a hoặc b hoặc c : " + Pattern.matches("[abcj]ava", "Dava"));
        System.out.println("[a-z] là ký tự a trong khoảng a đến z : " + Pattern.matches("[a-z]ava", "java"));
        System.out.println("p* là 0,1 nhiều ký tự p" + Pattern.matches("a*bc","aaaabc"));
        // viết biểu thức chính quy quy đingj mã sinh viên gồm 2 ký tự đầu là SV hoạc ST, sau đó có tối thiểu 3 số
        // SV001, ST001, SV1000
        String studentRegex = "(SV|ST)\\d{3,]";
        /*
            viết biểu thức chính quy quy định tên định tên sinh viên phải gồm 3 từ
             - trong mỗi từ không có số,
             - mỗi từ có tối thiểu 3 ký tự tối đa 10 ký tự
             - mỗi từ có tối đa 15 ký tụ
             - mỗi từ cách nhau 1 dấu space
             - bắt đầu mỗi từ phải viết hoa
        * */


        String studentNameRegex = "[A-Z]\\w{2,14}\\s[A-Z]\\w{2,14}\\s[A-Z]\\w{2,14}";

    }
}