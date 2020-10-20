package Day16;


public class Record {
    @Field_Method_Oarameter_Annotation(describe = "编号", type = int.class)
    //注释字段
    int id;
    @Field_Method_Oarameter_Annotation(describe = "姓名", type = String.class)
    String name;

    @Constructor_Annotation()
    //采用默认值构造方法
    public Record() {

    }

    @Constructor_Annotation("立即初始化构造方法")
    public Record(@Field_Method_Oarameter_Annotation(describe = "编号", type = int.class) int id,
                  @Field_Method_Oarameter_Annotation(describe = "姓名", type = int.class) String name) {
        this.id = id;
        this.name = name;
    }

    @Field_Method_Oarameter_Annotation(describe = "获取编号", type = int.class)
    public int getID() {
        return id;
    }

    @Field_Method_Oarameter_Annotation(describe = "设置编号")
    public void setId(@Field_Method_Oarameter_Annotation(describe = "编号", type = int.class) int id) {
        this.id = id;
    }

    @Field_Method_Oarameter_Annotation(describe = "获取姓名", type = String.class)
    public String getName() {
        return name;
    }

    @Field_Method_Oarameter_Annotation(describe = "设置姓名")
    public void setName(@Field_Method_Oarameter_Annotation(describe = "姓名", type = String.class) String name) {
        this.name = name;
    }
}
