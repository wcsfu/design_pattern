package com.rui.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class CourseCatalog extends CatelogComponent {

    private List<CatelogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatelogComponent catelogComponent) {
        items.add(catelogComponent);
    }

    @Override
    public void remove(CatelogComponent catelogComponent) {
        items.remove(catelogComponent);
    }

    @Override
    public String getName(CatelogComponent catelogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatelogComponent catelogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catelogComponent.print();
        }
    }
}
