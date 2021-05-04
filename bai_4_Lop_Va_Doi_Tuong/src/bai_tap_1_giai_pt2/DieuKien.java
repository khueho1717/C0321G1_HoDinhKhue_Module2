package bai_tap_1_giai_pt2;

public class DieuKien {
    PTBac2 pt=new PTBac2();
    public void nhapPt(){
        pt.nhapPT();
    }
    public void kiemTra(){
        if (pt.getA()==0){
            if (pt.getB()==0){
                System.out.println("phương trình vô nghiệm");
            }else {
                System.out.println("phương trình có nghiệm duy nhất: "+pt.getRootOnly());
            }
        }else {
            if (pt.getDiscriminant()<0){
                System.out.println("phương trình vô nghiệm");
            }else {
                if (pt.getDiscriminant()==0){
                    System.out.println("phương trình có nghiệm kép: "+pt.getRootDouble());
                }else {
                    System.out.println("phương trình có hai nghiệm phân biệt");
                    System.out.println("x1: "+pt.getRoot1());
                    System.out.println("x2: "+pt.getRoot2());
                }
            }
        }
    }
}
