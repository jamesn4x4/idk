package arrays;
public class W13_array{
    public static void main(String[] args) {
    // แบบ 1 สําหรับค่าแน่นอน
        String animals[]={"dog","brid","lion"};
        int dice[]={1,2,3,4,5,6};
        float avgScore[]={3.50f,4.00f,2.50f,2.00f};
        System.out.println("animals index 0: "+animals[0]);
        System.out.println("animals index 2: "+animals[2]);
    // หาขนาดarray
    System.out.println("animals length: "+animals.length);
    System.out.println("avagScore: ");
    for(int i=0;i<avgScore.length;i++){
        System.out.println(avgScore[i]);
    }
    // แบบ 2 สําหรับระบุขนาดแล้วใส่ค่าที่หลัง
        String color[] = new String[4];
        color[2] = "red";
        color[0] = "yellow";
        color[3] = "black";
        System.out.println("index color 0,1: "+color[0]+(" ")+color[1]);
        System.out.println("color: ");
        for(int i=0;i<color.length;i++){
        System.out.println("box "+(i+1)+": "+color[i]);
    }
        int score[] = new int[5];
        score[1] = 50;
        System.out.println("color length: "+color.length);
        System.out.println("index score: "+score[3]);
    }
}