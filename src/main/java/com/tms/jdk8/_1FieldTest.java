package com.tms.jdk8;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2021/1/10 21:29
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 **/
public class _1FieldTest {
    //java8 从对象集合中取出某个字段的集合
    //https://www.cnblogs.com/yangzhenlong/p/7007257.html

    public static void main(String[] args) {
        List<P> list = Arrays.asList(new P(1, "哈哈"), new P(2, "嘿嘿"), new P(3, "哈哈"));
        List<String> names = list.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(names);
    }
}
