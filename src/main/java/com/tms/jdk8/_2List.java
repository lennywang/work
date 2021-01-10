package com.tms.jdk8;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2021/1/10 21:55
 */

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 **/
public class _2List {
    //java list集合（String字符串）去重的方式：
    //https://www.cnblogs.com/suizhikuo/p/13030641.html

    //Java8集合中的对象去重重复
    //https://blog.csdn.net/u012060033/article/details/103683494

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("111");
        list.add("222");
        list.add("333");

        // Set set = new HashSet();
        // set.addAll(list);
        // list.clear();
        // list.addAll(set);

        //list = list.stream().distinct().collect(Collectors.toList());
        //System.out.println(list);

        List<_PexContentBill> pexContentBillList = getPexContentBillList();
        //pexContentBillList.stream()
        //        .collect(Collectors.toMap(_PexContentBill::getName, Function.identity(), (oldValue, newValue) -> oldValue))
        //        .values()
        //        .stream()
        //        .forEach(System.out::println);

        //pexContentBillList.stream()
        //        .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(_PexContentBill::getId))))
        //        //.values()
        //        .stream()
        //        .forEach(System.out::println);

        //ArrayList<_PexContentBill> distinctList = pexContentBillList.stream()
        //        .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(pexContentBill->
        //                pexContentBill.getName()+"#"+_PexContentBill::getAge))), ArrayList::new));
        //System.out.println(distinctList);

        ArrayList<_PexContentBill> distinctList = pexContentBillList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(pexContentBill->
                        pexContentBill.getName()+"#"+pexContentBill.getAge()))), ArrayList::new));
        System.out.println(distinctList);


    }

    static List<_PexContentBill> getPexContentBillList() {
        List<_PexContentBill> bills = new ArrayList<_PexContentBill>();
        bills.add(new _PexContentBill(1, "123",1));
        bills.add(new _PexContentBill(1, "123",3));
        bills.add(new _PexContentBill(1, "456",3));
        bills.add(new _PexContentBill(2, "123",2));
        bills.add(new _PexContentBill(3, "123",2));
        bills.add(new _PexContentBill(4, "123",4));

        return bills;
    }
}
