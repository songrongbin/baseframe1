package com.bins.guava.collection;

import com.bins.guava.common.Constant;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by songrongbin on 2017/5/13.
 */
public class CollectionUtil {
    /**
     * 将文件列表List转换成String
     * @param files
     * @return
     */
    public static String transferListToString(List<String> files) {
        if (CollectionUtils.isEmpty(files)) {
            return "";
        }
        return Joiner.on(Constant.PICTURE_SPLIT).skipNulls().join(files);
    }

    /**
     * 将String转换成文件列表List
     * @param files
     * @return
     */
    public static List<String> transferStringToList(String files) {
        if (org.springframework.util.StringUtils.isEmpty(files)) {
            return Collections.emptyList();
        }
        return Splitter.on(Constant.PICTURE_SPLIT).trimResults().splitToList(files);
    }

    /**
     * 使用guava工具类来取List集合的差集
     *
     * @param big   大集合
     * @param small 小集合
     * @return 两个集合的差集
     */
    public static List<Integer> getDifferenceSet(List<Integer> big, List<Integer> small) {
        Set<Integer> differenceSet = Sets.difference(Sets.newHashSet(big), Sets.newHashSet(small));
        return Lists.newArrayList(differenceSet);
    }

}
