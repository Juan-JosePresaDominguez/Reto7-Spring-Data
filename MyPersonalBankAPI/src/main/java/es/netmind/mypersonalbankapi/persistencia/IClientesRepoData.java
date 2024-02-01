package es.netmind.mypersonalbankapi.persistencia;

import es.netmind.mypersonalbankapi.modelos.clientes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClientesRepoData extends JpaRepository<Cliente, Integer> {

    public Cliente findClienteById(Integer id) throws Exception;

    //@Query("SELECT c FROM Cliente c WHERE c.id LIKE *")
    @Query("SELECT c FROM Cliente c")
    public List<Cliente> getAll() throws Exception;
}
