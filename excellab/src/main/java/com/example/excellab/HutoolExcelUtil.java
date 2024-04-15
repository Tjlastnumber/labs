package com.example.excellab;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.util.List;

public class HutoolExcelUtil {

    public static final String DEFAULT_SHEET = "Sheet1";

    public static void main(String[] args) {
        HutoolExcelUtil.exp();
    }

    public static void exp() {
        //通过工具类创建writer
        try (ExcelWriter writer = ExcelUtil.getWriter("./test.xlsx")) {
            //合并单元格后的标题行，使用默认标题样式
            //一次性写出内容，强制输出标题
            writer.write(buildRow(), true);
        }
    }

    private static List<List<Object>> buildRow() {
        List<Object> row1 = CollUtil.newArrayList("法律法规","数量");
        List<Object> row2 =CollUtil.newArrayList("法律1", 1);
        List<Object> row3 =CollUtil.newArrayList("法律2", 2);
        List<Object> row4 =CollUtil.newArrayList("法律3", 3);
        return CollUtil.newArrayList(row1, row2, row3, row4);
    }

}
