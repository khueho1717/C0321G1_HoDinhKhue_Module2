package bai7_abstraction_interface.bai_tap.interface_resizeable;

import bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc.Rectangle;

public class Rectangle2 extends Rectangle implements Resizeable {
    @Override
    public double rezise(double percent) {
        return percent;
    }
}
