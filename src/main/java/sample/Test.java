package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static List<Product> fetchData() throws SQLException {
        String SQL_QUERY = "SELECT * FROM products";
        List<Product> products = null;
        try (
             Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement( SQL_QUERY );
             ResultSet result = pst.executeQuery();
             ) {
             products = new ArrayList<>();
            while ( result.next() ) {
                Product product = new Product();
                product.setItemCode(result.getString("ItemCode"));
                product.setPrice(result.getInt("ItemPrice"));
                products.add(product);
            }
        }
        return products;
    }

    public static void main(String[] args) {
        try{
            fetchData().forEach(data -> {
                System.out.println(data.toString());
            });
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
}
