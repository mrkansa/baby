package com.mark;

public class BabySitter {
    public String baby(Integer placeHolder) {
        if (placeHolder <= 4) // baby awake until end of 1st 4 hours $12/hr
            return String.valueOf(placeHolder * 12);
        return null;
    }
}
