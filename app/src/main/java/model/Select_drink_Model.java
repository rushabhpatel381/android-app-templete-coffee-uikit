package model;

/**
 * Created by wolfsoft4 on 9/8/18.
 */

public class Select_drink_Model {
    Integer imgespresso,imgrightarrow;
    String txtespresso;

    public Integer getImgespresso() {
        return imgespresso;
    }

    public void setImgespresso(Integer imgespresso) {
        this.imgespresso = imgespresso;
    }

    public Integer getImgrightarrow() {
        return imgrightarrow;
    }

    public void setImgrightarrow(Integer imgrightarrow) {
        this.imgrightarrow = imgrightarrow;
    }

    public String getTxtespresso() {
        return txtespresso;
    }

    public void setTxtespresso(String txtespresso) {
        this.txtespresso = txtespresso;
    }

    public Select_drink_Model(Integer imgespresso, Integer imgrightarrow, String txtespresso) {
        this.imgespresso = imgespresso;
        this.imgrightarrow = imgrightarrow;
        this.txtespresso = txtespresso;


    }
}
