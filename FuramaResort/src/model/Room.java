package model;

public class Room extends Services {
    private String freeServiceIncludes;

    public Room(String string, float v, float parseFloat, int i, String s, String string1, String s1, String string2, float aFloat, int parseInt) {
    }

    public Room(String freeServiceIncludes) {
        this.freeServiceIncludes = freeServiceIncludes;
    }

    public Room(String nameServices, float useArea, float rentalCosts, int maxQuantity, String rentalType, String id, String freeServiceIncludes) {
        super(nameServices, useArea, rentalCosts, maxQuantity, rentalType, id);
        this.freeServiceIncludes = freeServiceIncludes;
    }

    public String getFreeServiceIncludes() {
        return freeServiceIncludes;
    }

    public void setFreeServiceIncludes(String freeServiceIncludes) {
        this.freeServiceIncludes = freeServiceIncludes;
    }

    @Override
    public String toString() {
        return "Room{" +

                "nameServices='" + nameServices + '\'' +
                ", useArea=" + useArea +
                ", rentalCosts=" + rentalCosts +
                ", maxQuantity=" + maxQuantity +
                ", rentalType='" + rentalType + '\'' +
                ", id='" + id + '\'' +
                ", freeServiceIncludes='" + freeServiceIncludes +
                '}';
    }

    @Override
    void showInfor() {
        System.out.println("Tên dịch vụ: "+this.nameServices + " " +"Diện tích"+ this.useArea + " " + "Chi phí: "+this.rentalCosts + " " + "Số lượng người: "+this.maxQuantity + " " + "Kiểu thuê theo: "+this.rentalType + " " + "Mã số: "+this.id+ " " +"Dịch vụ lèm theo: "+this.freeServiceIncludes);
    }
}
