package chapter8;

import java.util.Objects;

public class VideoOrder implements Comparable {
    private String tradeNo;
    private int money;
    private String title;

    public VideoOrder() {
    }

    public VideoOrder(String tradeNo, int money, String title) {
        this.tradeNo = tradeNo;
        this.money = money;
        this.title = title;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof  VideoOrder){
           VideoOrder videoOrder = (VideoOrder)o;
           return title.equals(videoOrder.title);
       }
       return super.equals(o);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "tradeNo='" + tradeNo + '\'' +
                ", money=" + money +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return this.title.compareTo(((VideoOrder)o).getTitle());

    }
}
