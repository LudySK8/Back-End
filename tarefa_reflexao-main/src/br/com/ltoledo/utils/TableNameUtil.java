package br.com.ltoledo.utils;

import br.com.ltoledo.annotations.TableName;

/**
 * @author ludmyla.toledo
 */
public class TableNameUtil {

    public static String getTableName(Class<?> clazz) {
        TableName tableNameAnnotation = clazz.getAnnotation(TableName.class);
        if (tableNameAnnotation != null) {
            return tableNameAnnotation.value();
        } else {
            return null;
        }
    }
}
