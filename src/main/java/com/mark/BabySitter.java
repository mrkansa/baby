package com.mark;

public class BabySitter {
    public String baby(Integer placeHolder) {
        if (placeHolder <= 4) // baby awake until end of 1st 4 hours $12/hr
            return String.valueOf(placeHolder * 12);
        else if (placeHolder == 5)  //9:00 pm until midnight earns $8/hr plus $60 from 1st shift
            return String.valueOf(48 + 8);
        else if (placeHolder == 6)  //9:00 pm until midnight earns $8/hr plus $60 from 1st shift
            return String.valueOf(56 + 8);
        else if (placeHolder == 7)  //9:00 pm until midnight earns $8/hr plus $60 from 1st shift
            return String.valueOf(64 + 8);
        return null;
    }
}
