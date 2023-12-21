package continental.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import continental.demo.model.Usuario;

@Service
public class AppService implements IAppService {

    private static List<Usuario> listarUsuario = null;

    public AppService() throws Exception {
        listarUsuario.add(new Usuario("Jose12", "ABC123"));
        listarUsuario.add(new Usuario("Juan2023", "123ABC"));
        listarUsuario.add(new Usuario("Maria23", "ABC123"));
        listarUsuario.add(new Usuario("Pepe20", "123ABC"));
        throw new Exception();
    }

    @Override
    public List<Usuario> listarUsuario() {
        return listarUsuario;
    }

    @Override
    public Usuario buscarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUsuario'");
    }

    @Override
    public void registrarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarUsuario'");
    }

}
