package br.com.senactech.NLogin.dao;

/**
 *
 * @author 180900411
 */
public class DAOFactory {

    private static UsuarioDAO usuarioDAO = new UsuarioDAO();

    public static UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }
}
