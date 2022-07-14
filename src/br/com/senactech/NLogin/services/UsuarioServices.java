
package br.com.senactech.NLogin.services;

import br.com.senactech.NLogin.dao.DAOFactory;
import br.com.senactech.NLogin.dao.UsuarioDAO;
import br.com.senactech.NLogin.model.Usuario;
import java.sql.SQLException;

/**
 *
 * @author 180900411
 */
public class UsuarioServices {
    //private UsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
    public void cadastraUsuario(Usuario uVO) throws SQLException
    {
        UsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
        usuarioDAO.cadUsuario(uVO);
    }
    
    public Usuario getByUsuario(String user) throws SQLException
    {
        UsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
        return usuarioDAO.getByUsuario(user);
    }
    
}
