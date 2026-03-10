package exercises;

class Books{
    private String ISBN;
    private String title;
    private String author;
    Books(String ISBN,String title,String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    // 打印菜单
    private static void printMenu() {
        System.out.println("\n===== 图书管理系统 =====");
        System.out.println("1. 添加图书");
        System.out.println("2. 删除图书");
        System.out.println("3. 查询图书");
        System.out.println("4. 显示所有图书");
        System.out.println("5. 退出系统");
        System.out.print("请选择操作(1-5): ");
    }
    public static void showMenu(){
        printMenu();
    }
    public String getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
}
public class objArray {
    public static void main(String[] args) {
        Books[] books=new Books[2];
        books[0]=new Books("123ABC ","凄惨世界 ","张三");
        books[1]=new Books("4545 ","adaf ","lisi");
        Books.showMenu();
        for(int i=0;i<books.length;i++){
            System.out.print(books[i].getISBN());
            System.out.print(books[i].getTitle());
            System.out.println(books[i].getAuthor());
        }
    }
}
