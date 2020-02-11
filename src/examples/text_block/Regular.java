package examples.text_block;

public class Regular {
    public static void main(String[] args) {
        sql();
    }

    private static void sql() {
        var sql = "SELECT column_name,\n" +
                  "  CASE\n" +
                  "    WHEN condition THEN 'Result_1'\n" +
                  "    WHEN condition THEN 'Result_2'\n" +
                  "    ELSE 'Result_3'\n" +
                  "  END\n" +
                  "FROM table_name;";

        System.out.println(sql);
    }
}
