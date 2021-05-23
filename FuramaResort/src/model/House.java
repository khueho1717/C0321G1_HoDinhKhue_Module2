package model;

public class House extends Services {

    private String roomStandard;
    private String convenient;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, String convenient, byte numberOfFloors) {
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String nameServices, float useArea, int rentalCosts, int maxQuantity, String rentalType, String id, String roomStandard, String convenient, int
            numberOfFloors) {
        super(nameServices, useArea, rentalCosts, maxQuantity, rentalType, id);
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getConvenient() {
        return convenient;
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

    public void setNumberOfFloors(byte numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    void showInfor() {
        System.out.println("Tên dịch vụ: "+this.nameServices + " " +"Diện tích"+ this.useArea + " " + "Chi phí: "+this.rentalCosts + " " + "Số lượng người: "+this.maxQuantity + " " + "Kiểu thuê theo: "+this.rentalType + " " + "Mã số: "+this.id+ " " + "Kiểu phòng: "+this.roomStandard + " " +"Mô tả tiện nghi: "+ this.convenient + " " + "Số tầng: "+this.numberOfFloors
        );
    }
}
