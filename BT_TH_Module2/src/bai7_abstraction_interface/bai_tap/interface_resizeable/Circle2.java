package bai7_abstraction_interface.bai_tap.interface_resizeable;

import bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc.Circle;

public class Circle2 extends Circle implements Resizeable {
    
    public Circle2(double v) {
    }

    @Override
    public double rezise(double percent) {
        return percent;
    }
}
