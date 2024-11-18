package br.com.ltoledo;

import br.com.ltoledo.models.MyTable;
import br.com.ltoledo.utils.TableNameUtil;

/**
 * @author ludmyla.toledo
 */
public class Main {

    public static void main(String[] args) {
        Class<?> clazz = MyTable.class;
        String tableName = TableNameUtil.getTableName(clazz);

        if (tableName != null) {
            System.out.println("Table name: " + tableName);
        } else {
            System.out.println("No table name found");
        }
    }
}
