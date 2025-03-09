public class bai9 {
    public static void main(String[] args) {
        String[] urls = {
                "https://www.example.com/path/to/page",
                "http://google.com/search?q=java",
                "ftp://invalid.com/file",
                "www.missingprotocol.com",
                "https://openai.com/"
        };

        for (String url : urls) {
            //Dùng .startsWith("http://") hoặc .startsWith("https://") để kiểm tra.
            //hợp lệ
            if (url.startsWith("http://") || url.startsWith("https://")) {
                // Tìm vị trí của "//" để tách giao thức
                int protocolEnd = url.indexOf("//") + 2;
                int domainEnd = url.indexOf("/", protocolEnd);
//Tìm vị trí / sau phần tên miền bằng .indexOf("/", protocolEnd).
//Nếu có /, tên miền là phần từ sau "//" đến /.
//Nếu không có /, toàn bộ phần còn lại là tên miền.
                String protocol = url.substring(0, protocolEnd - 2);
                String domain;
                String path = "";

                if (domainEnd != -1) {
                    domain = url.substring(protocolEnd, domainEnd);
                    path = url.substring(domainEnd);
                } else {
                    domain = url.substring(protocolEnd);
                }

                System.out.println("URL hợp lệ:");
                System.out.println("Giao thức: " + protocol);
                System.out.println("Tên miền: " + domain);
                System.out.println("Đường dẫn: " + (path.isEmpty() ? "Không có" : path));
            } else {
                System.out.println("URL không hợp lệ: " + url);
            }
            System.out.println();
        }
    }
}
