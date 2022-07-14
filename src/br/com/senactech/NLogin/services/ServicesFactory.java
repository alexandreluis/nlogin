
package br.com.senactech.NLogin.services;

/**
 *
 * @author 180900411
 */
public class ServicesFactory {

    private static UsuarioServices usuarioServices = new UsuarioServices();

    public static UsuarioServices getUsuarioServices() {
        return usuarioServices;
    }
}