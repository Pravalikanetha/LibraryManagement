 to mysqlmypackage library;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Function {
    public void addBook(books book) {
        String sql = "INSERT INTO books (id, title, author) VALUES (?, ?, ?)";
        try (Connection conn = DataConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, book.getId());
            stmt.setString(2, book.getTitle());
            stmt.setString(3, book.getAuthor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<books> getAllBooks() {
        List<books> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try (Connection conn = DataConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                books.add(new books(id, title, author));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}


