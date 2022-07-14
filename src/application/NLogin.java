package application;

import br.com.senactech.NLogin.model.Usuario;
import br.com.senactech.NLogin.services.ServicesFactory;
import br.com.senactech.NLogin.services.UsuarioServices;
import br.com.senactech.NLogin.view.GUILogin;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class NLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException, UnsupportedEncodingException
    {
        GUILogin login = new GUILogin();
        login.setVisible(true);
        /*
        Scanner ler = new Scanner(System.in);
        Usuario usuario = new Usuario();
        UsuarioServices usuarioServices = ServicesFactory.getUsuarioServices();
        
        System.out.println("Login");
        System.out.println("Informe o nome: ");
        usuario = usuarioServices.getByUsuario(ler.next());
        
        System.out.println("Informe a senha: ");
        String senha = geraSenha(ler.next());
        
        if(senha.equals(usuario.getSenha()))
        {
            System.out.println("\n Usuario logado com sucesso. \n");
        }else
        {
            System.out.println("\n Usuario ou senha inválidos.\n");
        }
        */
        
        /*
        usuario.setNomeUsuario("Jair3".toUpperCase());
        usuario.setUsuario("jferraz3".toLowerCase());
        usuario.setSenha(geraSenha("senhaJair3"));
        
        usuarioServices.cadastraUsuario(usuario);
        
        System.out.println(usuarioServices.getByUsuario("jferraz").getNomeUsuario());
        */
    }

    public static String geraSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
        byte mdByteMD5[] = mdMD5.digest(senha.getBytes("UTF-8"));
        
        StringBuilder hexMDMD5 = new StringBuilder();
        for (byte b : mdByteMD5) {
            hexMDMD5.append(String.format("%02X", 0xFF & b));
        }
        
        String senhaMD5HashHex = hexMDMD5.toString();

        return senhaMD5HashHex;
    }
}