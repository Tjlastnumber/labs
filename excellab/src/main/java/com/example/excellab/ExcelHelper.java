package com.example.excellab;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExcelHelper {
    public static void exp(String fileName, List<Map<String, Object>> source) {
        // Write data to Excel file
        EasyExcel.write(fileName + ".xlsx")
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .head(head(source))
                .sheet("Sheet1")
                .doWrite(data(source));
    }

    private static List<List<String>> head(List<Map<String, Object>> source) {
        return source.stream()
                .map(m -> Collections.singletonList(m.get("name").toString()))
                .collect(Collectors.toList());
    }

    private static List<Collection<Object>> data(List<Map<String, Object>> source) {
        return source.stream()
                .map(Map::values)
                .collect(Collectors.toList());
    }
}
