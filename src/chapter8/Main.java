package chapter8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<VideoOrder> videoOrderList1 = Arrays.asList(
                new VideoOrder("20190242812", 3, "SpringBoot"),
                new VideoOrder("20194350812", 5, "SpringCloud"),
                new VideoOrder("20190814232", 9, "Redis"),
                new VideoOrder("20190523812", 9, "Web"),
                new VideoOrder("201932324", 9, "netty")
        );
        List<VideoOrder> videoOrderList2 = Arrays.asList(
                new VideoOrder("2019024285312", 3, "SpringBoot"),
                new VideoOrder("2019081453232", 9, "Redis"),
                new VideoOrder("20190522338312", 9, "Web"),
                new VideoOrder("2019435230812", 5, "JMeter"),
                new VideoOrder("2019323542411", 7, "Git"),
                new VideoOrder("2019323542424", 21, "IDEA")
        );
//        统计出同时被两个人购买的商品列表(交集)
        List<VideoOrder> shared = new ArrayList<>();
        for (VideoOrder videoOrder1 : videoOrderList1) {
            for (VideoOrder videoOrder2 : videoOrderList2) {
                if (videoOrder1.getTitle().equals(videoOrder2.getTitle())) {
                    shared.add(videoOrder1);
                    break;
                }
            }
        }
        shared.forEach(obj -> System.out.println(obj.toString()));
        List<VideoOrder> intersectionList = videoOrderList1.stream().filter(obj -> videoOrderList2.contains(obj)).collect(Collectors.toList());
        intersectionList.forEach(obj -> System.out.println(obj.toString()));


        //统计出两个人购买商品的差集
        List<VideoOrder> diffVOList1 = videoOrderList1.stream().filter(obj -> !videoOrderList2.contains(obj)).collect(Collectors.toList());
        diffVOList1.forEach(obj -> System.out.println(obj.toString()));
        List<VideoOrder> diffVOList2 = videoOrderList2.stream().filter(obj -> !videoOrderList1.contains(obj)).collect(Collectors.toList());
        diffVOList2.forEach(obj -> System.out.println(obj.toString()));
        //统计出全部被购买商品的去重并集
        List<VideoOrder> allVOList = videoOrderList1.parallelStream().collect(Collectors.toList());
        allVOList.addAll(videoOrderList2);
        allVOList.stream().sorted().forEach(obj -> System.out.println(obj));
        List<VideoOrder> allVOListDistinct = allVOList.parallelStream().distinct().collect(Collectors.toList());
        allVOListDistinct.stream().sorted().forEach(obj -> System.out.println(obj));
        //统计出两个人的分别购买订单的平均价格
        Double averagePrice_1 = videoOrderList1.stream().collect(Collectors.averagingInt(VideoOrder::getMoney));
        System.out.println(averagePrice_1);
        Double averagePrice_2= videoOrderList2.stream().collect(Collectors.averagingInt(VideoOrder::getMoney)).doubleValue();
        System.out.println(averagePrice_2);
        //统计出两个人分别购买订单的总价格
        int sum = videoOrderList1.stream().collect(Collectors.summingInt(VideoOrder::getMoney)).intValue();
        System.out.println(sum);
        int sum2 =videoOrderList2.stream().collect(Collectors.summingInt(VideoOrder::getMoney)).intValue();
        System.out.println(sum2);

    }
}
