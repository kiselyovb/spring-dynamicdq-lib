package com.irontechspace.dynamicdq.configurator.save.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveLogic {

    // Какое поле обрабатываем
    private String fieldType;
    private String fieldName;

    // Параметры сохранения
    private String primaryKey;
    private String tableName;
    private Boolean autoGenerateCode;
    private Boolean excludePrimaryKey;

    // Список полей которые надо сохранить
    private List<SaveField> fields;

    // Вложенные объекты логики сохранения
    private List<SaveLogic> children;
}
