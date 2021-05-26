package model;

public class Villa extends Services {
    private String roomStandard;
    private String convenient;
    private float poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, String convenient, float poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String nameServices, float useArea, float rentalCosts, int maxQuantity, String rentalType, String id, String roomStandard, String convenient, float poolArea, int numberOfFloors) {
        super(nameServices, useArea, rentalCosts, maxQuantity, rentalType, id);
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getConvenient() {
        return convenient;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    void showInfor() {
        System.out.println("Tên dịch vụ: " + this.nameServices + " " + "Diện tích: " + this.useArea + " " + "Chi phí: " + this.rentalCosts + " " + "Số lượng người: " + this.maxQuantity + " " + "Kiểu thuê theo: " + this.rentalType + " " + "Mã số: " + this.id + " " + "Tiêu chuẩn phòng: " + this.roomStandard + " " + "Mô tả tiện nghi: " + this.convenient + " " + "Diện tích hồ bơi" + this.poolArea + " " + "Số tầng: " + this.numberOfFloors
        );
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + id + '\'' +

                ", nameServices='" + nameServices + '\'' +
                ", useArea=" + useArea +
                ", rentalCosts=" + rentalCosts +
                ", maxQuantity=" + maxQuantity +
                ", rentalType='" + rentalType + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", convenient='" + convenient + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
