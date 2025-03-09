//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class demo {
    public static void main(String[] args) {
//        1. String Imutable - Ko thể thay đổi đc giá trị (String Literal)
//        2 cáh khai báo String
//        C1 : Literal
//        String variableName = "value";
//        C2 : Contructor của lớp String
//        String objName = new String --> object --> reference --> mutable
//        1. Literal
        String str1 = "Rikkei Education";
        String str3 = "PTIT";
        String str4 = "Rikkei Education";
        String str6 = "Rikkei Education";
//        2. Object
        String str2 = new String("Rikkei Education");
        String str5 = new String("Rikkei Education");
//        str2 = "RE";
//        3 Gán str1 = Rikkei Academy
        str1 = "Rikkei Academy";

//        2 cách so sánh chuỗi : == hoặc equals
//        == so sánh tuyệt đối
//        equals so sánh tương đối (giá trị)
        System.out.println("So sánh str4 và str6 : "+(str4 == str6)); // true
        System.out.println("So sánh str4 với str2 : "+(str4 == str2)); // false
        System.out.println("So sánh str2 với str5 : "+(str2 == str5)); // false

//        So sánh với equal
        System.out.println("So sánh với equal");
        System.out.println("So sánh str4 và str6 : "+(str4.equals(str6))); // true
        System.out.println("So sánh str4 với str2 : "+(str4.equals(str2))); // false
        System.out.println("So sánh str2 với str5 : "+(str2.equals(str5))); // false
    }
}