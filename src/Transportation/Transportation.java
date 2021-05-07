package Transportation;

public abstract class Transportation {
    private String id;
    private int no;
    private String name;

    public Transportation() {}

    public Transportation(String id, int no, String name) {
        this.id = id;
        this.no = no;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(this.id.trim().equals(""))
            try{
                throw new Exception("Lỗi: Mã chuyến không hợp lệ!");
            }catch (Exception e){
                e.printStackTrace();
            }
        else this.id=id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double Total();
}