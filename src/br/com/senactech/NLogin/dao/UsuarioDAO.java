
package br.com.senactech.NLogin.dao;

import br.com.senactech.NLogin.conexao.Conexao;
import br.com.senactech.NLogin.model.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author 180900411
 */
public class UsuarioDAO {

    public void cadUsuario(Usuario uVO) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();

        try {
            String sql;
            sql = "INSERT INTO usuario VALUES (null, "
                    + "'" + uVO.getNomeUsuario() + "', "
                    + "'" + uVO.getUsuario() + "', "
                    + "'" + uVO.getSenha() + "');";

            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir usuario.\n" + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }

    public Usuario getByUsuario(String usuario) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();

        Usuario novoUsuario = new Usuario();

        try {
            String sql;
            sql = "SELECT * FROM usuario WHERE usuario = '" + usuario + "'";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                novoUsuario.setIdUsuario(rs.getInt("idUsuario"));
                novoUsuario.setNomeUsuario(rs.getString("nomeUsuario"));
                novoUsuario.setUsuario(rs.getString("usuario"));
                novoUsuario.setSenha(rs.getString("senha"));
            }
        } catch (SQLException e) {
            throw new SQLException("Usuário não existe.\n" + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }

        return novoUsuario;
    }
}