package com.example.thandiwe.buttomnavigater;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.Serializable;

/**
 * Created by Thandiwe on 2017/08/16.
 */

public class Tour extends Drawable implements Serializable {


    String desceiption, name;
    int image;

    public Tour() {
    }

    @Override
    public void draw(@NonNull Canvas canvas) {

    }

    @Override
    public void setAlpha(@IntRange(from = 0, to = 255) int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public Tour(String desceiption, String name) {
        this.desceiption = desceiption;
        this.name = name;
    }

    public Tour(String desceiption, String name, int image) {
        this.desceiption = desceiption;
        this.name = name;

    }

    public String getDesceiption() {
        return desceiption;
    }

    public void setDesceiption(String desceiption) {
        this.desceiption = desceiption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
