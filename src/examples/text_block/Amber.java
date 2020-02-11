package examples.text_block;

public class Amber {
    public static void main(String[] args) {
        sql();
    }

    private static void sql() {
        var sql = """
                SELECT column_name,
                  CASE
                    WHEN condition THEN 'Result_1'
                    WHEN condition THEN 'Result_2'
                    ELSE 'Result_3'
                  END
                FROM table_name;
                """;

        System.out.println(sql);
    }
}
