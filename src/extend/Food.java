package extend;

import java.text.SimpleDateFormat;
import java.util.Date;//java.sql.Date--jdbc用的

public class Food extends Product {


    private Date expireDate;

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        description = description +",到期日："+format.format(expireDate);
        return description;
    }
}
