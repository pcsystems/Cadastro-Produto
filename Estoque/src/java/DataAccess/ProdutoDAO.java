package DataAccess;

import MetaData.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements Assinatura<Produto> {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    
    public ProdutoDAO() throws Exception {
        
        conn = ConectaBd.OpenConnection();
        
    }
    
    @Override
    public void Insert(Produto item) throws Exception {
        String sql = "INSERT INTO produto(descricao,qtd,preco,valor,data) VALUES(?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, item.getDescricao());
        ps.setInt(2, item.getQtd());
        ps.setDouble(3, item.getPreco());
        ps.setDouble(4, item.getValor());
        ps.setString(5, item.getData());
        ps.executeUpdate();
        conn.close();
    }
    
    @Override
    public void Update(Produto item) throws Exception {
        String sql = "UPDATE produto SET descricao=?, qtd=?, preco=?, valor=?, data=? where codigo =?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, item.getDescricao());
        ps.setInt(2, item.getQtd());
        ps.setDouble(3, item.getPreco());
        ps.setDouble(4, item.getValor());
        ps.setString(5, item.getData());
        ps.setInt(6, item.getCodigo());
        ps.executeUpdate();
        conn.close();
    }
    
    @Override
    public void Delete(Produto item) throws Exception {
        String sql = "DELETE FROM produto WHERE codigo =?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, item.getCodigo());
        ps.executeUpdate();
        conn.close();
    }
    
    @Override
    public List<Produto> GetAll() throws Exception {
        String sql = "SELECT * FROM produto";
        ps = conn.prepareStatement(sql);
        List<Produto> lista = new ArrayList<>();
        rs = ps.executeQuery();
        while (rs.next()) {
            Produto p = new Produto();
            p.setCodigo(rs.getInt("codigo"));
            p.setDescricao(rs.getString("descricao"));
            p.setQtd(rs.getInt("qtd"));
            p.setPreco(rs.getDouble("preco"));
            p.setValor(rs.getDouble("valor"));
            p.setData(rs.getString("data"));
            lista.add(p);
        }
        return lista;
    }
    
    @Override
    public Produto Get(int id) throws Exception {
        Produto produto = null;
        String sql = "SELECT * FROM produto WHERE codigo =?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            produto = new Produto();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setQtd(rs.getInt("qtd"));
            produto.setPreco(rs.getDouble("preco"));
            produto.setValor(rs.getDouble("valor"));
            produto.setData(rs.getString("data"));
        }
        return produto;
    }
    
    public List<Produto> getProdutoItem(String item) throws Exception {
        String sql = "SELECT * FROM produto WHERE UPPER(descricao)LIKE UPPER(?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + item + "%");
        List<Produto> lista = new ArrayList<>();
        rs = ps.executeQuery();
        while (rs.next()) {
            Produto produto = new Produto();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setQtd(rs.getInt("qtd"));
            produto.setPreco(rs.getDouble("preco"));
            produto.setValor(rs.getDouble("valor"));
            produto.setData(rs.getString("data"));
            lista.add(produto);
        }
        return lista;
    }
    
}
