package continental.demo.service;

import java.util.List;

import continental.demo.model.Usuario;

public interface IAppService {
    
    List<Usuario> listarUsuario();

    Usuario buscarUsuario();

    void registrarUsuario();
}
