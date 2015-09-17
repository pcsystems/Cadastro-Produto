package DataAccess;
import MetaData.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tiagoo
 */
public class ClienteDAO implements Assinatura<Cliente> {

    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    
    public ClienteDAO() throws Exception {
        conn = ConectaBd.OpenConnection();
    }
    
    @Override
    public void Insert(Cliente item) throws Exception {
        String sql = "INSERT INTO cliente(nome,cpf,telefone,data) VALUES(?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, item.getNome());
        ps.setInt(2, item.getCpf());
        ps.setInt(3, item.getTelefone());
        ps.setString(4, item.getData());
        ps.executeUpdate();
        conn.close();

    }
    @Override
    public void Update(Cliente item) throws Exception {
        String sql = "UPDATE cliente SET nome =?, cpf=?, telefone=?, data=? where codigo =?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, item.getNome());
        ps.setInt(2, item.getCpf());
        ps.setInt(3, item.getTelefone());
        ps.setString(4, item.getData());
        ps.setInt(5, item.getCodigo());
        ps.executeUpdate();
        conn.close();
    }
    @Override
    public void Delete(Cliente item) throws Exception {
        String sql = "DELETE FROM cliente WHERE codigo =?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, item.getCodigo());
        ps.executeUpdate();
        conn.close();
    }
    @Override
    public List<Cliente> GetAll() throws Exception {
        String sql = "SELECT * FROM cliente";
        ps = conn.prepareStatement(sql);
        List<Cliente> lst = new ArrayList<>();
        rs = ps.executeQuery();
        while (rs.next()) {
            Cliente c = new Cliente();
            c.setCodigo(rs.getInt("codigo"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getInt("cpf"));
            c.setTelefone(rs.getInt("telefone"));
            c.setData(rs.getString("data"));
            lst.add(c);
        }
        return lst;
    }
    @Override
    public Cliente Get(int id) throws Exception {
        Cliente c = null;
        String sql = "select * from cliente where codigo =?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        while (rs.next()) {
            c = new Cliente();
            c.setCodigo(rs.getInt("codigo"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getInt("cpf"));
            c.setTelefone(rs.getInt("telefone"));
            c.setData(rs.getString("data"));
        }
        return c;
    }
    public List<Cliente> getClienteItem(String item) throws Exception {
        String sql = "SELECT * FROM cliente WHERE UPPER(nome)LIKE UPPER(?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + item + "%");
        List<Cliente> lst = new ArrayList<>();
        rs = ps.executeQuery();
        while (rs.next()) {
            Cliente c = new Cliente();
            c.setCodigo(rs.getInt("codigo"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getInt("cpf"));
            c.setTelefone(rs.getInt("telefone"));
            c.setData(rs.getString("data"));
            lst.add(c);
        }
        return lst;
    }
}
