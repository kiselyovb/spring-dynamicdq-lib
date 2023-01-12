package com.irontechspace.dynamicdq.executor.export.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExcelStyle {
    private ExcelBorder border;
    private ExcelFont font;
    private String hAlign = null;
    private String vAlign = null;
    private Boolean wrapped = false;
}
