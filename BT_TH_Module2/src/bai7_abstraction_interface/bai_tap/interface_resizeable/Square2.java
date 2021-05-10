package bai7_abstraction_interface.bai_tap.interface_resizeable;

import bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc.Square;

public class Square2 extends Square implements Resizeable {
    @Override
    public double rezise(double percent) {
        return this.getSide()*(1+percent/100);
    }
}
