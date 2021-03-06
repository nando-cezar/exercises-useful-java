
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 */
public class UsuarioDAO {

    public static Usuario Create(Usuario usuario) throws Exception {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
                
        try {
            String sql = "INSERT INTO usuario (login, nome, email) " + "values (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getEmail());

            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
        return usuario;
    }

    public static List<Usuario> getAll(){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>(); /*Lista usuarios vai armazenar valores que estão em ResultSet*/
        
        try{
            
            stmt = conn.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Usuario usuario = new Usuario();
                
                usuario.setLogin(rs.getString("login"));
                usuario.setNome(rs.getString("nome"));               
                usuario.setEmail(rs.getString("email"));
                
                usuarios.add(usuario); /*Armazenando dados da tabela 'usuario' para lista 'usuarios'*/
            }
            
        }catch (SQLException ex){
            System.out.println("Erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }        
        return usuarios;
    }   
 
}
