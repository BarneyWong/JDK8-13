package chapter8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VideoOrder> videoOrderList1= Arrays.asList(
                new VideoOrder("20190242812",3,"SpringBoot"),
                new VideoOrder("20194350812",5,"SpringCloud"),
                new VideoOrder("20190814232",9,"redis"),
                new VideoOrder("20190523812",9,"Web"),
                new VideoOrder("201932324",9,"netty")
        );
        List<VideoOrder> videoOrderList2= Arrays.asList(
                new VideoOrder("2019024285312",3,"SpringBoot"),
                new VideoOrder("2019081453232",9,"Redis"),
                new VideoOrder("20190522338312",9,"Web"),
                new VideoOrder("2019435230812",5,"Jmeter"),
                new VideoOrder("2019323542411",7,"Git"),
                new VideoOrder("2019323542424",21,"IDEA")
        );
//        统计出同时被两个人购买的商品列表(交集)
        List<VideoOrder> shared = new ArrayList<>();
        for(VideoOrder videoOrder1:videoOrderList1){
            for(VideoOrder videoOrder2:videoOrderList2){
                if(videoOrder1.getTitle().equals(videoOrder2.getTitle())){
                    shared.add(videoOrder1);
                    break;
                }
            }
        }
        shared.forEach(obj->System.out.println(obj.toString()));



//        统计出两个人购买商品的差集
//        统计出全部被购买商品的去重差集
//        统计出两个人的分别购买订单的平均价格
//        统计出两个人分别购买订单的总价格
    }
}
